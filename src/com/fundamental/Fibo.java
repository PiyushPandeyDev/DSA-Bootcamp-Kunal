package com.fundamental;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the nth number of Fibonacci series :");
        int n = in.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;
        int temp = 0;

        while (count <= n) {
           // System.out.print(a + " ");
            temp = b;
            b = a + b;
            a = temp;
            count++;

        }
        System.out.println();
        System.out.println(b);
    }
}
