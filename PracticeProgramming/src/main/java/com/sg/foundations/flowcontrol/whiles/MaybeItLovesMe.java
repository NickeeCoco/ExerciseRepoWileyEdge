package com.sg.foundations.flowcontrol.whiles;

import java.util.Random;

public class MaybeItLovesMe {
    public static void main(String[] args) {
        int petals = 0;
        boolean lovesMe = false;

        Random rd = new Random();
        petals = rd.nextInt(89 - 13) + 13;

        System.out.println("Well here goes nothing...");

        do{
            System.out.println("It loves me NOT!");
            lovesMe = false;

            if(petals >= 2) {
                System.out.println("It LOVES me!");
                lovesMe = true;
            }
            petals -= 2;
        } while(petals > 0);

        if(lovesMe) {
            System.out.println("Oh, wow! It really LOVES me!");
        } else {
            System.out.println("Awwww, bummer.");
        }
    }
}
