package com.sg.foundations.flowcontrol.random;

import java.util.Random;
import java.util.Scanner;

public class HighRoller {
    public static void main(String[] args) {
        Random diceRoller = new Random();
        Scanner userInput = new Scanner(System.in);

        String strDieSides;
        int dieSides = 0;

        boolean isValid = false;

        do {
            try{
                System.out.println("How many sides does a die have?");
                strDieSides = userInput.nextLine();
                dieSides = Integer.parseInt(strDieSides);
                isValid = true;
            } catch(NumberFormatException ex) {
                System.out.println("This value could not be parsed into an integer.");
            }
        } while(!isValid);

        int rollResult = diceRoller.nextInt(dieSides) + 1;

        System.out.println("TIME TO ROOOOOOLL THE DICE!");
        System.out.println("I rolled a " + rollResult);

        if(rollResult == 1) {
            System.out.println("You rolled a critical failure!");
        }

        if(rollResult == dieSides) {
            System.out.println("You rolled a critical! Nice job!");
        }
    }
}
