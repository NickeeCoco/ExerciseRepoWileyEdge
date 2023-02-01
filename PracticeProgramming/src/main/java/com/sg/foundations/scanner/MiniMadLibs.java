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
public class MiniMadLibs {
    public static void main(String[] args) {
        
        System.out.println("Let's play MAD LIBS!");
        
        String noun1 = getStringInput("I need a noun: ");
        String adjective1 = getStringInput("I need an adjective: ");
        String noun2 = getStringInput("Another noun: ");
        int number = getIntegerInput("And a number: ");
        String adjective2 = getStringInput("Another adjective: ");
        String pluralNoun1 = getStringInput("A plural noun: ");
        String pluralNoun2 = getStringInput("Another one: ");
        String pluralNoun3 = getStringInput("One more: ");
        String verbInfinitive = getStringInput("A verb (infinitive form): ");
        String verbPastParticiple = getStringInput("Same verb (past participle: ");
        
        System.out.println("*** NOW LET'S GET MAD (libs) ***");
        System.out.println(noun1 + ": the " + adjective1 + " frontier. "
                + "These are the voyages of the starship " + noun2 + ". "
                + "Its " + number + "-year mission: to explore strange " + adjective2 + " " + pluralNoun1 + ", "
                + "to seek out " + adjective2 + " " + pluralNoun2 + " and " + adjective2 + " " + pluralNoun3 + ", "
                + "to boldly " + verbInfinitive + " where no one has " + verbPastParticiple + " before." );
    }
    
    public static String getStringInput(String prompt) {
        Scanner userInput = new Scanner(System.in);
        String input;
        boolean isValid = false;
        
        do {
            System.out.print(prompt);
            input = userInput.nextLine();
            
            if(!input.isEmpty()) {
                isValid = true;
            } 
        } while(!isValid);
        
        return input;
    }
    
    public static int getIntegerInput(String prompt) {
        Scanner userInput = new Scanner(System.in);
        String stringInput;
        int intInput = 0;
        
        boolean isValid = false;
        
        do {
            try {
                System.out.print(prompt);
                stringInput = userInput.nextLine();
                
                if(!stringInput.isEmpty()){
                    intInput = Integer.parseInt(stringInput);
                    isValid = true;
                }
            } catch(NumberFormatException ex) {
                System.out.println("Please enter a valid integer.");
            }
        } while(!isValid);
        
        return intInput;
    }
    
}
