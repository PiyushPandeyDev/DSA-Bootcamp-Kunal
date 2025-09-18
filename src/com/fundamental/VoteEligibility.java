package com.fundamental;

import java.util.Scanner;

public class VoteEligibility {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the age :");
        int age = in.nextInt();
        if(checkEligibility(age)){
            System.out.println("eligible for vote");
        }else {
            System.out.println("eligible for not vote");
        }
    }
    static boolean checkEligibility(int age){
        return age>18;

    }

}
