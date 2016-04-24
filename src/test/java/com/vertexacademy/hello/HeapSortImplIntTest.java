package com.vertexacademy.hello;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by vertex0008 on 24.04.2016.
 */
public class HeapSortImplIntTest {

    @Test
    public void doIncrediblyFastSort() throws Exception {
        Sorter sorter = new HeapSortImpl();
        final int[] a = {3, 4, 5, 23, 2, 23, 567, 9, 1, 4, 0, 128, 64};
        int[] expected = {0, 1, 2, 3, 4, 4, 5, 9, 23, 23, 64, 128, 567};

        sorter.doIncrediblyFastSort(a);

        assertArrayEquals(expected, a);

    }
}