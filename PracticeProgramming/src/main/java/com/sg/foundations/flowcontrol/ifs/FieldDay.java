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
public class FieldDay {
    public static void main(String[] args) {
        String lastName;
            
        System.out.print("What is your last name? ");
        Scanner userInput = new Scanner(System.in);
        lastName = userInput.nextLine();
        
        if(lastName.compareTo("Baggins") < 0) {
            System.out.println("Aha! You're on the team \"Red Dragons\"!");
        } else if(lastName.compareTo("Dresden") < 0) {
            System.out.println("Aha! You're on the team \"Dark Wizards\"!");
        } else if(lastName.compareTo("Howl") < 0) {
            System.out.println("Aha! You're on the team \"Moving Castles\"!");
        } else if(lastName.compareTo("Potter") < 0) {
            System.out.println("Aha! You're on the team \"Night Guards\"!");
        } else if(lastName.compareTo("Vimes") < 0) {
            System.out.println("Aha! You're on the team \"Night Guards\"!");
        } else {
            System.out.println("Aha! You're on the team \"Black Holes\"!");
        }
        
        System.out.println("Good luck in the games!");
    }
}
