package com.vertexacademy.homework1.pisec;

import org.junit.Assert;
import org.junit.Test;


/**
 * Created by Дмитрий on 26.04.2016.
 */
public class PisecTest {

    @Test
    public void typoiTestTipaTrueTrue(){
        Assert.assertEquals(null,new Pisec(null).getGenius());
    }

}
