package com.sg.foundations.flowcontrol.fors;

import java.util.Scanner;

public class TheCount {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        boolean isValid = false;

        int start = 0;
        int end = 0;
        int increment = 0;

        System.out.println("*** I LOVE TO COUNT! LET ME SHARE MY COUNTING WITH YOU! ***");

        do{
            isValid = false;
            try{
                System.out.print("Start at: ");
                start = Integer.parseInt(userInput.nextLine());
                isValid = true;
            } catch(NumberFormatException ex) {
                System.out.println("Please give me a valid integer!");
            }
        } while(!isValid);

        do{
            isValid = false;
            try{
                System.out.print("End at: ");
                end = Integer.parseInt(userInput.nextLine());
                isValid = true;
            } catch(NumberFormatException ex) {
                System.out.println("Please give me a valid integer!");
            }
        } while(!isValid);

        do{
            isValid = false;
            try{
                System.out.print("Count by: ");
                increment = Integer.parseInt(userInput.nextLine());
                isValid = true;
            } catch(NumberFormatException ex) {
                System.out.println("Please give me a valid integer!");
            }
        } while(!isValid);

        for(int i = start; i <= end;) {
            for(int j = 0; j < 3; j++) {
                if(i <= end) {
                    System.out.print(i + " ");
                    i += increment;
                }
            }
            if(i <= end) {
                System.out.print(" - Ah ah ah!\n");
            }
        }
    }
}
