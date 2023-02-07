package com.sg.foundations.practice_exercises.factorizer;

import java.util.Scanner;

public class Factorizer {
    public int number = 0;
    public int nbOfFactors = 0;
    public int factorsSum = 0;
    boolean isPerfect = false;
    boolean isPrime = false;

    public Scanner userInput = new Scanner(System.in);

    public void factorize() {

        // ask for number above 1
        while (number < 1) {
            System.out.print("What number would you like to factor? ");
            number = userInput.nextInt();
        }

        // determine number of factors to initialize factors array
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                nbOfFactors++;
            }
        }

        // initialize factors array
        int[] factors = new int[nbOfFactors];
        int factorsIndex = 0;

        // get all factors and add them to factors array
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                factors[factorsIndex] = i;
                factorsIndex++;
            }
        }

        // print result
        System.out.println("The factors of " + number + " are:");
        for (int i = 0; i < factors.length; i++) {
            System.out.print(factors[i] + " ");
        }

        System.out.println();
        System.out.println(number + " has " + factors.length + " factors.");

        // sum all factors and store result
        for (int i = 0; i < factors.length; i++) {
            factorsSum += factors[i];
        }

        // check if number is perfect
        if (number == factorsSum) {
            isPerfect = true;
        }

        // check if number is prime
        if (factors.length == 1) {
            isPrime = true;
        }

        // print results
        System.out.println(number + (isPerfect ?
                " is a perfect number." :
                " is not a perfect number."));

        System.out.println(number + (isPrime ?
                " is a prime number." :
                " is not a prime number."));
    }
}
