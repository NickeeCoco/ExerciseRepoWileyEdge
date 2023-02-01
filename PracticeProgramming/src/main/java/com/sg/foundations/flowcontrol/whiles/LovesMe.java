package com.sg.foundations.flowcontrol.whiles;

public class LovesMe {
    public static void main(String[] args) {
        System.out.println("Well here goes nothing...");
        int petals = 34;

        do{
            System.out.println("It loves me NOT!");
            if(petals >= 2) {
                System.out.println("It LOVES me!");
            }
            petals -= 2;
        } while(petals > 0);

        System.out.println("I knew it! It LOVES ME!");
    }
}
