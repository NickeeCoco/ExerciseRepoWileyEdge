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
public class AllTheTrivia {
    public static void main(String[] args) {
        
        String answer1, answer2, answer3, answer4;
        
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("What unit is equivalent to 1,024 Gigabytes?");
        answer1 = userInput.nextLine();
        
        System.out.println("Which planet is the only one that rotates clockwise in our Solar System?");
        answer2 = userInput.nextLine();
        
        System.out.println("The largest volcano ever discovered in our Solar System is located on which planet?");
        answer3 = userInput.nextLine();
        
        System.out.println("What is the most abundant element in the earth's atmosphere?");
        answer4 = userInput.nextLine();
        
        System.out.println();
        
        System.out.println("Wow, 1,024 Gigabytes is a " + answer3 + "!");
        System.out.println("I didn't know that the largest ever volcano was discovered on " + answer1 + "!");
        System.out.println("That's amazing that " + answer2 + " is the most abundant element in the atmosphere...");
        System.out.println(answer4 + " is the only planet that rotates clockwise, neat!");
    }
}
