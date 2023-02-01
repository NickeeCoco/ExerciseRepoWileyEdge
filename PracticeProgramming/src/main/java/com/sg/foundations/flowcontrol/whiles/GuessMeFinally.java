package com.sg.foundations.flowcontrol.whiles;

import java.util.Random;
import java.util.Scanner;

public class GuessMeFinally {
    public static void main(String[] args) {
        Random randomizer = new Random();

        int answer = randomizer.nextInt(100 + 100) - 100;
        int guess = 0;
        boolean isValid = false;
        boolean isPlaying = true;

        int tries = 0;

        Scanner userInput = new Scanner(System.in);

        System.out.println("I've chosen an number between -100 and 100. Bet you can't guess it!");

        while(isPlaying) {
            do {
                try {
                    guess = Integer.parseInt(userInput.nextLine());
                    isValid = true;
                    tries++;
                } catch (NumberFormatException ex) {
                    System.out.println("Please input a valid number");
                }
            } while (!isValid);

            System.out.println("Your guess: " + guess);
            System.out.println();

            if (guess == answer) {
                if(tries == 1) {
                    System.out.println("Wow, nice guess! That was it!");
                } else {
                    System.out.println("Finally! It's about time you got it!");
                }
                isPlaying = false;
            }

            if (guess > answer) {
                System.out.println(guess + "? Ha, nice try - too high! Try again!");
            }

            if (guess < answer) {
                System.out.println(guess + "? Ha, nice try - too low! Try again!");
            }
        }
    }
}
