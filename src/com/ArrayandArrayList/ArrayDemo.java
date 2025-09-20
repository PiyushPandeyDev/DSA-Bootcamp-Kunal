package com.ArrayandArrayList;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {
        //syntax
       // datatype[] variable_name = new datatype[size];
        //store 5 roll numbers;
       // int [] rools = new int[5];
        //or directly
      //  int [] rools2 = {21,34,24,45,22};
      //  int[] ros; // declaration of an array, ros is defined in stack memory;
       // ros= new int[5]; // initialisation, actual obj creation in heap memory;
       // System.out.println(ros[1]);

       // String[] arr = new String[5];
       // System.out.println(arr[0]);
//        Scanner in = new Scanner(System.in);
//        int[] arr = new int[5];
//        arr[0]=10;
//        arr[1]=105;
//        arr[2]=13;
//        arr[3]=11;
//        arr[4]=101;
//        //[10,105,13,11,101];
//        System.out.println(arr[1]);

        //input using for loops;
//        for(int i=0; i<arr.length; i++){
//            arr[i] = in.nextInt();
          //  System.out.print(arr[i] +" ");

       // }
//        System.out.println(Arrays.toString(arr));
        /*for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }*/
       //for each loop;
        /*for(int num :arr){  //for every element in the array , print the element,
            System.out.print(num + " ");  //here num represents elements of the array,
        }*/
          Scanner in = new Scanner(System.in);
          String [] str = new String[4];
          for(int i =0;i<str.length;i++ ){
              str[i] = in.next();
          }
        System.out.println(Arrays.toString(str));
          str[1] ="monti";
        System.out.println(Arrays.toString(str));




    }
}
