package com.fundamental;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number:");
        int num = in.nextInt();
       // boolean ans =isEvenOdd(num);
        if(isEvenOdd(num)){
            System.out.println("Given no : " +num + " " + " is Even number");
        }else {
            System.out.println("Given no" +" " + num + " :" +"is odd number");
        }
    }
    static boolean isEvenOdd(int a){
        return a % 2 == 0;
    }
}
