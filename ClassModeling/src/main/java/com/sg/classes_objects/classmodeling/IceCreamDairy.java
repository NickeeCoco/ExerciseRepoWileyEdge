/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.classes_objects.classmodeling;

/**
 *
 * @author Nickee Coco
 */
public class IceCreamDairy {
    private double sugarQuantity;
    private double milkQuantity;
    private String[] flavors;
    private String[] toppings;

    public IceCreamDairy() {}

    public IceCreamDairy(double sugarQuantity, double milkQuantity, String[] flavors, String[] toppings) {
        this.sugarQuantity = sugarQuantity;
        this.milkQuantity = milkQuantity;
        this.flavors = flavors;
        this.toppings = toppings;
    }

    public double getSugarQuantity() {
        return sugarQuantity;
    }

    public void setSugarQuantity(double sugarQuantity) {
        this.sugarQuantity = sugarQuantity;
    }

    public double getMilkQuantity() {
        return milkQuantity;
    }

    public void setMilkQuantity(double milkQuantity) {
        this.milkQuantity = milkQuantity;
    }

    public String[] getFlavors() {
        return flavors;
    }

    public void setFlavors(String[] flavors) {
        this.flavors = flavors;
    }

    public String[] getToppings() {
        return toppings;
    }

    public void setToppings(String[] toppings) {
        this.toppings = toppings;
    }
        
}
