/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.foundations.variables;

/**
 *
 * @author Nickee Coco
 */
public class TheOrderOfThings {
    public static void main(String[] args) {
        
        double number;
        String opinion, size, age, shape, color, origin, material, purpose;
        String noun;
        
        number = 5.0;
        opinion = "AWESOME";
        size = "teensy-weensy";
        age = "new";
        shape = "oblong";
        color = "yellow";
        origin = "Martian";
        material = "platinum";
        purpose = "good";
        
        noun = "dragons";
        
        // Using the + with string doesn't add -- it concatenates! (sticks them together)
        System.out.println(number + " " + opinion + " " + size + " " + age + " " + shape 
                + " " + color + " " + origin + " " + material + " " + purpose + " " + noun);
        
        System.out.println(number + " " + origin + " " + material + " " + age + " " + shape 
                + " " + color + " " + opinion + " " + size + " " + purpose + " " + noun); // sounds weird
    }
}
