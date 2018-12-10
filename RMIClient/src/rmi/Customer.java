/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi;

import java.io.Serializable;

/**
 *
 * @author Karim
 */
public class Customer extends User implements Serializable{
    int Customer_ID;
    int Payment_ID;

    public Customer(int User_ID, String First_Name, String Last_Name, String Email, String Username, String Password) {
        super(User_ID, First_Name, Last_Name, Email, Username, Password);
    }

    public Customer(int Customer_ID, int Payment_ID, int User_ID, String First_Name, String Last_Name, String Email, String Username, String Password) {
        super(User_ID, First_Name, Last_Name, Email, Username, Password);
        this.Customer_ID = Customer_ID;
        this.Payment_ID = Payment_ID;
    }

    public int getCustomer_ID() {
        return Customer_ID;
    }

    public void setCustomer_ID(int Customer_ID) {
        this.Customer_ID = Customer_ID;
    }

    
    public int getPayment_ID() {
        return Payment_ID;
    }

    public void setPayment_ID(int Payment_ID) {
        this.Payment_ID = Payment_ID;
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
}

