package com.sg.foundations.flowcontrol.whiles;

public class StayPositive {
    public static void main(String[] args) {
        int start = 10;

        System.out.println("Counting down...");
        System.out.println("");

        while(start >= 0) {
            System.out.println(start);
            start--;
        }

        System.out.println("");
        System.out.println("Blast off!");
    }
}
