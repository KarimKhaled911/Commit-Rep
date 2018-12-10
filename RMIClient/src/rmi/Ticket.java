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
public class Ticket {
    int Booking_ID;
    int Ticket_ID;
    int Customer_ID;
    int Event_ID;
    int Cost;

    public Ticket(int Booking_ID, int Ticket_ID, int Customer_ID, int Event_ID, int Cost) {
        this.Booking_ID = Booking_ID;
        this.Ticket_ID = Ticket_ID;
        this.Customer_ID = Customer_ID;
        this.Event_ID = Event_ID;
        this.Cost = Cost;
    }

    public int getBooking_ID() {
        return Booking_ID;
    }

    public void setBooking_ID(int Booking_ID) {
        this.Booking_ID = Booking_ID;
    }

    public int getTicket_ID() {
        return Ticket_ID;
    }

    public void setTicket_ID(int Ticket_ID) {
        this.Ticket_ID = Ticket_ID;
    }


    public int getCustomer_ID() {
        return Customer_ID;
    }

    public void setCustomer_ID(int Customer_ID) {
        this.Customer_ID = Customer_ID;
    }

    public int getEvent_ID() {
        return Event_ID;
    }

    public void setEvent_ID(int Event_ID) {
        this.Event_ID = Event_ID;
    }

    public int getCost() {
        return Cost;
    }

    public void setCost(int Cost) {
        this.Cost = Cost;
    }
    
  
}
