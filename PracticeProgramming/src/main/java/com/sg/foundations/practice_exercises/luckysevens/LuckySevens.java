package com.sg.foundations.practice_exercises.luckysevens;

import java.util.Random;
import java.util.Scanner;

public class LuckySevens {

    Scanner userInput = new Scanner(System.in);

    int totalAmount = 0;
    int rolls = 0;
    int maxAmount = 0;
    int maxAmountRoll = 0;

    public void playGame() {

        while (totalAmount <= 0) {
            try {
                System.out.print("How many dollars do you have? ");
                totalAmount = Integer.parseInt(userInput.nextLine());
            } catch (NumberFormatException ex) {
                System.out.println("Please input an integer!");
            }
        }

        // set max amount to initial amount
        maxAmount = totalAmount;

        while (totalAmount > 0) {
            rolls++;

            if (rollDice()) {
                totalAmount += 4;
                if (totalAmount > maxAmount) {
                    maxAmount = totalAmount;
                    maxAmountRoll = rolls;
                }
            } else {
                totalAmount -= 1;
            }
        }

        System.out.println("You are broke after " + rolls + " rolls.");
        System.out.println("You should have quit after " + maxAmountRoll + " rolls when you had $" + maxAmount + ".");
    }


    public boolean rollDice() {
        Random rdm = new Random();

        int die1 = rdm.nextInt(6) + 1;
        int die2 = rdm.nextInt(6) + 1;

        int sum = die1 + die2;

        if (sum != 7) {
            return false;
        }

        return true;
    }
}
