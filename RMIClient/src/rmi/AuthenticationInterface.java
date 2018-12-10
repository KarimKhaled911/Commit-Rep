/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Karim
 */
public interface AuthenticationInterface extends Remote{
    public User login(String username, String password) throws RemoteException;
    
    public boolean registerAsCustomer(int Customer_ID, int Payment_ID, int User_ID, String First_Name, String Last_Name, String Email, String Username, String Password) throws RemoteException;
    
    public boolean registerAsEventManager(int EventManager_ID, int User_ID, String First_Name, String Last_Name, String Email, String Username, String Password) throws RemoteException;
    
}
