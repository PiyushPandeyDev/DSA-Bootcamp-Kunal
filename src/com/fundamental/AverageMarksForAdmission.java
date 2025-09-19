package com.fundamental;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class AverageMarksForAdmission {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the student name:");
        String uName =in.next();
       if(validateStudent(uName)){
           System.out.println(uName + ":" +"is valid student for admission");
       }else
           System.out.println(uName + ":" +"is not valid student for admission");
    }

    static boolean validateStudent(String name){
        String path = "E:\\Marksheets.txt";
        String line;
        int total =0;
        int subject =0;
        boolean stuentFound = false;
        try {
            BufferedReader br = new BufferedReader(new FileReader(path));

            while ((line= br.readLine())!=null){
                line = line.trim();
                if(line.toLowerCase().contains("name") && line.toLowerCase().contains(name)){
                    stuentFound = true;
                }
                if(stuentFound){
                    if(line.startsWith("Math") || line.startsWith("Physics") || line.startsWith("Chemistry")){
                        String[] parts = line.split(":");
                        int marks = Integer.parseInt(parts[1].trim());
                        total += marks;
                        subject++;

                    }
                }
                if (line.startsWith("----")){
                    break;
                }

            }
            if(stuentFound && subject==3){
                int avrg = total/subject;
                return avrg>=60;
            }else if(!stuentFound){
                System.out.println("provided name is not valid, enter valid name.");
            }

        }catch (IOException e){
            e.printStackTrace();
        }




      return false;
    }

}
