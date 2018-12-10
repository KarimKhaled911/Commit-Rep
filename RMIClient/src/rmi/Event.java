/*
 * To change this license header, choose Event_Type Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi;

/**
 *
 * @author KarimK
 */
public class Event {
    int Event_ID;
    int EventManager_ID;
    String Event_Name;
    String Event_Type;
    String Event_Loc;
    String Event_Date;
    String Event_Time;

    public Event(int Event_ID, int EventManager_ID, String Event_Name, String Event_Type, String Event_Loc, String Event_Date, String Event_Time) {
        this.Event_ID = Event_ID;
        this.EventManager_ID = EventManager_ID;
        this.Event_Name = Event_Name;
        this.Event_Type = Event_Type;
        this.Event_Loc = Event_Loc;
        this.Event_Date = Event_Date;
        this.Event_Time = Event_Time;
    }

    public String getEvent_Loc() {
        return Event_Loc;
    }

    public void setEvent_Loc(String Event_Loc) {
        this.Event_Loc = Event_Loc;
    }

    public String getEvent_Date() {
        return Event_Date;
    }

    public void setEvent_Date(String Event_Date) {
        this.Event_Date = Event_Date;
    }

    public String getEvent_Time() {
        return Event_Time;
    }

    public void setEvent_Time(String Event_Time) {
        this.Event_Time = Event_Time;
    }

    public int getEvent_ID() {
        return Event_ID;
    }

    public void setEvent_ID(int Event_ID) {
        this.Event_ID = Event_ID;
    }

    public int getEventManager_ID() {
        return EventManager_ID;
    }

    public void setEventManager_ID(int EventManager_ID) {
        this.EventManager_ID = EventManager_ID;
    }

    public String getEvent_Name() {
        return Event_Name;
    }

    public void setEvent_Name(String Event_Name) {
        this.Event_Name = Event_Name;
    }

    public String getEvent_Type() {
        return Event_Type;
    }

    public void setEvent_Type(String Event_Type) {
        this.Event_Type = Event_Type;
    }

}
