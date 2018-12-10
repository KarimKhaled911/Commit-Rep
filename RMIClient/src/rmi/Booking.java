/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi;

import java.util.Observable;

/**
 *
 * @author KarimK
 */
public class Booking extends Observable{
    int Customer_ID;
    int EventManager_ID;
    int Cost;

    public Booking(int Customer_ID, int EventManager_ID, int Cost) {
        this.Customer_ID = Customer_ID;
        this.EventManager_ID = EventManager_ID;
        this.Cost = Cost;;
    }

    public int getCustomer_ID() {
        return Customer_ID;
    }

    public void setCustomer_ID(int Customer_ID) {
        this.Customer_ID = Customer_ID;
    }

    public int getEventManager_ID() {
        return EventManager_ID;
    }

    public void setEventManager_ID(int EventManager_ID) {
        this.EventManager_ID = EventManager_ID;
    }


    public int getCost() {
        return Cost;
    }

    public void setCost(int Cost) {
        this.Cost = Cost;
    }
    
}
