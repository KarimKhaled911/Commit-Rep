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
public class CreditCard extends Payment_Method{
    int Card_Number;
    int CVV;

    public CreditCard(int Payment_ID, int Customer_ID) {
        super(Payment_ID, Customer_ID);
    }

    public CreditCard(int Card_Number, int CVV, int Payment_ID, int Customer_ID) {
        super(Payment_ID, Customer_ID);
        this.Card_Number = Card_Number;
        this.CVV = CVV;
    }

    public int getCard_Number() {
        return Card_Number;
    }

    public void setCard_Number(int Card_Number) {
        this.Card_Number = Card_Number;
    }

    public int getCVV() {
        return CVV;
    }

    public void setCVV(int CVV) {
        this.CVV = CVV;
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
