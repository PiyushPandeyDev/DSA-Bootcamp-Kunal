package com.fundamental;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the character:");
        char ch = in.next().trim().charAt(0);

        if(ch>='a' && ch <='z'){
            System.out.println("lowercase");
        }else{
            System.out.println("Uppercase");
        }
    }
}
