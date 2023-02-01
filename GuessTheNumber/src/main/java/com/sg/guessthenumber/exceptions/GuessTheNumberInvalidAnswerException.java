/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.guessthenumber.exceptions;

/**
 *
 * @author Nickee Coco
 */
public class GuessTheNumberInvalidAnswerException extends Exception  {
    
    public GuessTheNumberInvalidAnswerException(String message) { super(message); }
    public GuessTheNumberInvalidAnswerException(String message, Throwable cause) { super(message, cause); }
    
}
