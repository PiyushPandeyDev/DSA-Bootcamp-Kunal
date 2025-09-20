package com.ArrayandArrayList;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensionArray {
    public static void main(String[] args) {
       /* 1 2 3
         6  5 4
         7 8 9
       */
//        int [][] arr = new int[3][];
//        int [][] arr2D ={
//                {1,2,3}, // 0th index
//                {4,5,6}, // 1st index
//                {7,8,9,5}  // 2nd index   -> arr2D[2] ={7,8,9,5}
//        };
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[3][3]; //no of rows= length of array
        System.out.println(arr.length); //no of rows

        //input
        for (int row = 0; row < arr.length; row++) {
            //for each column in every row
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }
        }
        //output
//        for (int row = 0; row < arr.length; row++) {
//            //for each column in every row
//            for (int col = 0; col < arr[row].length; col++) {
//                System.out.print(arr[row][col] + " ");
//            }
//            System.out.println();
//        }
        // another way to print o/p
//
        // using enhanced for loop
        for(int [] a : arr){
            System.out.println(Arrays.toString(a));
        }
    }
}
