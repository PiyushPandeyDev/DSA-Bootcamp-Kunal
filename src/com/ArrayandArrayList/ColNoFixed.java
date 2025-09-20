package com.ArrayandArrayList;

import java.util.Arrays;

public class ColNoFixed {
    public static void main(String[] args) {
        int [][] arr ={
                {2,3,4},
                {5,6},
                {7,8,9}
        };
//        for (int row =0;row<arr.length;row++){
//            for (int col =0;col<arr[row].length;col++){
//                System.out.print(arr[row][col] + " ");
//            }
//            System.out.println();
//        }

        for (int [] ar : arr){
            System.out.println(Arrays.toString(ar));
        }
    }
}
