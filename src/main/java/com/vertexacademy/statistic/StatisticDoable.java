package com.vertexacademy.statistic;

import java.util.List;

/**
 * Created by Vasyl on 24/04/2016.
 */
public interface StatisticDoable {
    int findMax(List<Integer> list) throws Exception;

    int findMin(List<Integer> list) throws Exception;

    long findSum(List<Integer> list) throws Exception;

    double findAverage(List<Integer> list) throws Exception;
}
