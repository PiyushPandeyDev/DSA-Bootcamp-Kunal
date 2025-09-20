package com.ArrayandArrayList;

public class MaxValue {
    public static void main(String[] args) {
        int [] arr ={4,6,243,67,23,12};
        //System.out.println(findMaxValue(arr));
        System.out.println(maxInRange(arr,1,4));

    }
    static int findMaxValue(int [] arr){
        int maxVal = arr[0];
        for (int i=1; i<arr.length ; i++){
            if(arr[i]>maxVal){
                maxVal =arr[i];
            }
        }
        return maxVal;
    }
    //work on edge cases here ,like array being null
    static int maxInRange(int [] arr,int start, int end){
        if(end>start){
            return -1;
        }
        if(arr.length==0){
            return -1;
        }
        if(arr==null){
            return -1;
        }
        int maxVal = arr[start];
        for(int i=start; i<=end; i++){
            if (arr[i]>maxVal){
                maxVal =arr[i];
            }
        }
        return maxVal;

    }
}
