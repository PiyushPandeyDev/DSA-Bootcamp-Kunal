package com.ArrayandArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
//        list.add(234);
//        list.add(238);
//        list.add(254);
//        list.add(434);
//        list.add(834);
//        list.add(232);
       // System.out.println(list.contains(2113));
       // System.out.println(list.contains(254));
//        System.out.println(list);
//        list.set(0,99);
//        System.out.println(list);
//        list.remove(2);
//        System.out.println(list);
        for (int i=0;i<5; i++){
            list.add(in.nextInt());
        }
        //System.out.println(list);

       // get item at any index
        for (int i=0;i<5;i++){
            System.out.println(list.get(i)); // pass index here,list[index] will not work here,

        }

    }
}
