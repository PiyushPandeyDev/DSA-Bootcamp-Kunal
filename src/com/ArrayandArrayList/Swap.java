package com.ArrayandArrayList;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int [] arr ={2,4,5,6,8,10,18};
        //swapArray(arr,1,3);
        //System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr));
        reverseArray(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void swapArray(int[] arr,int index1, int index2){
        int temp =arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;

    }
    static void reverseArray(int [] arr){
         int start =0;
         int end =arr.length-1;
         while (start<end){
             //swap
             swapArray(arr,start,end);
             start++;
             end--;
         }

    }
}
