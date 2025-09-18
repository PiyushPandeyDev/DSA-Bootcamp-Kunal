package com.fundamental;

import java.util.Scanner;

public class FindMaxMin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the three numbers :");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();

       // int max =isMax(num1,num2,num3);
        //System.out.println("maximum num is : " + " " +max);

        int min = isMin(num1,num2,num3);
        System.out.println("minimum no is :" + min);
    }
    static int isMax(int a, int b,int c){
        int max = Math.max(a, b);
        if(c>max){
            max=c;
        }
      return max;
    }
    static  int isMin(int a, int b, int c){
        int min= Math.min(a,b);
        if(c<min){
            min = c;
        }
        return min;

    }
}
