/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi;

/**
 *
 * @author KarimK
 */
public class Payment_Method {
    int Payment_ID;
    int Customer_ID;

    public Payment_Method(int Payment_ID, int Customer_ID) {
        this.Payment_ID = Payment_ID;
        this.Customer_ID = Customer_ID;
    }

    public int getPayment_ID() {
        return Payment_ID;
    }

    public void setPayment_ID(int Payment_ID) {
        this.Payment_ID = Payment_ID;
    }

    public int getCustomer_ID() {
        return Customer_ID;
    }

    public void setCustomer_ID(int Customer_ID) {
        this.Customer_ID = Customer_ID;
    }
    
    
}
