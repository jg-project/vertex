package com.vertexacademy.statistic;

import org.junit.Test;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

import static org.junit.Assert.assertEquals;

/**
 * Created by Vasyl on 24/04/2016.
 */
public class MyStatisicTest {
    private ArrayList<Integer> list = new ArrayList<>();
    private long summ = 0;
    private double average = 0.;

    {
        for (int i = 0; i < 1000; i++) {
            list.add(ThreadLocalRandom.current().nextInt(1000));
            summ += list.get(i);
        }
        list.add(2000);
        list.add(-2000);
        average = summ / 1. / list.size();
    }

    @Test
    public void testFindMax() throws Exception {
        assertEquals(2000, new MyStatisic().findMax(list));
    }

    @Test
    public void testFindMin() throws Exception {
        assertEquals(-2000, new MyStatisic().findMin(list));
    }

    @Test
    public void testFindSum() throws Exception {
        assertEquals(summ, new MyStatisic().findSum(list));
    }

    @Test
    public void testFindAverage() throws Exception {
        assertEquals(average, new MyStatisic().findAverage(list), 0.000_000_1);
    }
}