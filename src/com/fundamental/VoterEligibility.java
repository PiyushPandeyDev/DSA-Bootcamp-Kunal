package com.fundamental;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class VoterEligibility {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(System.in);
        System.out.println("plz enter the valid Name:");
        String name = in.next();
       if(validateUser(name)) {
           System.out.println(name + "---is valid candidate for voting");
       }else
           System.out.println(name + "---is not valid candidate for voting.");
    }
    static boolean validateUser(String name)  {
        String filepath = "E:\\data.txt";
        //System.out.println("Looking for file at: " + filepath);
       try{
           BufferedReader br = new BufferedReader(new FileReader(filepath));
           String line;
           while( (line=br.readLine()) !=null){
               //skip the header if present("name : Age")
               if (line.toLowerCase().contains("name")) continue;
               String[] parts = line.split(":");
               if(parts.length==2){
                   String userName = parts[0].trim();
                   int age = Integer.parseInt(parts[1].trim());
                   if(userName.equalsIgnoreCase(name)){
                         return age>18;
                   }else {
                System.out.println("provided name is not in list, plz enter the valid name.");
                 break;
                   }

               }
           }


       }catch (IOException e){
           e.printStackTrace();
       }
     return false;
    }




}
