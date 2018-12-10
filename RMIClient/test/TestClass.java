/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import rmi.AuthenticationInterface;

/**
 *
 * @author KarimK
 */
public class TestClass {
    
    private static AuthenticationInterface auth;
    
    public TestClass() {
    }
    
    @Test
    public void testRegisterAsCustomer() {
        try {            
            boolean result = auth.registerAsCustomer(100, 100, 100, "Karim", "Khaled", "Karim@bue.edu.eg", "Karim", "Beymot");

            assertEquals(true, result);
}       
        catch (Exception ex)
            {
                System.out.println("Exception " + ex.toString());
            }
    }
    
    @Test
    public void testRegisterAsEventManager() {
        
        try {            
            boolean result = auth.registerAsEventManager(200, 200, "Nada", "Fahmy", "Mai131883@bue.edu.eg", "Nada", "Bati5a");

            assertEquals(true, result);
}       
        catch (Exception ex)
            {
                System.out.println("Exception " + ex.toString());
            }
    }
    
    
    
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        try {
            Registry r = LocateRegistry.getRegistry(1099);
            auth = (AuthenticationInterface) r.lookup("auth");
        } catch (Exception e){
            System.out.println("Exception " + e.toString());
        }
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
