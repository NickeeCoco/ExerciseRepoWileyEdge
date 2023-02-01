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
public class TriviaNight {
    public static void main(String[] args) {
        int finalScore = 0;
        String feedback;
              
        System.out.println("It's TRIVIA NIGHT! Are you ready?!");
        System.out.println();
        
        System.out.println("FIRST QUESTION!");
        if(
                askQuestion(
                        "What is the Lowest Level Programming Language?", 
                        "Source Code", 
                        "Assembly Language", 
                        "C#", 
                        "Machine Code", 
                        4
                )
            ) {
                finalScore++;
        }
        
        System.out.println("SECOND QUESTION!");
        if(
                askQuestion(
                        "Website Security CAPTCHA Forms Are Descended From the Work of?", 
                        "Grace Hopper", 
                        "Alan Turing", 
                        "Charles Babbage", 
                        "Larry Page", 
                        2
                )
            ) {
                finalScore++;
        }
        
        System.out.println("FINAL QUESTION!");
        if(
                askQuestion(
                        "Which of These Sci-Fi Ships Was Once Slated for a Full-Size Replica in Las Vegas?", 
                        "Serenity", 
                        "The Battlestar Galactica", 
                        "The USS Enterprise", 
                        "The Millennium Falcon", 
                        3
                )
            ) {
                finalScore++;
        }
        
        if(finalScore <= 1) {
            feedback = "You suck!";
        } else if(finalScore == 2){
            feedback = "Not too bad I guess...";
        } else {
            feedback = "Awesome!!!";
        }
        
        System.out.println(feedback + " - you got " + finalScore + " correct!");
    }
    
    public static boolean askQuestion(String question, String answer1, String answer2, String answer3, String answer4, int correctAnswer) {
        int answer = 0;
        boolean isValid = false;
        boolean isCorrectAnswer = false;
        
        Scanner userInput = new Scanner(System.in);
        
        System.out.println(question);
        System.out.println("1) " + answer1);
        System.out.println("2) " + answer2);
        System.out.println("3) " + answer3);
        System.out.println("4) " + answer4);
        
        while(!isValid) {
            try {
                answer = Integer.parseInt(userInput.nextLine());
                if(answer == correctAnswer){
                    isCorrectAnswer = true;
                }
                isValid = true;
            }catch(NumberFormatException ex){
                System.out.println("Enter a number between 1 and 4");
            }
        }
        
        System.out.println();
        System.out.println("YOUR ANSWER: " + answer);
        System.out.println();
        
        return isCorrectAnswer;
    }
}
