package com.vertexacademy.todo;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;

/**
 * Created by Vasyl on 15/05/2016.
 */
public class MainClass extends Timer {
    public static void main(String[] args) {
//        Event task = new Event(new LocalDate(), "test email", "abcd@gmail.com", "web@gmail.com");
//        Timer timer = new Timer();
//        timer.schedule(task, task.getDate());
//

        List<Event> list = new ArrayList<>();
        try {
            File inputFile = new File("input.xml");
            DocumentBuilderFactory dbFactory
                    = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();
            NodeList nList = doc.getElementsByTagName("task");
            for (int temp = 0; temp < nList.getLength(); temp++) {
                Node nNode = nList.item(temp);
                LocalDate date;
                String description;
                String emailFrom;
                String emailTo;
                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element eElement = (Element) nNode;
                    date = LocalDate.parse(eElement.getElementsByTagName("date").item(0).getTextContent(), DateTimeFormatter.BASIC_ISO_DATE);
                    description = eElement.getElementsByTagName("description").toString();
                    emailFrom = eElement.getElementsByTagName("emailFrom").item(0).getTextContent();
                    emailTo = eElement.getElementsByTagName("emailTo").item(0).getTextContent();
                    list.add(new Event(date, description, emailFrom, emailTo));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

//        for (int i = 0; i < list.size(); i++) {
//            Timer timer = new Timer();
//            timer.schedule(list.get(i), (Date)list.get(i).getDate());
//        }
    }
}
