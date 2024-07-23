package com.practice.sort;

import java.util.Arrays;

public class QuickSort {

    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

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
                swap(arr, i, pivotIndex);
                pivotIndex++;  // Increment pivot index
            }
        }

        // Swap the pivot element
        swap(arr, end-1, pivotIndex);

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
