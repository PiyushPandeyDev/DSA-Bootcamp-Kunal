package com.fundamental;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter employeeID:");
        int iD = in.nextInt();
        System.out.println("Department:");
        String department = in.next();

        switch (iD) {
            case 1 -> {
                System.out.println("Piyush Pandey");
                switch (department) {
                    case "IT" -> System.out.println("IT department");
                    case "Management" -> System.out.println("Management department");
                    case "Medical" -> System.out.println("Medical department");
                    case "Administration" -> System.out.println("administration department");
                }

            }
            case 2 -> {
                System.out.println("Avinash");
                switch (department) {
                    case "IT" -> System.out.println("IT department");
                    case "Management" -> System.out.println("Management department");
                    case "Medical" -> System.out.println("Medical department");
                    case "Administration" -> System.out.println("administration department");
                }

            }
        }
        }
    }

