/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.foundations.variables;

/**
 *
 * @author Nickee Coco
 */
public class InABucket {
    public static void main(String[] args) {
        
        // You can declare all KINDS of variables.
        String walrus;
        double piesEaten;
        float weightOfTeacupPig;
        int grainsOfSand;
        
        // But declaring them just sets up the space for data
        // to use the variable, you have to put data IN it first!
        walrus = "Sir Leroy Jenkins III";
        piesEaten = 42.1;
        weightOfTeacupPig = 22.4f;
        grainsOfSand = 254784125;
        
        System.out.println("Meet my pet walrus, " + walrus);
        System.out.print("He was a bit hungry today, and ate this many pies : ");
        System.out.println(piesEaten);
        System.out.print("Right now, the Teacup Pig contains ");
        System.out.print(grainsOfSand + " grains of sand and weighs ");
        System.out.println(weightOfTeacupPig + "lbs!");
    }
}
