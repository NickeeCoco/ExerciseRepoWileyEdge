/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.foundations.flowcontrol.ifs;

/**
 *
 * @author Nickee Coco
 */
public class test {
    public static void main(String[] args) {
        int i = 0, j = 5;
        for(; (i < 3) && (j++ < 10); i++) {
            System.out.print(" " + i + " " + j);
        }
        System.out.print(" " + i + " " + j);
    }
    
}
