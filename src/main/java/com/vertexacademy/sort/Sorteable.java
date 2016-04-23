package com.vertexacademy.sort;

import java.util.ArrayList;

/**
 * Created by Vasyl on 23/04/2016.
 */
public interface Sorteable {
    ArrayList<Integer> mergeSort(ArrayList<Integer> input);

    ArrayList<Integer> merge(ArrayList<Integer> left, ArrayList<Integer> right);
}
