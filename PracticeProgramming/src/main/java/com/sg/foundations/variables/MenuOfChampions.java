/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.foundations.variables;

/**
 *
 * @author Nickee Coco
 */
public class MenuOfChampions {
    public static void main(String[] args) {
        
        String restaurantName, item1Name, item2Name, item3Name;
        double item1Price, item2Price, item3Price;
        
        restaurantName = "A LA BONNE FOURCHETTE";
        item1Name = "Soup";
        item1Price = 5.00;
        
        item2Name = "Pasta";
        item2Price = 8.50;
        
        item3Name = "Fish";
        item3Price = 12.25;
        
        System.out.println(".oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.");
        System.out.println("");
        System.out.println("WELCOME TO RESTAURANT " + restaurantName + "!");
        System.out.println("Today's Menu Is...");
        System.out.println("");
        System.out.println(".oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.");
        System.out.println("");
        System.out.println("$ " + item1Price + " " + item1Name);
        System.out.println("$ " + item2Price + " " + item2Name);
        System.out.println("$ " + item3Price + " " + item3Name);
    }
}
