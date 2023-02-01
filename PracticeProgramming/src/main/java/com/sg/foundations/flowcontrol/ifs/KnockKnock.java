/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.foundations.flowcontrol.ifs;

import java.util.Scanner;

/**
 *
 * @author Nickee Coco
 */
public class KnockKnock {
    public static void main(String[] args) {
        
        Scanner inputReader = new Scanner(System.in);
        
        System.out.print("Knock Knock! Guess who!! ");
        String nameGuess = inputReader.nextLine();
        
        // a string is not a primitive type, we must use the static method "equals" to compare the String's content
        /* The String is case sensitive, so capitalization is important. One way to go around that would be to "standardize" both use the .toLowerCase() function on the input 
            and compare it with a full lowercase string*/
        if(nameGuess.equals("Marty McFly")){
            System.out.println("Hey! That's right! I'm back!");
            System.out.println(".... from the Future."); // Sorry, had to!
        }else{
            System.out.println("Dude, do I -look- like " + nameGuess);
        }
    }
}
