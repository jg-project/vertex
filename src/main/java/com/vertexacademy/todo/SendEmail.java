package com.vertexacademy.todo;

/**
 * Created by Vasyl on 15/05/2016.
 */
public class SendEmail implements EmailSender {


    @Override
    public void sendEmail(String emailFrom, String emailTo) {

        System.out.println("Message sended from " + emailFrom + " to " + emailTo);

//        String host = "localhost";
//
//        Properties properties = System.getProperties();
//
//        properties.setProperty("mail.smtp.host", host);
//
//        Session session = Session.getDefaultInstance(properties);
//
//        try{
//            MimeMessage message = new MimeMessage(session);
//
//            message.setFrom(new InternetAddress(emailFrom));
//
//            message.addRecipients(javax.mail.Message.RecipientType.TO, String.valueOf(new InternetAddress(emailTo)));
//
//            message.setSubject("This is the Subject Line!");
//
//            message.setText("This is actual message");
//
//            Transport.send(message);
//            System.out.println("Sent message successfully....");
//        }catch (MessagingException mex) {
//            mex.printStackTrace();
//        }
    }
}
