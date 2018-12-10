/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import rmi.User;

/**
 *
 * @author Karim
 */
public class Authentication extends UnicastRemoteObject implements AuthenticationInterface{
    
    ArrayList<User> registeredUsers;

    public Authentication() throws RemoteException{
        registeredUsers = new ArrayList();
    }
    
    
    @Override
    public User login(String username, String password) throws RemoteException {
        for (int i = 0; i < registeredUsers.size(); i++) {
            User u = registeredUsers.get(i);
            if ((u.getUsername().equals(username)) && (u.getPassword().equals(password))) {
                return u;
            }
        }
        return null;
    }

    @Override
    public boolean registerAsCustomer(int Customer_ID, int Payment_ID, int User_ID, String First_Name, String Last_Name, String Email, String Username, String Password) throws RemoteException {
        if (alreadyExists(Username)) {
            return false;
        }
            else {
            User u = new Customer(Customer_ID, Payment_ID, User_ID, First_Name, Last_Name, Email, Username, Password);
            registeredUsers.add(u);
            return true;
        }
    }

    @Override
    public boolean registerAsEventManager(int EventManager_ID, int User_ID, String First_Name, String Last_Name, String Email, String Username, String Password) throws RemoteException {
        if (alreadyExists(Username)) {
            return false;
        }
            else {
            User u = new EventManager(EventManager_ID, User_ID, First_Name, Last_Name, Email, Username, Password);
            registeredUsers.add(u);
            return true;
        }
    }
    
    private boolean alreadyExists(String username) {
        for (int i = 0; i < registeredUsers.size(); i++) {
            if (registeredUsers.get(i).getUsername().equals(username)) {
                return true;
            }
        }
        return false;
    }
}