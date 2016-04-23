package com.vertexacademy.mergesort;

import org.junit.Test;

import java.sql.Array;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

/**
 * Created by Дмитрий on 23.04.2016.
 */
public class MergeSortTest {

    @Test
    public void testMegreSort(){
        int[] arr1 = new int[20];
        int[] arr2 = new int[20];
        for(int i = 0;i<20;i++){
            arr1[i] = (int)(Math.random()*20);
            arr2[i] = arr1[1];
        }

        Arrays.sort(arr1);
        MergeSort.mergeSort(arr2);

        assertEquals(arr1[9],arr2[9]);



    }



}
