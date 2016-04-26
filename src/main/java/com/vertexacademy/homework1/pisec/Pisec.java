package com.vertexacademy.homework1.pisec;


import java.util.List;

/**
 * Created by Дмитрий on 26.04.2016.
 */
public class Pisec {

    private Genius genius;
    private List<Genius> geniusList;

    public Pisec(List<Genius> geniusList){
        this.geniusList = geniusList;
    }

    public Pisec(){

    }

    public Genius getRandomGenius() {
        return geniusList.get((int)(Math.random()*3));
    }
}
