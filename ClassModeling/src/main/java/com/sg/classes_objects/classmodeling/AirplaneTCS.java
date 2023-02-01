/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.classes_objects.classmodeling;

/**
 *
 * @author Nickee Coco
 */
public class AirplaneTCS {
    private String planeID;
    private String airline;
    
    private double currentHeight;
    private double currentSpeed;
    
    private double currentLattitude;
    private double currentLongitude;
    
    private String originAirportCode;
    private String destinationAirportCode;

    public AirplaneTCS() {}

    public AirplaneTCS(String planeID, String airline, String originAirportCode, String destinationAirportCode) {
        this.planeID = planeID;
        this.airline = airline;
        this.originAirportCode = originAirportCode;
        this.destinationAirportCode = destinationAirportCode;
    }

    public String getPlaneID() {
        return planeID;
    }

    public String getAirline() {
        return airline;
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

    public String getOriginAirportCode() {
        return originAirportCode;
    }

    public String getDestinationAirportCode() {
        return destinationAirportCode;
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
