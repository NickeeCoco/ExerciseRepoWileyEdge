/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.foundations.practice_exercises;

/**
 *
 * @author Nickee Coco
 */
public class SummativeSums {
    public static void main(String[] args) {
        int[] testArr1 = { 1, 90, -33, -55, 67, -16, 28, -55, 15 };
        int[] testArr2 = { 999, -60, -77, 14, 160, 301 };
        int[] testArr3 = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 140, 150, 160, 170, 180, 190, 200, -99 };
        
        System.out.println("#1 Array Sum: " + addArray(testArr1));
        System.out.println("#2 Array Sum: " + addArray(testArr2));
        System.out.println("#3 Array Sum: " + addArray(testArr3));
    }
    
    public static int addArray(int[] operands) {
        int total = 0;
        
        for(int operand : operands) {
            total += operand;
        }
        
        return total;
    }
}
