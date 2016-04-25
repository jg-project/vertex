package com.vertexacademy.spring.runner;

import com.vertexacademy.spring.studySpring.Rectangle;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Дмитрий on 26.04.2016.
 */
public class RectangleRunner implements Runnable {

    @Autowired
    private Rectangle rect;

    @Override
    public void run() {

        System.out.println(rect.square());

    }
}
