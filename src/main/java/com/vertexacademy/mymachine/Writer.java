package com.vertexacademy.mymachine;

import org.springframework.stereotype.Component;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 * Created by user on 27.04.2016.
 */
@Component
public class Writer implements Genius {
    private String author;
    private String phrase;
    {
        chooseWriter();
    }
    @Override
    public void say()  {
        chooseWriter();
        System.out.println(author+":"+phrase);
    }


    public void chooseWriter() {
        try {
    FileReader fr = new FileReader("d://writers.txt");
        Scanner scan = new Scanner(fr);
            int choise = (int)(Math.random()*3);
        String s;
            for (int i=0;i<=choise; i++) {
                s=scan.nextLine();
                int a = s.indexOf(":");
                author = s.substring(0, a);
                phrase = s.substring(a + 1);
            }
            scan.close();
    } catch(FileNotFoundException e) {
            e.printStackTrace();

    }}

    public String getPhrase() {
        return phrase;
    }
}
