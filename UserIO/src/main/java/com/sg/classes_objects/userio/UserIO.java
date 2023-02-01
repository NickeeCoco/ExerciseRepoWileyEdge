/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.sg.classes_objects.userio;

/**
 *
 * @author Nickee Coco
 */
public interface UserIO {
    
    void print(String message);
    
    String readString(String prompt);
    
    int readInt(String prompt);
    
    int readInt(String prompt, int min, int max);
    
    double readDouble(String prompt);
    
    double readDouble(String prompt, double min, double max);
    
    float readFloat(String prompt);
    
    float readFloat(String prompt, double min, double max);
    
    long readLong(String prompt);
    
    long readLong(String prompt, long min, long max);
}
