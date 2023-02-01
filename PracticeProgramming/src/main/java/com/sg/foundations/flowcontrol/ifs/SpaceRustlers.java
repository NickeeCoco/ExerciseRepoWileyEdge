/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.foundations.flowcontrol.ifs;

/**
 *
 * @author Nickee Coco
 */
public class SpaceRustlers {
    public static void main(String[] args) {
        int spaceships = 10;
        int aliens = 25;
        int cows = 100;
        
        // if checks for an intial condition and runs some code if the condition is met
        // else if checks for another condition if the initial if's condition was not met, and runs some code if its condition is met
        // if you remove the else from an else if, it will check the condition regardless of the previous if's result. It is not linked to it anymore.
        
        if(aliens > spaceships) {
            System.out.println("Vrroom, vroom! Let's get going!");
        } else {
            System.out.println("There aren't enough green guys to drive these ships!");
        }
        
        if(cows == spaceships){
            System.out.println("Wow, way to plan ahead! JUST enough room for all these walking hamburgers!");
        } else if(cows > spaceships){
            System.out.println("Dangit! I don't know how we're going to fit all these cows in here!");
        } else {
            System.out.println("Too many ships! Not enough cows.");
        }
        
        if(aliens > cows) {
            System.out.println("Hurrah, we've got the grub! Hamburger party on Alhpa Centauri!");
        } else {
            System.out.println("Oh no! The herds got restless and took over! Looks like we're hamburger now!!");
        }
    }
}
