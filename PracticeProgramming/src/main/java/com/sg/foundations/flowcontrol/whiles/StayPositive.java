package com.sg.foundations.flowcontrol.whiles;

import java.util.Scanner;

public class StayPositive {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int start = 0;
        boolean isValid = false;

        do {
           try {
               if(start < 0) {
                   System.out.println("The integer can not be a negative integer.");
               }
               System.out.print("What number should I count down from? ");
               start = Integer.parseInt(userInput.nextLine());
               isValid = true;
           } catch(NumberFormatException ex) {
               System.out.println("Please input a valid integer.");
           }
        } while(!isValid || start < 0);

        System.out.println("");
        System.out.println("Here goes!");
        System.out.println("");

        while(start >= 0) {
            for(int i = 0; i < 10; i++) {
                if(start >= 0) {
                    System.out.print(start + " ");
                    start--;
                }
            }
            System.out.println("");
        }

        System.out.println("");
        System.out.println("Blast off!");
    }
}
