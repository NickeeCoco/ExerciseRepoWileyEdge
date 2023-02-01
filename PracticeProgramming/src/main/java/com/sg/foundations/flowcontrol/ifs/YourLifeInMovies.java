/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.foundations.flowcontrol.ifs;

import java.time.Year;
import java.util.Scanner;

/**
 *
 * @author Nickee Coco
 */
public class YourLifeInMovies {
    public static void main(String[] args) {
        String name;
        int yearOfBirth = 0;
        int currentYear = Year.now().getValue();
        boolean isValid = false;
        
        Scanner userInput = new Scanner(System.in);
        
        System.out.print("Hey, let's play a game! What's your name? ");
        name = userInput.nextLine();
        
        do{
            try{
                System.out.print("Ok, " + name + ", when were you born? ");
                yearOfBirth = Integer.parseInt(userInput.nextLine());
                if(yearOfBirth < 1900 || yearOfBirth > currentYear) {
                    System.out.println("Please enter a valid year of birth.");
                } else {
                    isValid = true;
                }
            }catch(NumberFormatException ex){
                System.out.println("That's not a valid number");
            }
        }while(!isValid);
        
        System.out.println("Well " + name + "...");
        
        if(yearOfBirth < 2005) {
            System.out.println("Did you know that Pixar's 'Up' came out over a decade ago?");
        }
        
        if(yearOfBirth < 1995) {
            System.out.println("Did you know that the first Harry Potter came out over 15 years ago?");
        }
        
        if(yearOfBirth < 1985) {
            System.out.println("Did you know that Space Jam came out not last decade, but the one before THAT?");
        }
        
        if(yearOfBirth < 1975) {
            System.out.println("Did you know that the original Jurassic Park release is closer to the first lunar landing than it is to today?");
        }
        
        if(yearOfBirth < 1965) {
            System.out.println("Did you know that the MASH TV series has been around for almost half a century?");
        }
    }
}
