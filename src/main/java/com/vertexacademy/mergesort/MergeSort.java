package com.vertexacademy.mergesort;

public class MergeSort  {

//    public static int[] arr;
//
//    public static void mergeSort(int[] temp){
//
//        arr = new int [temp.length];
//        mergeSort(temp, 0, temp.length - 1);
//
//    }
//
//    public static void mergeSort(int[] temp,int down, int hi){
//        if(hi<=down){
//            return;
//        }
//        int mid = down + (hi - down)/2;
//        mergeSort(temp, down, mid);
//        mergeSort(temp, mid + 1, hi);
//        merge(temp,down,hi,mid);
//    }
//
//    public static void merge(int[] temp,int down,int hi,int mid){
//
//        int i = down, j = mid + 1;
//        for (int k = 0; k <= hi; k++) {
//            arr[k] = temp[k];
//        }
//
//        for (int k = down; k <= hi; k++) {
//            if (i > mid) {
//                temp[k] = arr[j++];
//            } else if (j > hi) {
//                temp[k] = arr[i++];
//            } else if (arr[j]<(arr[i]) ) {
//                temp[k] = arr[j++];
//            } else {
//                temp[k] = arr[i++];
//            }
//        }
//
//    }

}
