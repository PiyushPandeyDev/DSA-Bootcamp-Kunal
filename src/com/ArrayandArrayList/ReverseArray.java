package com.ArrayandArrayList;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        int [] arr = {5, 7 ,13, 15,20};
        System.out.println(Arrays.toString(arr));
        int n = arr.length;
      /*  int length= arr.length;
        int [] nums =new int[length];

        for(int i=0;i<length ; i++ ){
            nums[i] =arr[length-1-i];

        }
        System.out.println(Arrays.toString(nums));
*/
      //2nd method to reverse the Array
      /*for(int i=0 ;i<n/2 ; i++){
          int temp = arr[i];
          arr[i]=arr[n-1-i];
          arr[n-1-i] = temp;

      }
        System.out.println(Arrays.toString(arr));*/

        //two pointer approach
        int start =0;
        int end = n-1;
        while (start<end){
            int temp =arr[start];
            arr[start] =arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        for(int num :arr){
            System.out.print(num + " ");

        }
        System.out.println();
        System.out.println(Arrays.toString(arr));
    }
}
