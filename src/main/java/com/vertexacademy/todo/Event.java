package com.vertexacademy.todo;

import java.time.LocalDate;
import java.util.TimerTask;


/**
 * Created by Vasyl on 15/05/2016.
 */
public class Event extends TimerTask {

    private LocalDate date;
    private String description;
    private String emailFrom;
    private String emailTo;

    public Event(LocalDate date, String description, String emailFrom, String emailTo) {
        this.date = date;
        this.description = description;
        this.emailFrom = emailFrom;
        this.emailTo = emailTo;
    }

    @Override
    public void run() {
        if (date != null && description != null && emailFrom != null && emailTo != null) {
            EmailSender sender = new SendEmail();
            sender.sendEmail(emailFrom, emailTo);
        }
    }

    public LocalDate getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }

    public String getemailFrom() {
        return emailFrom;
    }

    public String getEmailTo() {
        return emailTo;
    }
}
