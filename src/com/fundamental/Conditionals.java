package com.fundamental;

public class Conditionals {
    public static void main(String[] args) {

      /*  syntax of if Statements:
        if ( boolean expression T or F){
            //body
        }else{
            //do this
        }
    }     */
        int salary =14500;
        if(salary >20000){
            salary = salary +2000;
        }else{
            salary =salary +1000;
        }
        System.out.println("new credited salary is :" + salary);

    }
}
