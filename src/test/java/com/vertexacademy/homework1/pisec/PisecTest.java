package com.vertexacademy.homework1.pisec;

import org.junit.Test;


/**
 * Created by Дмитрий on 26.04.2016.
 */
public class PisecTest {

    @Test(expected = NullPointerException.class)
    public void typoiTestTipaTrueTrue(){
        new Pisec(null).getRandomGenius();
    }

}
