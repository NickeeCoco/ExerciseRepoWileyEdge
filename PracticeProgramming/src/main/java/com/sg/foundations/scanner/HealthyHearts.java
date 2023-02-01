/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.foundations.scanner;

import java.util.Scanner;

/**
 *
 * @author Nickee Coco
 */
public class HealthyHearts {
    public static void main(String[] args) {
        
        int age = 0;
        int maximumHeartRate;
        
        // values for calculation
        double minRangeD;
        double maxRangeD;
        
        // values for display
        int minRangeInt;
        int maxRangeInt;
        
        boolean isValid = false;
        
        Scanner userInput = new Scanner(System.in);
        
        do {
            try {
                System.out.println("What is your age?");
                int input = Integer.parseInt(userInput.nextLine());
                if(input <= 0 || input > 130){
                    System.out.println("Please input an integer between 1 and 130");
                } else {
                    age = input;
                    isValid = true;
                }
            } catch(NumberFormatException ex) {
                System.out.println("Please input an integer between 1 and 130");
            }
        } while(!isValid);
        
        maximumHeartRate = 220 - age;
        minRangeD = maximumHeartRate / 2;
        maxRangeD = 85.0 / 100.0 * maximumHeartRate; 
        
        minRangeInt = (int) Math.ceil(minRangeD);
        maxRangeInt = (int) Math.ceil(maxRangeD);
        
        System.out.println("Your maximum heart rate should be " + maximumHeartRate + " beats per minute.");
        System.out.println("Your target HR Zone is " + minRangeInt + " - " + maxRangeInt + " beats per minute.");
    }
}
