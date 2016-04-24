package com.vertexacademy.exercises;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by Дмитрий on 24.04.2016.
 */
public class StatSumatorTest {

    StatSumator statSumator = new StatSumator();
    int[] arr = new int[20];

    @Before
    public void resArray(){
        for(int i = 0;i<20;i++){
            arr[i] = (int)(Math.random()*100);
        }
    }

    @Test
    public void testMax() throws Exception {
        Arrays.sort(arr);
        Assert.assertEquals(arr[arr.length-1],statSumator.max(arr));
    }

    @Test
    public void testMin() throws Exception {
        Arrays.sort(arr);
        Assert.assertEquals(arr[0],statSumator.min(arr));
    }

    @Test
    public void testAvg() throws Exception {
        double[] temp = new double[5];
        temp[0] = 10.0;
        temp[1] = 15.0;
        temp[2] = 25.0;
        temp[3] = 20.0;
        temp[4] = 30.0;
        Assert.assertEquals(20.0, statSumator.avg(temp), 0.0000001);
    }
}