/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.foundations.practice_exercises;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Nickee Coco
 */
public class DogGenetics {

    public static void main(String[] args) {
        final int NUMBER_OF_DOG_RACES = 5;
        String dogName;
        
        Scanner userInput = new Scanner(System.in);
        
        System.out.print("What is your dog's name? ");
        dogName = userInput.nextLine();      
        
        int currentBound = 100;

        int[] percentages = new int[NUMBER_OF_DOG_RACES];
        
        // the last value not be generated randomly
        // it will be the remainder value to reach 100 total
        for (int i = 0; i < percentages.length - 1; i++) { 
            Random rd = new Random();
            
            if(currentBound > 0) {
                int rdValue = rd.nextInt(currentBound + 1); // add one to include the value of currentBound
                percentages[i] = rdValue;
                currentBound -= rdValue;
            } else {
                break;
            }
        }
        
        percentages[NUMBER_OF_DOG_RACES - 1] = currentBound;
        
        System.out.println("Well then, I have this highly reliable report on " + dogName + "'s prestigious background right here.");
        System.out.println();
        
        System.out.println(dogName + " is:");
        System.out.println();
        
        System.out.println(percentages[0] + "% St. Bernard");
        System.out.println(percentages[1] + "% Chihuahua");
        System.out.println(percentages[2] + "% Dramatic RedNosed Asian Pug");
        System.out.println(percentages[3] + "% Common Cur");
        System.out.println(percentages[4] + "% King Doberman");
        
        System.out.println();
        System.out.println("Wow, that's QUITE the dog!");
    }
}
