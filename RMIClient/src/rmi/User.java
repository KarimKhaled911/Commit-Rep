/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi;

import java.io.Serializable;

/**
 *
 * @author KarimK
 */
public class User implements Serializable{
    int User_ID;
    String First_Name;
    String Last_Name;
    String Email;
    String Username;
    String Password;

    public User(int User_ID, String First_Name, String Last_Name, String Email, String Username, String Password) {
        this.User_ID = User_ID;
        this.First_Name = First_Name;
        this.Last_Name = Last_Name;
        this.Email = Email;
        this.Username = Username;
        this.Password = Password;
    }

    public int getUser_ID() {
        return User_ID;
    }

    public void setUser_ID(int User_ID) {
        this.User_ID = User_ID;
    }

    public String getFirst_Name() {
        return First_Name;
    }

    public void setFirst_Name(String First_Name) {
        this.First_Name = First_Name;
    }

    public String getLast_Name() {
        return Last_Name;
    }

    public void setLast_Name(String Last_Name) {
        this.Last_Name = Last_Name;
    }


    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }


    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getFullname()
    {
        return First_Name + " " + Last_Name;
    }
    
    
    
    public String viewProfile()
    {
        return "\nUser_ID: " + User_ID + 
                "\nFirst Name: " + First_Name + 
                "\nLast Name: " + Last_Name + 
                "\nEmail: " + Email + 
                "\nUsername: " + Username +
                "\nPassword: " + Password ;
    }
    
    public void editProfile( User newUser )
    {
        this.First_Name = newUser.First_Name;
        this.Last_Name = newUser.Last_Name;
        this.Email = newUser.Email;
        this.Username = newUser.Username;
        this.Password = newUser.Password;
    }
    
}
