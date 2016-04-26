package com.vertexacademy.homework1.runner;

import com.vertexacademy.homework1.pisec.Pisec;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Дмитрий on 26.04.2016.
 */
public class PisecRunner implements Runnable {


    @Autowired
    Pisec pisec;

    @Override
    public void run() {
        System.out.println(pisec.getRandomGenius().write());
    }
}
