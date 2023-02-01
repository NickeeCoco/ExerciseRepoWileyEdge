/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.wiley_edge.windowmaster;

import java.util.Scanner;

/**
 *
 * @author Nickee Coco
 */
public class WindowMaster {

    public static void main(String[] args) {
        float height;
        float width;
        float glassCost;
        float trimCost;
        int nbWindows;
        
        String strHeight;
        String strWidth;
        String strGlass;
        String strTrim;
        String strNbWindows;
        
        float area;
        float perimeter;
        float totalCost;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Please enter the window's height:");
        strHeight = sc.nextLine();
        
        System.out.println("Please enter the window's width:");
        strWidth = sc.nextLine();
        
        System.out.println("Please enter the glass's cost:");
        strGlass = sc.nextLine();
        
        System.out.println("Please enter the trim's cost:");
        strTrim = sc.nextLine();
        
        System.out.println("Please enter the number of windows:");
        strNbWindows = sc.nextLine();
        
        height = Float.parseFloat(strHeight);
        width = Float.parseFloat(strWidth);
        glassCost = Float.parseFloat(strGlass);
        trimCost = Float.parseFloat(strTrim);
        nbWindows = Integer.parseInt(strNbWindows);
        
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
