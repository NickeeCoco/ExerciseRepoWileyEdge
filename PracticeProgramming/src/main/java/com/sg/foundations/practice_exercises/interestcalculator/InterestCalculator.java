package com.sg.foundations.practice_exercises.interestcalculator;

import java.text.DecimalFormat;
import java.util.Scanner;

public class InterestCalculator {

    Scanner userInput = new Scanner(System.in);

    double annualInterestRate = 0;
    double amountInvested = 0;
    double yearsInvesting = 0;
    int period = 0;

    public void calculateInterests() {

        while (amountInvested <= 0) {
            System.out.print("How much do you want to invest? ");
            amountInvested = userInput.nextInt();
        }

        while (yearsInvesting <= 0) {
            System.out.print("How many years are investing? ");
            yearsInvesting = userInput.nextInt();
        }

        while (annualInterestRate <= 0) {
            System.out.print("What is the annual interest rate % growth? ");
            annualInterestRate = userInput.nextInt();
        }

        while (period <= 0 && period != 4 && period != 12 && period != 365) {
            System.out.print("What is the interest compound period? (4=quarterly, 12=monthly, 365=daily)");
            period = userInput.nextInt();
        }

        System.out.println("Calculating...");

        double startAmount = amountInvested;

        // for each year investing
        for (int i = 1; i <= yearsInvesting; i++) {
            DecimalFormat df = new DecimalFormat("0.00");

            double amountEarned = calculateYearlyInterests(startAmount, annualInterestRate, period)[1];
            double newAmountWithInterests = calculateYearlyInterests(startAmount, annualInterestRate, period)[0];

            System.out.println("Year " + i + ":");
            System.out.println("Began with $" + df.format(startAmount));
            System.out.println("Earned $" + df.format(amountEarned));
            System.out.println("Ended with $" + df.format(newAmountWithInterests));
            System.out.println("");

            startAmount = newAmountWithInterests;
        }
    }

    public static double[] calculateYearlyInterests(double startAmount, double interestRate, int period) {
        double currentAmount = startAmount;

        double periodInterestRate = interestRate / period;

        for (int i = 0; i < period; i++) {
            currentAmount = currentAmount * (1 + (periodInterestRate) / 100);
        }

        double[] returnValues = {currentAmount, currentAmount - startAmount};
        return returnValues;
    }
}
