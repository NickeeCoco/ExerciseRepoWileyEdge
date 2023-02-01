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
public class DoItBetter {
    public static void main(String[] args) {
        
        double miles;
        int hotDogs, languages;
        
        boolean isMilesValid = false;
        boolean isHotDogsValid = false;
        boolean isLanguagesValid = false;
        
        Scanner userInput = new Scanner(System.in);
        
        do {
            try {
                System.out.println("How many miles can you run?");
                miles = Double.parseDouble(userInput.nextLine());
                System.out.print("That's it??? I can run AT LEAST ");
                System.out.print(miles * 2 + 1);
                System.out.println(" miles!");
                isMilesValid = true;
            } catch(NumberFormatException ex) {
                System.out.println("Please input a valid number!");
            }
            
        } while(!isMilesValid);
                
        System.out.println();
        
        do {
            try {
                System.out.println("How many hot dogs can you eat?");
                hotDogs = Integer.parseInt(userInput.nextLine());
                System.out.print("That's it??? I can eat AT LEAST ");
                System.out.print(hotDogs * 2 + 1);
                System.out.println(" hot dogs!");
                isHotDogsValid = true;
            } catch(NumberFormatException ex) {
                System.out.println("Please input a valid number!");
            }
        } while(!isHotDogsValid);
        
        System.out.println();
        
        do {
            try {
                System.out.println("How many languages can you speak?");
                languages = Integer.parseInt(userInput.nextLine());
                System.out.print("That's it??? I can speak AT LEAST ");
                System.out.print(languages * 2 + 1);
                System.out.println(" languages!");
                isLanguagesValid = true;
            } catch(NumberFormatException ex) {
                System.out.println("Please input a valid number!");
            }
        } while(!isLanguagesValid);
        
    }
}
