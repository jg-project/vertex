package com.vertexacademy.hello;

import java.util.Arrays;

/**
 * Created by vertex0008 on 23.04.2016.
 */
public class HeapSort implements HeapSortInt{
    public void main(String[] args) {
        final int[] a = { 3,4,5,23,2,23,567,9,1,4,0,128,64 };
        System.out.println(Arrays.toString(a));
        heapSort(a, a.length);
        System.out.println(Arrays.toString(a));
    }

    public void heapSort(final int[] array, final int count) {
        heapify(array, count);

        int end = count - 1;
        while (end > 0) {
            swap(array, end, 0);
            siftDown(array, 0, --end);
        }
    }

    public void swap(final int[] array, final int a, final int b) {
        final int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }

    public void heapify(final int[] array, final int count) {
        int start = count / 2 - 1;

        while (start >= 0) {
            siftDown(array, start, count - 1);
            start--;
        }
    }

    public void siftDown(final int[] array, final int start, final int end) {
        int root = start;

        while (root * 2 + 1 <= end) {
            int child = root * 2 + 1;
            int swap = root;
            if (array[swap] < array[child]) {
                swap = child;
            }
            if (child + 1 <= end && array[swap] < array[child + 1]) {
                swap = child + 1;
            }
            if (swap != root) {
                swap(array, root, swap);
                root = swap;
            } else {
                return;
            }
        }
    }
}
