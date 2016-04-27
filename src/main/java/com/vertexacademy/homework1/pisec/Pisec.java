package com.vertexacademy.homework1.pisec;


import java.util.List;

/**
 * Created by Дмитрий on 26.04.2016.
 */
public class Pisec {

    private Genius genius;

    public Pisec(Genius genius){
        this.genius = genius;
    }

    public Pisec(){

    }

    public Genius getRandomGenius() {
        int random = (int)(Math.random()*3);
        return (random == 0) ? new ProverbWriter() : (random == 1) ? new Poet() : new Songwriter();
    }
}
