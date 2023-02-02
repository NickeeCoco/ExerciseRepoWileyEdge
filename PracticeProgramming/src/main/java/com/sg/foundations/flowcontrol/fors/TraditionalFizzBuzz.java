package com.sg.foundations.flowcontrol.fors;

import java.util.Scanner;

public class TraditionalFizzBuzz {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        int userRequest = 0;
        int fizzesAndBuzzes = 0;

        System.out.print("How many units of fizzing and buzzing do you need in your life? ");
        userRequest = userInput.nextInt();

        for (int i = 0; fizzesAndBuzzes < userRequest; i++) {
            if (i != 0) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("fizz buzz");
                    fizzesAndBuzzes++;
                } else if (i % 3 == 0) {
                    System.out.println("fizz");
                    fizzesAndBuzzes++;
                } else if (i % 5 == 0) {
                    System.out.println("buzz");
                    fizzesAndBuzzes++;
                } else {
                    System.out.println(i);
                }
            } else {
                System.out.println(i);
            }
        }
        System.out.println("TRADITION!!!!!");
    }
}
