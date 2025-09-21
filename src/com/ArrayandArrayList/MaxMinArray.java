package com.ArrayandArrayList;

import java.util.Arrays;
import java.util.Scanner;

public class MaxMinArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the length of Array :");
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        findMaxMinValue(arr);
    }

    static void findMaxMinValue(int[] nums) {
        int max = nums[0];
        int min = nums[0];
        int index = 0;
        int index2 = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
                index = i;
            }

            if (nums[i] < min) {
                min = nums[i];
                index2 = i;

            }


        }
        System.out.println("max value in the Array :" + max + " at index:" + index);
        System.out.println("min value in the Array :" + min + " at index :" + index2);
    }
}
