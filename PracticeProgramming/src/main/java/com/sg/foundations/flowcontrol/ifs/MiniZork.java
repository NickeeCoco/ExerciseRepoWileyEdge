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
public class MiniZork {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("You are standing in an open field west of a white house,");
        System.out.println("With a boarded front door.");
        System.out.println("There is a small mailbox here.");
        System.out.print("Go to the house, or open the mailbox? ");

        String action = userInput.nextLine();

        if (action.equals("open the mailbox")) {
            System.out.println("You open the mailbox.");
            System.out.println("It's really dark in there.");
            System.out.print("Look inside or stick your hand in? ");
            action = userInput.nextLine();

            if (action.equals("look inside")) {
                System.out.println("You peer inside the mailbox.");
                System.out.println("It's really very dark. So ... so very dark.");
                System.out.print("Run away or keep looking? ");
                action = userInput.nextLine();

                if (action.equals("keep looking")) {
                    System.out.println("Turns out, hanging out around dark places isn't a good idea.");
                    System.out.println("You've been eaten by a grue.");
                } else if (action.equals("run away")) {
                    System.out.println("You run away screaming across the fields - looking very foolish.");
                    System.out.println("But you alive. Possibly a wise choice.");
                }
            } else if (action.equals("stick your hand in")) { 
                System.out.println("You stick your hand in");
                System.out.println("There's something cold and wet in there...");
                System.out.println("Do you leave it here or take it out?");
                action = userInput.nextLine();
                
                if(action.equals("leave it here")) {
                    System.out.println("You leave it here.");
                    System.out.println("Well that was anticlamactic...");
                    System.out.println("Enjoy your life I guess.");
                } else {
                    System.out.println("You take the wet thing out of the mailbox.");
                    System.out.println("Turns out, it's just an old wet sweater.");
                    System.out.println("Discard it or invistigate further?");
                    action = userInput.nextLine();
                    
                    if(action.equals("discard it")) {
                        System.out.println("You discard it");
                        System.out.println("Well we're done here I guess...");
                        System.out.println("Bye!");
                    } else {
                        System.out.println("You invistigate further.");
                        System.out.println("Ugh! The sweater is full of blood!");
                        System.out.println("Do you run away or stay put?");
                        action = userInput.nextLine();
                        
                        if(action.equals("run away")) {
                            System.out.println("You drop the sweater and run away!");
                            System.out.println("Seems like a wise decision...");
                            System.out.println("But your fingerprints are all over this sweater now, you might be in trouble!!");
                        } else {
                            System.out.println("You stay put and decide to check the house for a phone.");
                            System.out.println("... to be continued");
                        }
                        
                    }
                }
            }
        } else if (action.equals("go to the house")) {
            System.out.println("You go to the house.");
            System.out.println("The door is locked... ");
            System.out.println("Walk around the house or check under the doormat?");
            action = userInput.nextLine();
            
            if(action.equals("walk around the house")) {
                System.out.println("You walk around the house");
                System.out.println("You find a backdoor that is ajar.");
                System.out.println("Get into the house or ask if someone's home?");
            } else {
                System.out.println("You check under the doormat.");
                System.out.println("There's a key there! You unlock the door.");
                System.out.println("... to be continued.");
            }
        }
    }
}
