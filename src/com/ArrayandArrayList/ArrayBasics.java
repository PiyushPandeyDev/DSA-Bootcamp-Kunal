package com.ArrayandArrayList;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayBasics {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the length of Array :");
        int n = in.nextInt();
        int [] arr = new int[n];

        //input
        for(int i =0; i<n ;i++){
            arr[i]=in.nextInt();
        }
        //output
        for(int i=0;i<n ;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println(Arrays.toString(arr));

    }
}
