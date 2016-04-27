package com.vertexacademy.mymachine;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by user on 27.04.2016.
 */
public class MyMachine {
    private Genius gen;
    @Autowired
    public MyMachine(Genius gen) {
        this.gen = gen;
    }
}
