package com.fundamental;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the Number:");
        int number = in.nextInt();
        checkPalindrom(number);
    }

     static void checkPalindrom(int number) {
        int originalNumber = number;
        int reverse =0;
        while(number>0){
            int reminder = number%10;
            number = number/10;
            reverse = reverse*10 +reminder;

        }
        if(originalNumber==reverse){
            System.out.println("given number :" +originalNumber+ " " +"is palindrome no");
        }else {
            System.out.println("given number :" +originalNumber+ " " +"is not palindrome no");
        }

    }
}
