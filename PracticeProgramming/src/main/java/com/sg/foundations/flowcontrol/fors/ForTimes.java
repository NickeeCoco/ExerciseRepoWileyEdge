package com.sg.foundations.flowcontrol.fors;

import java.util.Scanner;

public class ForTimes {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        boolean isValid = false;
        int timesTable = 0;


        do {
            try{
                System.out.print("Which times table shall I recite? ");
                timesTable = Integer.parseInt(userInput.nextLine());
                isValid = true;
            } catch(NumberFormatException ex) {
                System.out.println("Please input a valid integer.");
            }
        } while(!isValid);

        for(int i = 1; i <= 15; i++) {
            int result = i * timesTable;
            System.out.println(i + " * " + timesTable + " is: " + result);
        }
    }
}
