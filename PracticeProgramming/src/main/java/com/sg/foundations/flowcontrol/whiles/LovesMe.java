package com.sg.foundations.flowcontrol.whiles;

public class LovesMe {
    public static void main(String[] args) {
        System.out.println("Well here goes nothing...");
        int petals = 34;

        while(petals > 0) {
            if(petals % 2 ==0) {
                System.out.println("It loves me NOT!");
            } else {
                System.out.println("It LOVES me!");
            }
            petals--;
        }
            System.out.println("I knew it! It LOVES ME!");
    }
}
