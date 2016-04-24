package com.vertexacademy.statistic;

import java.util.List;

/**
 * Created by Vasyl on 24/04/2016.
 */
public class MyStatisic implements StatisticDoable {

    @Override
    public int findMax(List<Integer> list) throws Exception {
        if (list == null || list.size() == 0) {
            throw new Exception("Empty list");
        }
        int max = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }
        return max;
    }

    @Override
    public int findMin(List<Integer> list) throws Exception {
        if (list == null || list.size() == 0) {
            throw new Exception("Empty list");
        }
        int min = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < min) {
                min = list.get(i);
            }
        }
        return min;
    }

    @Override
    public long findSum(List<Integer> list) throws Exception {
        if (list == null || list.size() == 0) {
            throw new Exception("Empty list");
        }
        long summ = 0;
        for (int i = 0; i < list.size(); i++) {
            summ += list.get(i);
        }
        return summ;
    }

    @Override
    public double findAverage(List<Integer> list) throws Exception {
        if (list == null || list.size() == 0) {
            throw new Exception("Empty list");
        }
        double everage = findSum(list) / 1. / list.size();
        return everage;
    }
}
