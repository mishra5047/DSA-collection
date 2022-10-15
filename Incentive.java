package com.company;

import java.util.ArrayList;

public class Incentive {
    public static int incentive(int[] arr ){
        ArrayList<Integer> ans = new ArrayList<>();
        int sum = getSum(arr);
        int min = getMin(arr, 0 , arr.length - 1);
        int i = 0;
        int j = arr.length - 1;

        while (j - i > 1){
            ans.add(sum * min);
            if(arr[i] < arr[j]){
                if(arr[i] == min){
                    min = getMin(arr, i + 1, j);
                }
                sum -= arr[i];
                i++;
            }else{
                if(arr[j] == min){
                    min = getMin(arr,i, j -1);
                }
                sum -= arr[j];
                j--;
            }
        }
        return getMax(ans);
    }

    public static int getSum(int[] arr){
        int sum = 0;
        for(int i : arr){
            sum += i;
        }
        return sum;
    }

    public static int getMin(int[] arr, int i , int j){
        int min = Integer.MAX_VALUE;
        for(int x = i ; x <= j ; x++){
            min = Math.min(min, arr[x]);
        }
        return min;
    }
    public static int getMax(ArrayList<Integer> arr){
        int maxValue = Integer.MIN_VALUE;
        for(int x = 0 ; x < arr.size() ; x++){
            maxValue = Math.max(maxValue, arr.get(x));

        }
        return maxValue;
    }
}
