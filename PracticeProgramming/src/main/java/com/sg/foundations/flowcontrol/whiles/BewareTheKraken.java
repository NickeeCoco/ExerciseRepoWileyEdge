package com.sg.foundations.flowcontrol.whiles;

import java.util.Random;
import java.util.Scanner;

public class BewareTheKraken {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        Random randomizer = new Random();

        String[] fishes = {"Bass", "Trout", "Tuna", "Salmon", "Pike"};

        String keepGoing = "y";

        System.out.println("Already, get those flippers and wetsuit on - we're going diving!");
        System.out.println("Here we goooOOooOooo.....! *SPLASH*");

        int depthDivedInFt = 0;

        // Turns out the ocean is only so deep, 36200 at the deepest survey,
        // so if we reach the bottom ... we should probably stop.
        while(depthDivedInFt < 36200) {
            System.out.println("So far, we've swum " + depthDivedInFt + " feet");

            if(depthDivedInFt >= 20000) {
                System.out.println("Uhhh, I think I see a Kraken, guys ....");
                System.out.println("TIME TO GO!");
                break;
            }

            System.out.println("Do you want to keep going? (y/n)");
            keepGoing = userInput.nextLine();

            if(!keepGoing.equals("y")) {
                break;
            }

            // I can swim, really fast! 500ft at a time!
            depthDivedInFt += 1000;

            System.out.println("Oh look! a " + fishes[randomizer.nextInt(fishes.length)]);
        }

        System.out.println("");
        System.out.println("We ended up swimming " + depthDivedInFt + " feet down.");
        System.out.println("I bet we can do better next time!");
    }
}
