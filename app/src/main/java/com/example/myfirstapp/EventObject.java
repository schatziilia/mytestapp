package com.example.myfirstapp;

import java.util.Date;

/**
 * Created by user on 27-Jan-17.
 */

public class EventObject {

    String title;
    Date date;

    public EventObject() {}

    public EventObject(String title){
        this.title = title;
        this.date = new Date();
    }

    public EventObject(String title, Date date){
        this.title = title;
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "title='" + title + '\'' +
                ", date=" + date ;
    }
}//class
