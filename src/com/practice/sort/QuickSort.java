package com.practice.sort;

import java.util.Arrays;

public class QuickSort {

    public static int[] quickSort(int[] arr, int start, int end) {
        if(start >= end) {
            return arr;
        }
        // Set pivot value and pivot index
        int pivotIndex = start;
        int pivotValue = arr[end-1];

        // Iterate over array and move elements
        for(int i= start; i<end; i++) {
            // Swap the items if value is more than pivot value
            if(arr[i] < pivotValue) {
                int temp = arr[i];
                arr[i] = arr[pivotIndex];
                arr[pivotIndex] = temp;
                pivotIndex++;  // Increment pivot index
            }
        }

        // Swap the pivot element
        int temp = arr[end-1];
        arr[end-1] = arr[pivotIndex];
        arr[pivotIndex] = temp;

        quickSort(arr, start, pivotIndex);
        quickSort(arr, pivotIndex+1, end);

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{3, 5, 1, 2, 4};

        int[] sorted_arr = quickSort(arr, 0, arr.length); // Call quick sort method

        System.out.println(Arrays.toString(sorted_arr));
    }
}
