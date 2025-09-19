package com.fundamental;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("plz enter number of factorial:");
        int num = in.nextInt();
        findFactorial(num);

    }
    static void findFactorial(int num){
       /* int factorial =1;
        while (num>0){
            factorial *=num;
            num--;
        }
        System.out.println("factorial of num " + num + "is :" + factorial);*/
        int fact =1;
        for(int i=2;i<=num;i++){
             fact = fact*i;

        }
        System.out.println("factorial of the num :" +" " + fact);
    }
}
