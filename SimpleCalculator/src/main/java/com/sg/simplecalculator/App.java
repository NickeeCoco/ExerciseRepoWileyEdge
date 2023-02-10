package com.sg.simplecalculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        SimpleCalculator calculator = new SimpleCalculator();
        Scanner userInput = new Scanner(System.in);

        int userChoice;
        String operation;
        double operand1 = 0;
        double operand2 = 0;
        Double result;

        boolean isValid = false;
        boolean running = false;

        do{
            running = true;

            userChoice = displayMenuAndGetUserInput();

            switch (userChoice) {
                case 1:
                    operation = "+";
                    break;
                case 2:
                    operation = "-";
                    break;
                case 3:
                    operation = "*";
                    break;
                case 4:
                    operation = "/";
                    break;
                default:
                    running = false;
                    System.out.println();
                    System.out.println("Thank you for using the calculator!");
                    return;
            }

            do {
                isValid = false;

                try {
                    System.out.print("Operand 1? ");
                    operand1 = userInput.nextDouble();
                    isValid = true;
                } catch(InputMismatchException ex) {
                    System.out.println("Operand 1 must be a valid number.");
                }

            } while (!isValid);

            do {
                isValid = false;

                try {
                    System.out.print("Operand 2? ");
                    operand2 = userInput.nextDouble();
                    isValid = true;
                } catch(InputMismatchException ex) {
                    System.out.println("Operand 2 must be a valid number.");
                }

            } while (!isValid);

            // avoid dividing by 0
            if(operation.equals("/") && operand2 == 0) {
                System.out.println("It is not possible to divide by 0!");
                System.out.println();
            } else {
                result = calculator.calculate(operation, operand1, operand2);

                System.out.println(operand1 + " " + operation + " " + operand2 + " = " + result);
                System.out.println();
            }

        } while(running);
    }

    private static int displayMenuAndGetUserInput() {
        Scanner userInput = new Scanner(System.in);
        int userChoice;
        boolean isValid = false;

        do {
            System.out.println("/******** SUPER CALCULATOR ********/");
            System.out.println("Choose an option: ");
            System.out.println("1/ Addition");
            System.out.println("2/ Subtraction");
            System.out.println("3/ Multiplication");
            System.out.println("4/ Division");
            System.out.println("5/ Exit");

            userChoice = userInput.nextInt();

            if(userChoice > 0 && userChoice < 6) {
                isValid = true;
            } else {
                System.out.println("Please choose a valid option between 1 and 5.");
                System.out.println();
            }
        } while(!isValid);

        return userChoice;
    }
}
