/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.foundations.variables;

/**
 *
 * @author Nickee Coco
 */
public class MoreBucketsMoreFun {
    public static void main(String[] args) {
        
        // Declare ALL THE THINGS
        // (Usually it's a good idea to declare them at the beginning of the program)
        int butterflies, beetles, bugs;
        
        // Now give a couple of them some values
        butterflies = 5;
        beetles = 9;
        
        bugs = butterflies + beetles;
        System.out.println("There are only " + butterflies + " butterflies,");
        System.out.println("but there are " + bugs + " bugs in all.");
        
        System.out.println("Uh oh, my dog ate one.");
        butterflies--; // we use the decrement operator to show the dog ate a bug
        System.out.println("Now there are only " + butterflies + " butterflies left.");
        // the number of bugs does not change because we only change the value of butterflies
        // the bugs value does not change automatically when butterflies of beetles values change
        // we need to do the calculation again every time one of the values change if we want to keep the number of bugs up to date
        System.out.print("But there are still " + bugs + " bugs left, "); 
        System.out.println("wait a minute!");
        System.out.println("Maybe my computer can't do math, after all!");
    }
}
