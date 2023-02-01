/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.wiley_edge.windowmaster;

import java.util.Scanner;

/**
 * @author Nickee Coco
 */
public class WindowMaster {

    public static void main(String[] args) {
        float height = 0;
        float width = 0;
        float glassCost = 0;
        float trimCost = 0;
        int nbWindows = 0;

        String strHeight;
        String strWidth;
        String strGlassCost;
        String strTrimCost;
        String strNbWindows;

        float area;
        float perimeter;
        float totalCost;

        Scanner sc = new Scanner(System.in);

        boolean isValid;

        do {
            isValid = false;
            try {
                System.out.println("Please enter the window's height:");
                strHeight = sc.nextLine();
                height = Float.parseFloat(strHeight);
                isValid = true;
            } catch (NumberFormatException ex) {
                System.out.println("Input could not be parsed into a float");
            }
        } while (!isValid);

        do {
            isValid = false;
            try {
                System.out.println("Please enter the window's width:");
                strWidth = sc.nextLine();
                width = Float.parseFloat(strWidth);
                isValid = true;
            } catch (NumberFormatException ex) {
                System.out.println("Input could not be parsed into a float");
            }
        } while (!isValid);

        do {
            isValid = false;
            try {
                System.out.println("Please enter the glass's cost:");
                strGlassCost = sc.nextLine();
                glassCost = Float.parseFloat(strGlassCost);
                isValid = true;
            } catch (NumberFormatException ex) {
                System.out.println("Input could not be parsed into a float");
            }
        } while (!isValid);

        do {
            isValid = false;
            try {
                System.out.println("Please enter the trim's cost:");
                strTrimCost = sc.nextLine();
                trimCost = Float.parseFloat(strTrimCost);
                isValid = true;
            } catch (NumberFormatException ex) {
                System.out.println("Input could not be parsed into a float");

            }
        } while (!isValid);

        do {
            isValid = false;
            try {
                System.out.println("Please enter the number of windows:");
                strNbWindows = sc.nextLine();
                nbWindows = Integer.parseInt(strNbWindows);
                isValid = true;
            } catch (NumberFormatException ex) {
                System.out.println("Input could not be parsed into an integer");

            }
        } while (!isValid);

        area = height * width;
        perimeter = 2 * (height + width);

        totalCost = nbWindows * ((glassCost * area) + (trimCost * perimeter));

        System.out.println("Window's height: " + height);
        System.out.println("Window's width: " + width);
        System.out.println("Window's area: " + area);
        System.out.println("Window's perimeter: " + perimeter);
        System.out.println("Number of windows: " + nbWindows);
        System.out.println("Cost: " + totalCost);
    }
}
