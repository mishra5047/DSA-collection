package com.company;

import java.util.*;
import java.io.*;

public class reverseSort {
    public static int indexOfMin(int[] arr, int start, int end){
        int minIdx = start;
        for(int i = start; i < end; i++){
            if(arr[minIdx] > arr[i]){
                minIdx = i;
            }
        }
        return minIdx;
    }

    public static void reverseArrayCost(int[] arr, int s, int e){

        while (s < e){
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;

        }

    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int t = scn.nextInt(); // Scanner has functions to read ints, longs, strings, chars, etc.
        for (int x = 1; x <= t; ++x) {
            int n = scn.nextInt();
            int cost = 1;
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scn.nextInt();
            }
            if(n > 1){
                for (int i = 0; i < n; i++) {
                    int j = indexOfMin(arr, i, n);
                    reverseArrayCost(arr, i, j);
                    cost += (j - i) + 1 ;
                }
                cost -= 2;
            }
            System.out.println("Case #" + x + ": " + cost );
        }
    }
}


