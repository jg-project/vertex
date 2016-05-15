package com.vertexacademy.eventReminder;


/**
 * Created by Дмитрий on 15.05.2016.
 */
public class Sender {


    public static void sendEmail(){

        Event event = Event.getRandomEvent();

        System.out.println("Рассылка события : " + event);

    }

}
