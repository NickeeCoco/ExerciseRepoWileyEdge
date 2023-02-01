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
public class DontForgetToStoreIt {
    public static void main(String[] args) {
        
        int meaningOfLifeAndEverything = 42;
        double pi = 3.14159;
        String cheese, color;
        
        boolean isMeaningValid = false;
        boolean isPiValid = false;
        
        Scanner inputReader = new Scanner(System.in);
        
        do {
            try {
                System.out.println("Give me pi to at least 5 decimals: ");
                pi = Double.parseDouble(inputReader.nextLine());
                isPiValid = true;
            } catch(NumberFormatException ex) {
                System.out.println("This is not a valid number");
            }
        } while(!isPiValid);
        
        
        // We used Double.parseDouble but meaningOfLifeAndEverything is an INT
        // so we'll have to use Integer.parseInt
        do {
            try {
                System.out.println("What is the meaning of life, the universe & everything? ");
                meaningOfLifeAndEverything = Integer.parseInt(inputReader.nextLine());
                isMeaningValid = true;
            } catch(NumberFormatException ex) {
                System.out.println("This is not a valid number");
            }
        } while(!isMeaningValid);
        
        
        System.out.println("What is your favorite kind of cheese? ");
        cheese = inputReader.nextLine();
        
        System.out.println("Do you like the color red or blue more? ");
        color = inputReader.nextLine();
        
        System.out.println("Ooh, " + color + " " + cheese + " sounds delicious!");
        System.out.println("The circumference of life is " + (2 * pi * meaningOfLifeAndEverything));
        
    }
}
