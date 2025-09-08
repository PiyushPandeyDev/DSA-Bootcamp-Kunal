package com.fundamental;

import java.util.Scanner;

public class LargestNo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the three successive num:");
                int a = in.nextInt();
                int b = in.nextInt();
                int c = in.nextInt();
                //find the largest num?
           /*int max =a;
           if (b>max){
               max =b;
           } if(c>max){
               max=c;
           }
        System.out.println(max);*/

        /*int max=0;
        if(a>b){
            max =a;
        }else{
            max =b;
        }
        if(c>max){
            max=c;
        }
        System.out.println(max);*/
        System.out.println (Math.max(c,(Math.max(a,b))));
    }
}
