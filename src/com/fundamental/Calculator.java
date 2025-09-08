package com.fundamental;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        //Take input from user till user does not press 'x' or 'x';
        int ans=0;
        while(true){
            //take the operator as input;
            System.out.println("Enter the operator :");
            char opp = in.next().trim().charAt(0);
            if(opp=='+'|| opp=='-' || opp=='*' || opp=='%'|| opp=='/'){
                // input two numbers:
                System.out.println("Enter two numbers:");
                int num1 = in.nextInt();
                int num2 = in.nextInt();

                if(opp=='+'){
                    ans =num1+num2;
                }if(opp=='-'){
                    ans =num1-num2;
                }if(opp=='*'){
                    ans = num1*num2;
                }if(opp=='/'){
                    if(num2!=0){
                        ans =num1/num2;
                    }
                }if(opp=='%'){
                    ans =num1%num2;
                }
            }else if(opp == 'X' || opp=='x'){
                break;
            }else{
                System.out.println("invalid operations!");
            }
            System.out.println("Ans :" +ans);
        }

    }
}
