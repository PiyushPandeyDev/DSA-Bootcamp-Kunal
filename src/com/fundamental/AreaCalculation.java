package com.fundamental;

import java.util.Scanner;

public class AreaCalculation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the valid shape:");
        String nShape = in.next();
        findArea(nShape);
    }
    static void findArea(String shape){
        Scanner in = new Scanner(System.in);
        switch (shape) {
            case "circle" -> {
                System.out.println("give me the radius of the circle:");
                int radius = in.nextInt();
                double area = 3.14 * radius * radius;
                System.out.println("Area of circle is :" + area);
                break;
            }
            case "Rectangle" -> {
                System.out.println("enter the length and width of rectangle:");
                int length = in.nextInt();
                int width = in.nextInt();
                int area = length * width;
                System.out.println("Area of Rectangle is :" + area);

                break;
            }
            case "Square" -> {
                System.out.println("enter the one side of the Square:");
                int side = in.nextInt();
                int area = 4 * side;
                System.out.println("Area of Square is :" + area);
                break;
            }
            default -> {
                System.out.println("enter the valid shape name:");
            }
        }
    }
}
