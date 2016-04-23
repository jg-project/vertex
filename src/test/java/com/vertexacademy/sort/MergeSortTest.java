package com.vertexacademy.sort;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by Vasyl on 23/04/2016.
 */
public class MergeSortTest {

    @Test
    public void testMergeSort() throws Exception {
        ArrayList<Integer> array = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            array.add((int) Math.random() * 1000);
        }
        ArrayList<Integer> originalArray = new ArrayList<>(array);
        Collections.sort(array);
        Object[] array1 = array.toArray();
        Object[] originalArray1 = array.toArray();
        assertArrayEquals(array1, originalArray1);
    }
}