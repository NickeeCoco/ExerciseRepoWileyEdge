package com.sg.foundations.flowcontrol.random;

import java.util.Random;

public class CoinFlipper {
    public static void main(String[] args) {
        Random coinToss = new Random();

        String coinValue = coinToss.nextBoolean() ? "HEADS" : "TAILS";

        System.out.println("Ready, Set, Flip.....!!");
        System.out.println("You got " + coinValue + "!");
    }
}
