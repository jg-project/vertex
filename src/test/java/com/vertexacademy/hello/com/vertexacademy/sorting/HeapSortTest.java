package com.vertexacademy.hello.com.vertexacademy.sorting;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by Nick on 4/23/2016.
 */
public class HeapSortTest {
    @Test
    public void sort() throws Exception {

        Sorter sorter = new HeapSort();

        int[] acutal = sorter.sort(new int[]{7, 6, 3, 3, 5, 2, 1});

        int[] expected = {1, 2, 3, 3, 5, 6, 7};

        assertArrayEquals(expected, acutal);


    }

}