package com.vertexacademy.exercises;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Дмитрий on 24.04.2016.
 */
public class TestTask1 {

    @Test
    public void testIsSimpleNumber(){
        Task1 task1 = new Task1();
        Assert.assertEquals(true,task1.isSimpleNumber(2));
        Assert.assertEquals(true,task1.isSimpleNumber(7));
        Assert.assertEquals(true,task1.isSimpleNumber(887));
        Assert.assertEquals(false,task1.isSimpleNumber(10));
        Assert.assertEquals(false,task1.isSimpleNumber(38));
    }

}
