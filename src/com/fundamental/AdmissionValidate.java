package com.fundamental;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class AdmissionValidate {
    //candidate who obtained mare than 60% average marks is eligible for admission
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter the valid name of candidate :");
        String userName = in.next();
        if(checkValidity(userName)){
            System.out.println(userName + ":" + "is eligible for admission");
        }else
            System.out.println(userName +":" + "is not eligible for admission");

    }
    static boolean checkValidity(String name){
        String fileName ="E:\\Marksheets.txt";
        String line;
        try{
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            while ((line=br.readLine())!=null){
                if(line.toLowerCase().contains("Name")) {
                    String[] parts = line.split(":");
                    if(parts.length==2){
                        String uName = parts[0].trim();
                        String[] marks = parts[1].split(",");
                        int noOfSbj = marks.length;
                        if(uName.equalsIgnoreCase(name)){
                            int total =0;
                            for(String mrk : marks){
                                total += Integer.parseInt(mrk);
                            }
                            double avg = total/noOfSbj;
                            return (avg>60);
                        }
                    }
                }



            }
        }catch (IOException e){
            e.printStackTrace();
        }
       return false;

    }


}
