package com.ArrayandArrayList;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class SearchElement {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("enter the length:");
        int n = in.nextInt();
        System.out.println("enter the target number:");
        int target = in.nextInt();
        int [] arr = new int[n];
        boolean found = false;

        //input
        for(int i =0; i<n ;i++){
            arr[i] =in.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        for(int i=0;i<arr.length; i++){
            if(arr[i]==target){
                System.out.println("target is founded at index :" + i);
                found =true;
                break;

            }
        }
        System.out.println("status is :" + found);
        if(!found){
            System.out.println("not found");
        }


    }
}
