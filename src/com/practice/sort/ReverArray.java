package com.practice.sort;

import java.util.Arrays;

public class ReverArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        int len = arr.length;


        for(int i=0; i<len/2; i++) {
            int temp = arr[i];
            arr[i] = arr[len-1-i];
            arr[len-1-i] = temp;
        }

        System.out.println(Arrays.toString(arr));
    }
}
