/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.classes_objects.refactor_into_objects;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Nickee Coco
 */
public class RockPaperScissors {

    private int numberOfRounds = 0;

    private int computerWins = 0;
    private int playerWins = 0;
    private int ties = 0;

    private int computerMoveInt;
    private int playerMoveInt = 0;

    private String computerMove;
    private String playerMove = null;

    private boolean isValid = false;
    private boolean isPlaying = false;

    Scanner userInput = new Scanner(System.in);
    Random rdm = new Random();

    public void playGame() {

        System.out.println("Hello there! Let's play Rock, Paper, Scissors!");
        System.out.println();

        do {
            // if there is no current game
            if (numberOfRounds == 0) {
                // prompt for number of rounds
                do {
                    System.out.print("How many rounds would you like to play? (between 1 and 10) ");

                    try {
                        numberOfRounds = Integer.parseInt(userInput.nextLine());
                        if (numberOfRounds > 0 && numberOfRounds < 11) {
                            isValid = true;
                            isPlaying = true;
                        } else {
                            System.out.println();
                            System.out.println("That's not an acceptable answer, I don't want to play anymore è_é");
                            return;
                        }
                    } catch (NumberFormatException ex) {
                        System.out.println("Please enter a valid integer.");
                    }
                } while (!isValid);
            }

            // while there are still rounds to play
            while (numberOfRounds > 0) {

                // get player's move
                do {
                    isValid = false;
                    System.out.println();
                    System.out.print("Choose your move : 1=Rock, 2=Paper, 3=Scissors: ");
                    try {
                        playerMoveInt = Integer.parseInt(userInput.nextLine());
                        if (playerMoveInt > 0 && playerMoveInt < 4) {

                            // map int to string
                            playerMove = mapIntegerToMove(playerMoveInt);
                            isValid = true;
                        } else {
                            System.out.println("You can only choose from three options: type 1 for Rock, 2 for Paper, 3 for Scissors.");
                        }
                    } catch (NumberFormatException ex) {
                        System.out.println("You can only choose from three options: type 1 for Rock, 2 for Paper, 3 for Scissors.");
                    }
                } while (!isValid);

                // generate computer move
                computerMoveInt = rdm.nextInt(3) + 1;

                // map int to string
                computerMove = mapIntegerToMove(computerMoveInt);

                System.out.println("You chose " + playerMove + " and I chose " + computerMove + ".");

                // get score for this round
                // 1=Rock - 2=Paper - 3=Scissors
                if (computerMoveInt == playerMoveInt) {
                    ties++;
                    System.out.println("It's a tie!");
                } else if (computerMoveInt == 1 && playerMoveInt == 2
                        || computerMoveInt == 2 && playerMoveInt == 3
                        || computerMoveInt == 3 && playerMoveInt == 1) { // all cases where the player wins
                    System.out.println("Wow, you win! I'll get my revenge next time!");
                    playerWins++;
                } else {
                    System.out.println("HAHA I WIN! You suck!!!");
                    computerWins++;
                }

                System.out.println();

                numberOfRounds--;
            }

            // display final results
            System.out.println("You won " + playerWins + " rounds and I won " + computerWins + " rounds.");

            // display the final winner
            if (computerWins == playerWins) {
                System.out.println("It's a tie!");
            } else if (computerWins < playerWins) {
                System.out.println("NOOOOO you can't have won! YOU CHEATED!");
            } else {
                System.out.println("I WIN I WIN I WIN I WIN I WIN I WIN!!!!!!");
            }

            // ask if the player wants to continue playing
            do {
                isValid = false;
                System.out.println();
                System.out.print("Do you want to keep playing? Y=Yes, N=No: ");
                String isContinue = userInput.nextLine();

                if (isContinue.equals("Y") || isContinue.equals("y")) {
                    isValid = true;

                    // reset score
                    ties = 0;
                    computerWins = 0;
                    playerWins = 0;
                    System.out.println();
                }

                if (isContinue.equals("N") || isContinue.equals("n")) {
                    isValid = true;
                    System.out.println("Thanks for playing!");
                    isPlaying = false;
                }

            } while (!isValid);
        } while (isPlaying);

    }

    public static String mapIntegerToMove(int input) {
        if (input == 1) {
            return "Rock";
        }

        if (input == 2) {
            return "Paper";
        }

        return "Scissors";
    }
}
