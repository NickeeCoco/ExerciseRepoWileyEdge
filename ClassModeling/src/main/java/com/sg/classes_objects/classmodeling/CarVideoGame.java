/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.classes_objects.classmodeling;

/**
 *
 * @author Nickee Coco
 */
public class CarVideoGame {
    private String brand;
    private String model;
    private String color;
    private double price;
    
    private double currentSpeed;
    private double currentDamage;
    private double currentLattitude;
    private double currentLongitude;

    public CarVideoGame() {}

    public CarVideoGame(String brand, String model, String color, double price) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }

    public double getCurrentSpeed() {
        return currentSpeed;
    }

    public double getCurrentDamage() {
        return currentDamage;
    }

    public double getCurrentLattitude() {
        return currentLattitude;
    }

    public double getCurrentLongitude() {
        return currentLongitude;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setCurrentSpeed(double currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public void setCurrentDamage(double currentDamage) {
        this.currentDamage = currentDamage;
    }

    public void setCurrentLattitude(double currentLattitude) {
        this.currentLattitude = currentLattitude;
    }

    public void setCurrentLongitude(double currentLongitude) {
        this.currentLongitude = currentLongitude;
    }
    
    public void speedUp() {}
    
    public void slowDown() {}
    
    public void startEngine() {}
    
    public void stopEngine() {}
    
}