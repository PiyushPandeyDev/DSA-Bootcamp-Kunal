package com.fundamental;

public class CountNums {
    public static void main(String[] args) {
        int num = 125457;
        //check the occurrence of 5 in num?
        int count = 0;
        while (num > 0) {
            int n = num % 10;
            if (n == 5) {
                count++;
            }
            num = num / 10;
        }
        System.out.println(count);
    }
}
