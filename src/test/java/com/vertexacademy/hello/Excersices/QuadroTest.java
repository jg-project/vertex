package com.vertexacademy.hello.Excersices;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 24.04.2016.
 */
public class QuadroTest {

    @Test
    public void testCountDouble() throws Exception {
    Quadro q1 = new Quadro();
        q1.countDouble(5,-9,-2);
        assertEquals(2.0,q1.x1,0.001);
        assertEquals(-0.2,q1.x2,0.001);
    }
}