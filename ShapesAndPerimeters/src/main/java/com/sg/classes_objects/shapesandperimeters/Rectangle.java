/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.classes_objects.shapesandperimeters;

/**
 *
 * @author Nickee Coco
 */
public class Rectangle extends Shape {
    private final double length;
    private final double width;
    
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
    public Rectangle(double length, double width, String color) {
        this.length = length;
        this.width = width;
        this.color = color;
    }
        
    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public double getPerimeter() {
       return 2 * (length + width);
    }
    
    
}
