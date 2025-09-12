package com.fundamental;

import java.util.Scanner;

public class SwitchCaseExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // System.out.println("Enter the fruit Name:");
        //  String fruit = in.next();

//        if(fruit.equals("mango")){
//            System.out.println("this is sweet fruit");
//        }if(fruit.equals("orange")){
//            System.out.println("this is sour fruit");
//        }
        // we can replace above code by Switch cases. that is more efficient and clean.

        /*switch (fruit){
            case"Mango":
                System.out.println("king of fruit.");
                break;
            case"Apple":
                System.out.println("sweet red fruit.");
                break;
            case"orange":
                System.out.println("sour fruit.");
                break;
            case"Banana":
                System.out.println("A powerful fruit.");
                break;
            case"Grapes":
                System.out.println("small and sweet fruit.");
                break;
            default:
                System.out.println("please enter valid fruit.");
        }*/
        // we can replace the above code by enhanced switch case..
        /*switch (fruit) {
            case "Mango" -> System.out.println("king of fruit.");
            case "Apple" -> System.out.println("sweet red fruit.");
            case "orange" -> System.out.println("sour fruit.");
            case "Banana" -> System.out.println("A powerful fruit.");
            case "Grapes" -> System.out.println("small and sweet fruit.");
            default -> System.out.println("please enter valid fruit.");
        }*/
      /*  System.out.println("enter the Number of day:");
        int day = in.nextInt();

        switch (day) {
            case 1 -> System.out.println("Sunday");
            case 2 -> System.out.println("Monday");
            case 3 -> System.out.println("Tuesday");
            case 4 -> System.out.println("Wednesday");
            case 5 -> System.out.println("Thursday");
            case 6 -> System.out.println("Friday");
            case 7 -> System.out.println("Saturday");
            default -> System.out.println("plz enter valid no for day");



        }*/
        System.out.println("enter the name of day:");
         String day = in.next();
        /* switch(day){
             case"Monday":
             case"Tuesday":
             case"Wednesday":
             case"Thursday":
             case"Friday":
                 System.out.println("weekday..");
                 break;
             case"Saturday":
             case"Sunday":
                 System.out.println("weekend..");
                 break;
             default:
                 System.out.println("plz enter valid name of day.");


         }*/
        // we can replace this code with enhanced switch case.
        // this code looks more sophisticated.

        switch (day) {
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> System.out.println("weekday..");
            case "Saturday", "Sunday" -> System.out.println("weekend..");
            default -> System.out.println("plz enter valid name of day.");
        }



    }
}
