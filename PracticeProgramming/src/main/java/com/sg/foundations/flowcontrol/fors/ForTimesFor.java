package com.sg.foundations.flowcontrol.fors;

import java.util.Scanner;

public class ForTimesFor {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        boolean isValid = false;
        int timesTable = 0;
        int correctAnswers = 0;


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
            int userAnswer = 0;

            try{
                System.out.print(i + " * " + timesTable + " is: ");
                userAnswer = Integer.parseInt(userInput.nextLine());
            } catch(NumberFormatException ex) {
                System.out.println("Please input a valid integer.");
            }

            if(userAnswer == result) {
                System.out.println("Correct!");
                correctAnswers++;
            } else {
                System.out.println("Sorry no, the answer is: " + result);
            }
        }

        System.out.println("You got " + correctAnswers + " correct.");

        if(correctAnswers < 8) {
            System.out.println("Ouch, looks like you should study a bit more...");
        }

        if(correctAnswers > 13){
            System.out.println("Wow! You know your times table pretty well!");
        }
    }
}
