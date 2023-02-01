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
public class BiggerBetterAdder {
    public static void main(String[] args) {
        int operand1 = 0;
        int operand2 = 0;
        int operand3 = 0;
        
        boolean isValid;
        
        Scanner userInput = new Scanner(System.in);
        
        do {
            isValid = false;
            try {
                System.out.println("Chose the first operand for our operation.");
                operand1 = Integer.parseInt(userInput.nextLine());
                isValid = true;
            } catch(NumberFormatException ex) {
                System.out.println("Please input a valid integer.");
            }
        } while(!isValid);
        
        do {
            isValid = false;
            try {
                System.out.println("Chose the second operand for our operation.");
                operand2 = Integer.parseInt(userInput.nextLine());
                isValid = true;
            } catch(NumberFormatException ex) {
                System.out.println("Please input a valid integer.");
            }
        } while(!isValid);
        
        do {
            isValid = false;
            try {
                System.out.println("Chose the third operand for our operation.");
                operand3 = Integer.parseInt(userInput.nextLine());
                isValid = true;
            } catch(NumberFormatException ex) {
                System.out.println("Please input a valid integer.");
            }
        } while(!isValid);
        
        System.out.print(operand1 + " + " + operand2 + " + " + operand3 + " = ");
        System.out.println(operand1 + operand2 + operand3);
    }
}
