/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.classes_objects.shapesandperimeters;

/**
 *
 * @author Nickee Coco
 */
abstract class Shape {
    protected String color = "blue";
    
    public String getColor() {
        return this.color;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    public abstract double getArea();
    
    public abstract double getPerimeter();
}
