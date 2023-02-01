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
public class BirthStones {
    public static void main(String[] args) {
        String month = null;
        String birthstone = null;
        
        Scanner userInput = new Scanner(System.in);
        
        try{
            int input;
            boolean isValid = false;
            
            do {
                System.out.print("What month's birthstone do you want to know ? ");
                input = Integer.parseInt(userInput.nextLine());
                
                switch(input) {
                    case 1:
                        month = "January";
                        birthstone = "Garnet";
                        isValid = true;
                        break;
                    case 2:
                        month = "February";
                        birthstone = "Amethyst";
                        isValid = true;
                        break;
                    case 3:
                        month = "March";
                        birthstone = "Aquamarine";
                        isValid = true;
                        break;
                    case 4:
                        month = "April";
                        birthstone = "Diamond";
                        isValid = true;
                        break;
                    case 5:
                        month = "May";
                        birthstone = "Emerald";
                        isValid = true;
                        break;
                    case 6:
                        month = "June";
                        birthstone = "Pearl";
                        isValid = true;
                        break;
                    case 7:
                        month = "July";
                        birthstone = "Ruby";
                        isValid = true;
                        break;
                    case 8:
                        month = "August";
                        birthstone = "Peridot";
                        isValid = true;
                        break;
                    case 9:
                        month = "September";
                        birthstone = "Sapphire";
                        isValid = true;
                        break;
                    case 10:
                        month = "October";
                        birthstone = "Opal";
                        isValid = true;
                        break;
                    case 11:
                        month = "November";
                        birthstone = "Topaz";
                        isValid = true;
                        break;
                    case 12:
                        month = "December";
                        birthstone = "Turquoise";
                        isValid = true;
                        break;
                    default:
                        System.out.println("Please enter a number between 1 and 12.");
                }
                
            } while(!isValid);
         
        }catch(NumberFormatException ex){
            System.out.println("Please enter a valid number");
        }
        
        System.out.println(month + "'s birthstone is " + birthstone + ".");
    }
}
