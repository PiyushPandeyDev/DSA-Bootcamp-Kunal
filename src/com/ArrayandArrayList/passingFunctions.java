package com.ArrayandArrayList;

import java.util.Arrays;

public class passingFunctions {
    public static void main(String[] args) {
        int[] num = {3,4,5,7,8};
        System.out.println(Arrays.toString(num));
        changeNum(num);
        System.out.println(Arrays.toString(num));
    }
    static void changeNum(int[] arr){
        arr[1]=99;
    }
}
