/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.classes_objects.classmodeling;

/**
 *
 * @author Nickee Coco
 */
public class AirplaneFS {
    private String model;
    private double maxSpeed;
    
    private double currentHeight;
    private double currentSpeed;
    
    private double currentLattitude;
    private double currentLongitude;

    public AirplaneFS() {}

    public AirplaneFS(String model, double maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    public String getModel() {
        return model;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public double getCurrentHeight() {
        return currentHeight;
    }

    public double getCurrentSpeed() {
        return currentSpeed;
    }

    public double getCurrentLattitude() {
        return currentLattitude;
    }

    public double getCurrentLongitude() {
        return currentLongitude;
    }

    public void setCurrentHeight(double currentHeight) {
        this.currentHeight = currentHeight;
    }

    public void setCurrentSpeed(double currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public void setCurrentLattitude(double currentLattitude) {
        this.currentLattitude = currentLattitude;
    }

    public void setCurrentLongitude(double currentLongitude) {
        this.currentLongitude = currentLongitude;
    }
    
    public void liftOff() {}
    
    public void land() {}
    
    public void speedUp() {}
    
    public void slowDown() {}
}
