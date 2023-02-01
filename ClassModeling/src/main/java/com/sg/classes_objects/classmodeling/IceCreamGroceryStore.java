/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.classes_objects.classmodeling;

/**
 *
 * @author Nickee Coco
 */
public class IceCreamGroceryStore {
    private double price;
    private int numberInInventory;
    private int sku;

    public IceCreamGroceryStore(double price, int numberInInventory, int sku) {
        this.price = price;
        this.numberInInventory = numberInInventory;
        this.sku = sku;
    }

    public IceCreamGroceryStore() {
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNumberInInventory() {
        return numberInInventory;
    }

    public void setNumberInInventory(int numberInInventory) {
        this.numberInInventory = numberInInventory;
    }

    public int getSku() {
        return sku;
    }

    public void setSku(int sku) {
        this.sku = sku;
    }
    
    public void sellIceCream() {}
    
    public void restockIceCream() {};
}
