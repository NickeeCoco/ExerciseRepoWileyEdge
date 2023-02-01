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
public class PassingTheTuringTest {
    public static void main(String[] args) {
               
        Scanner userInput = new Scanner(System.in);
        
        String name, color, food;
        int number = 0;
        int result;
        
        boolean isValidNumber = false;
        
        System.out.println("Hello there!");
        
        System.out.println("What's your name?");
        name = userInput.nextLine();
        
        System.out.println();
        
        System.out.println("Hi " + name + "! I'm Alice.");
        System.out.println("What's your favorite color? ");
        color = userInput.nextLine();
        
        System.out.println();
        
        System.out.println("Huh, " + color + "? Mine's Electric Lime.");
        
        System.out.println();
        
        System.out.println("I really like limes. They're my favorite fruit, too.");
        System.out.println("What's YOUR favorite fruit, " + name + "?");
        food = userInput.nextLine();
        
        System.out.println();
        
        System.out.println("Really? " + food + "? That's wild!");
        
        do {
            try {
               System.out.println("Speaking of favorites, what's your favorite number?");
                number = Integer.parseInt(userInput.nextLine());
                isValidNumber = true;
            } catch(NumberFormatException ex) {
                System.out.println("This is not a valid number");
            }
        } while(!isValidNumber);
        
        
        
        result = number * -7;
        
        System.out.println();
        
        System.out.println(number + " is a cool number? Mine's -7.");
        System.out.println("Did you know " + number + " * -7 is " + result + "? That's a cool number too!");
        
        System.out.println();
        
        System.out.println("Well, thanks for talking to me, " + name + "!");
    }
}
