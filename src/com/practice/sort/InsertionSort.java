package com.practice.sort;

import java.util.Arrays;

public class InsertionSort {

    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static int[] insertionSort(int[] arr) {

        for(int i=1; i<arr.length; i++) { // start from second element
            int j = i-1;
            while(j >= 0 && arr[j] > arr[i]) {
                swap(arr, i, j);
                j--;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{3, 2, 4, 1, 5};

        System.out.println(Arrays.toString(insertionSort(arr)));
    }
}
