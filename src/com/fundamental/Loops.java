package com.fundamental;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        /*
         syntax of for loops:
         for(initialisation; condition;increment/decrement){
           //body
           }
         */
         //Q : print number from 1 to 5:
         /*for(int num =1; num<=5; num++){
             System.out.println(num);
         }*/
         //Q : print number from 1 to n:
//         Scanner in  = new Scanner(System.in);
//        System.out.println("please enter the value of num:");
//         int n = in.nextInt();
//         for (int num =1; num<=n;num++){
//             System.out.print(num + " ");
//         }
           /*syntax for while loop:
                while(conditions){
              body

            */
        int num =1;
        while(num<=5){
            System.out.print(num + " ");
            num+=1;
        }
    }
}
