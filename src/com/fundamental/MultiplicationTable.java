package com.fundamental;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number:");
        int number = in.nextInt();
        System.out.println("enter the range of table:");
        int n = in.nextInt();
        System.out.println("Table of " + number +" is :");
        for (int i = 1; i <= n; i++) {
            System.out.println(number * i);
        }
    }
}
