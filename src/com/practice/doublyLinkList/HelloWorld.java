package com.practice.doublyLinkList;// Online Java Compiler
// Use this editor to write, compile and run your Java code online

// Input: nums = [-1,0,1,2,-1,-4]

// Output: [[-1,-1,2],[-1,0,1]] 
import java.util.*;

public class HelloWorld {
    public static void main(String[] args) {
        int[] arr =  {-1,0,1,2,-1,-4};
        // -1 = choose 2 items which will make -1 as zero 
        ArrayList<List> output = new ArrayList<>();
        for(int i=0; i<arr.length; i++) {
            int item = arr[i];
            List<Integer> combination = findCombination(item, arr, i);
            if(combination.size() == 2) {
                combination.add(item);
                output.add(combination);
//                output
//                output[0][0] = item;
//                output[0][1] = combination.get(0);
//                output[0][2] = combination.get(1);
            }
        }

        System.out.println(output);

    }

    public static List<Integer> findCombination(int number, int[] arr, int index) {
        ArrayList combination = new ArrayList();
        int sum = number;
        for(int i=index; i<arr.length; i++) {
            for(int j=i; j<arr.length; j++) {
                sum = arr[j] + arr[i];
                if(sum == 0 && combination.size() < 2) {
                    combination.add(arr[i]);
                    combination.add(arr[j]);
                }
            }
            sum = number;
        }
        return combination;
    }
}