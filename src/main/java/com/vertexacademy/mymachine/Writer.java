package com.vertexacademy.mymachine;

import org.springframework.stereotype.Component;

/**
 * Created by user on 27.04.2016.
 */
@Component
public class Writer implements Genius {
    private String phrase="To be or not to be. That is the question";
    @Override
    public void say() {
        System.out.println(phrase);
    }

    public String getPhrase() {
        return phrase;
    }
}
