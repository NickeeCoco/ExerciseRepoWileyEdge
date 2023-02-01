package com.sg.foundations.flowcontrol.random;

import java.util.Random;
import java.util.Scanner;

public class GuessMeMore {
    public static void main(String[] args) {
        Random randomizer = new Random();

        int answer = randomizer.nextInt(100 + 100) - 100;
        int guess = 0;
        boolean isValid = false;

        Scanner userInput = new Scanner(System.in);

        System.out.println("I've chosen an number between -100 and 100. Bet you can't guess it!");

        do {
            isValid = false;
            try {
                guess = Integer.parseInt(userInput.nextLine());
                isValid = true;
            } catch (NumberFormatException ex) {
                System.out.println("Please input a valid number");
            }
        } while (!isValid);

        System.out.println("your guess: " + guess);
        System.out.println();

        if (guess == answer) {
            System.out.println("Wow, nice guess! That was it!");
        }

        if (guess > answer) {
            System.out.println(guess + "? Ha, nice try - too high! Try again!");

            do {
                isValid = false;
                try {
                    guess = Integer.parseInt(userInput.nextLine());
                    isValid = true;
                } catch (NumberFormatException ex) {
                    System.out.println("Please input a valid number");
                }
            } while (!isValid);

            if (guess == answer) {
                System.out.println("Wow, nice guess! That was it!");
            }

            if (guess > answer) {
                System.out.println("Too high... The answer was " + answer);
            }

            if (guess < answer) {
                System.out.println("Too low... The answer was " + answer);
            }
        }

        if (guess < answer) {
            System.out.println(guess + "? Ha, nice try - too low! Try again!");

            do {
                isValid = false;
                try {
                    guess = Integer.parseInt(userInput.nextLine());
                    isValid = true;
                } catch (NumberFormatException ex) {
                    System.out.println("Please input a valid number");
                }
            } while (!isValid);

            if (guess == answer) {
                System.out.println("Wow, nice guess! That was it!");
            }

            if (guess > answer) {
                System.out.println("Too high... The answer was " + answer);
            }

            if (guess < answer) {
                System.out.println("Too low... The answer was " + answer);
            }
        }

    }
}
