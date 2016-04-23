package com.vertexacademy.sort;

import java.util.ArrayList;

/**
 * Created by Vasyl on 23/04/2016.
 */
public class MergeSort implements Sorteable {
    int[] array = new int[100];

    {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 1000);
        }
    }

    @Override
    public ArrayList<Integer> mergeSort(ArrayList<Integer> input) {
        ArrayList<Integer> left = new ArrayList<>();
        ArrayList<Integer> right = new ArrayList<>();
        ArrayList<Integer> result;
        if (input.size() <= 1) {
            return input;
        } else {
            int middle = input.size() / 2;
            for (int i = 0; i < input.size(); i++) {
                if (input.get(i) < middle) {
                    left.add(input.get(i));
                } else {
                    right.add(input.get(i));
                }
            }

            left = mergeSort(left);
            right = mergeSort(right);
            result = merge(left, right);
            return result;
        }
    }

    @Override
    public ArrayList<Integer> merge(ArrayList<Integer> left, ArrayList<Integer> right) {
        ArrayList<Integer> result = new ArrayList<>();
        while (left.size() > 0 && right.size() > 0) {
            if (left.get(0) < right.get(0)) {
                result.add(left.get(0));
                left.remove(0);
            } else {
                result.add(right.get(0));
                right.remove(0);
            }
        }

        if (left.size() > 0) {
            result.addAll(left);
        }
        if (right.size() > 0) {
            result.addAll(right);
        }
        return result;
    }


}
