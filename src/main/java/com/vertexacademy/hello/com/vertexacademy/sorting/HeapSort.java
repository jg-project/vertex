package com.vertexacademy.hello.com.vertexacademy.sorting;

import java.util.Arrays;

/**
 * Created by Nick on 4/23/2016.
 */
public class HeapSort implements Sorter {
    public static final int[] ARR_NOT_SORT = new int[]{2, 4, 47, 34, 8, 5, 67, 124, 3456};
    int i;
    int temp;

    static void shiftDown(int[] a, int i, int j) {
        boolean done = false;
        int maxChild;
        int temp;

        while ((i * 2 + 1 < j) && (!done)) {
            if (i * 2 + 1 == j - 1)
                maxChild = i * 2 + 1;
            else if (a[i * 2 + 1] > a[i * 2 + 2])
                maxChild = i * 2 + 1;
            else
                maxChild = i * 2 + 2;

            if (a[i] < a[maxChild]) {
                temp = a[i];
                a[i] = a[maxChild];
                a[maxChild] = temp;
                i = maxChild;
            } else {
                done = true;
            }
        }
    }

    public static void main(String[] args) {

        HeapSort heapSort = new HeapSort();
        System.out.print(Arrays.toString(heapSort.sort(ARR_NOT_SORT)));

    }

    @Override
    public int[] sort(int[] arr) {
        for (i = arr.length / 2 - 1; i >= 0; i--) {
            shiftDown(arr, i, arr.length);
        }

        for (i = arr.length - 1; i >= 1; i--) {
            temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            shiftDown(arr, 0, i);
        }
        return arr;
    }
}



