/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.classes_objects.shapesandperimeters;

/**
 *
 * @author Nickee Coco
 */
public class Square extends Shape {
    private double sideLength;
    
    public Square(double length) {
        this.sideLength = length;
    }
    
    public Square(double length, String color) {
        this.sideLength = length;
        this.color = color;
    }
    
    @Override
    public double getArea() {
        return sideLength * sideLength;
    }

    @Override
    public double getPerimeter() {
       return sideLength * 4;
    }
    
}
