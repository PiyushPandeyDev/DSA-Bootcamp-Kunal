package com.fundamental;

import java.util.Scanner;

public class Questions {
    public static void main(String[] args) {
       // Scanner in = new Scanner(System.in);
       // System.out.println("enter the number :");
       // int n = in .nextInt();
       // Boolean ans = isPrime(n);
       // System.out.println(ans);
        //boolean ans =isArmstrong(i);

        for(int i= 100; i<1000; i++){
           if(isArmstrong(i))
            System.out.println(i + " ");
        }

    }
    static boolean isPrime(int a){
        if (a<=1){
            return false;
        }
        int c =2;
        while (c*c<=a){
            if(a%c==0){
                return false;
            }
            c++;
        }
        return c * c > a;

    }
    static boolean isArmstrong(int n){
        int original =n;
        int sum=0;
        while (n>0){
            int rem =n%10;
             n = n/10;
             sum += rem*rem*rem;
        }
        return sum == original;
    }
}
