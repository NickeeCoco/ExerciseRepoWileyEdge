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
public class GuessMe {
    public static void main(String[] args) {
        int answer = 5;
        int guess = 0;
        boolean isValid = false;
        
        Scanner userInput = new Scanner(System.in);
        
        do {
            try{
                System.out.println("I've chosen an number. Betcha can't guess it!");
                guess = Integer.parseInt(userInput.nextLine());
                isValid = true;
            }catch(NumberFormatException ex){
                System.out.println("Please input a valid number");
            }
        } while(!isValid);
        
        System.out.println("your guess: " + guess);
        System.out.println();
        
        if(guess == answer) {
            System.out.println("Nicely done! The answer was " + answer + " indeed!");
        } 
        
        if(guess > answer) {
            System.out.println(answer + "? Ha, nice try - too high! I chose " + answer + ".");
        } 
        
        if(guess < answer){
            System.out.println(answer + "? Ha, nice try - too low! I chose " + answer + ".");
        }
    }
}
