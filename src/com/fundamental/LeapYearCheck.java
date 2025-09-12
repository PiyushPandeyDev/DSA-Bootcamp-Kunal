package com.fundamental;

import java.util.Scanner;

public class LeapYearCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the year :");
        Long year = in.nextLong();
        /*if((year%4 ==0 && year%100 != 0) || year%400 ==0){
            System.out.println(year + " leap year");
        }else
            System.out.println(year + " is not leap year");*/
        // 2nd approach
        if(isLeapYear(year)){
            System.out.println(year + " leap year");
        }else
            System.out.println(year + " is not leap year");
    }
    public static boolean isLeapYear(long year){
        if((year%4 ==0 && year%100 != 0) || year%400 ==0){
            return true;
        }else
            return false;

    }
}
