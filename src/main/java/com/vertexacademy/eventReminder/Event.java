package com.vertexacademy.eventReminder;

import java.util.Date;

/**
 * Created by Дмитрий on 15.05.2016.
 */
public class Event {

    private String event;
    private Date date;

    public Event(String event, Date date) {
        this.event = event;
        this.date = date;
    }

    private final static String[] events = new String[]{"Ярмарка на Харьковском",
            "Упал метеорит в Чикаго", "Какое то событие"};

    public static Event getRandomEvent(){

        int rand = (int)(Math.random()*3);
        return new Event(events[rand],getRandomDate());

    }

    private static Date getRandomDate(){
        Date date = new Date();
        date.setTime((long)(Math.random()*9999999999942L));
        return date;
    }

    public String getEvent() {
        return event;
    }

    public Date getDate() {
        return date;
    }

    @Override
    public String toString() {
        return event + " " + date;
    }
}
