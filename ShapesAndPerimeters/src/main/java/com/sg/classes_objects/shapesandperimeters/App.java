/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.sg.classes_objects.shapesandperimeters;

/**
 *
 * @author Nickee Coco
 */
public class App {

    public static void main(String[] args) {
        Shape square = new Square(2);
        System.out.println(square.getArea());
        System.out.println(square.getPerimeter());
        System.out.println(square.color);
        System.out.println();
        
        Shape rectangle = new Rectangle(5, 8, "green");
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());
        System.out.println(rectangle.color);
        rectangle.setColor("red");
        System.out.println(rectangle.color);
        System.out.println();
        
        Shape triangle = new Triangle(100, 75, 83);
        System.out.println(triangle.getArea());
        System.out.println(triangle.getPerimeter());
        System.out.println();
        
        Shape circle = new Circle(10, "pink");
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());
        System.out.println(circle.color);
    }
}
