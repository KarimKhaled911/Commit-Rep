/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import javax.swing.JOptionPane;

/**
 *
 * @author KarimK
 */
public class ApplicationClient {

    
    private static Home Home;
    private static Register Register;
    private static Login Login;
    private static EventManagerRegister EventManagerRegister;
    private static CustomerFeatures CustomerFeatures;
    private static EventManagerFeatures EventManagerFeatures;
    private static AdminPanel AdminFeatures;
    
    
    private static AuthenticationInterface auth;
    public static int customerCount = 1;
    public static int EventManagerCount = 1;
    public static int userCount = 1;
    
    public static void main(String[] args) {
        
        initHome();
        initRegister();
        initLogin();
        
        Home.setVisible(true);
        
        try {
            Registry r = LocateRegistry.getRegistry(1099);
            auth = (AuthenticationInterface) r.lookup("auth");
        } catch (Exception e){
            System.out.println("Exception " + e.toString());
        }
    }
    
    
    
    public static void initHome()
    {
        Home = new Home();
        Home.setLocationRelativeTo(null);
        Home.getRegisterNavButton().addActionListener(new RegisterNavButtonListener());
        Home.getLoginNavButton().addActionListener(new LoginNavButtonListener());
        Home.getEventManagerRegisterButton().addActionListener(new EventManagerRegisterNavButton());
    }
    
    public static void initRegister()
    {
        Register = new Register();
        Register.setLocationRelativeTo(null);
        Register.getRegisterButton().addActionListener(new RegisterButtonListener());
        Register.getLoginNavButton().addActionListener(new LoginNavButtonListener());
    }
    
    public static void initLogin()
    {
        Login = new Login();
        Login.setLocationRelativeTo(null);
        Login.getRegisterNavButton().addActionListener(new RegisterNavButtonListener());
        Login.getLoginButton().addActionListener(new LoginButtonListener());
    }
    
    public static void initEventManagerRegister()
    {
        EventManagerRegister = new EventManagerRegister();
        EventManagerRegister.setLocationRelativeTo(null);
        EventManagerRegister.getRegisterButton().addActionListener(new EventManagerRegisterButtonListener());
        EventManagerRegister.getLoginNavButton().addActionListener(new LoginNavButtonListener());
    }
    
    public static void initCustomerFeatures()
    {
        CustomerFeatures = new CustomerFeatures();
        CustomerFeatures.setLocationRelativeTo(null);
    }
    
    public static void initEventManagerFeatures()
    {
        EventManagerFeatures = new EventManagerFeatures();
        EventManagerFeatures.setLocationRelativeTo(null);
    }
    
    public static void initAdminFeatures()
    {
        AdminFeatures = new AdminPanel();
        AdminFeatures.setLocationRelativeTo(null);
    }
    
    
    
    
    
    
    
    
    
    
    
    static class EventManagerRegisterNavButton implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            Login.dispose();
            initEventManagerRegister();
            EventManagerRegister.setVisible(true);
        }
    }
    
    
    
    
    static class RegisterNavButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            Login.dispose();
            initLogin();
            Register.setVisible(true);
        }

    }
    
    
    static class LoginNavButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            Register.dispose();
            initRegister();
            Login.setVisible(true);
        }

    }
    
    
    static class RegisterButtonListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            try {
                String firstName = Register.getFirstName();
                String lastName = Register.getLastName();
                String Email = Register.getEmail();
                String Username = Register.getUsername();
                String Password = Register.getPassword();
                
                boolean result = auth.registerAsCustomer(customerCount, 0, userCount, firstName, lastName, Email, Username, Password);
                
                if (result = false)
                    JOptionPane.showMessageDialog(null, "Username already exists, Please try again");
                else
                {
                    userCount++;
                    customerCount++;
                    
                    JOptionPane.showMessageDialog(null, "Registered successfully, Please Login");
                    Register.dispose();
                    initRegister();
                    Login.setVisible(true);
                }
                
                
            } catch (Exception ex)
            {
                System.out.println("Exception " + ex.toString());
            }
        }
        
    }
    
    
    
    static class EventManagerRegisterButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            try {
                String firstName = EventManagerRegister.getFirstName();
                String lastName = EventManagerRegister.getLastName();
                String Email = EventManagerRegister.getEmail();
                String Username = EventManagerRegister.getUsername();
                String Password = EventManagerRegister.getPassword();
                
                boolean result = auth.registerAsEventManager(EventManagerCount, userCount, firstName, lastName, Email, Username, Password);
                
                if (result = false)
                    JOptionPane.showMessageDialog(null, "Username Exists, Please try again");
                else
                {
                    userCount++;
                    EventManagerCount++;
                    
                    JOptionPane.showMessageDialog(null, "Registered successfully, Please Login");
                    Register.dispose();
                    initRegister();
                    Login.setVisible(true);
                }
                
                
            } catch (Exception ex)
            {
                System.out.println("Exception " + ex.toString());
            }
        }
        
    }
    
    
    
    static class LoginButtonListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            try {
                String username = Login.getUsername();
                String password = Login.getPassword();
                
                User u = auth.login(username, password);
                
                if(u == null)
                    JOptionPane.showMessageDialog(null, "Wrong username/password, Please try again");
                else
                {
                    JOptionPane.showMessageDialog(null, "Logged in Sucessfully");
                    Login.dispose();
                    initCustomerFeatures();
                    initEventManagerFeatures();
                    initAdminFeatures();
                    
                    if(u instanceof Customer)
                    {
                        CustomerFeatures.setUsernameLabel(u.getFullname());
                        CustomerFeatures.setVisible(true);
                    }
                    else if(u instanceof EventManager)
                    {
                        EventManagerFeatures.setUsernameLabel(u.getFullname());
                        EventManagerFeatures.setVisible(true);
                    }
                    else if(u instanceof Admin)
                    {
                        AdminFeatures.setUsernameLabel(u.getFullname());
                        AdminFeatures.setVisible(true);
                    }
                }
                
            } catch (Exception ex) {
                System.out.println("Exception " + ex.toString());
            }
        }
        
    }
    
}
