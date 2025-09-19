package com.fundamental;

import java.util.Scanner;

public class SumCalculation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the n number for sum :");
        int n = in.nextInt();
        findSum(n);
    }
    static void findSum(int a){
        int sum=0;
        for(int i =1;i<=a;i++){
            sum +=i;

        }
        System.out.println("sum of the nth no:" +"" +sum);
    }
}
