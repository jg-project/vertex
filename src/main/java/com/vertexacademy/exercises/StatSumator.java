package com.vertexacademy.exercises;

/**
 * Created by Дмитрий on 24.04.2016.
 */
public class StatSumator implements IStatSumator {
    @Override
    public int max(int[] arr) {
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<arr.length;i++){
           if(max < arr[i]){
               max = arr[i];
           }
       }
        return max;
    }

    @Override
    public int min(int[] arr) {
        int min = Integer.MAX_VALUE;
        for(int i = 0;i<arr.length;i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }
        return min;
    }

    @Override
    public double avg(double[] arr) {
        double sum = 0;
        for(int i = 0;i<arr.length;i++){
            sum = arr[i] + sum;
        }
        return sum / arr.length;
    }
}
