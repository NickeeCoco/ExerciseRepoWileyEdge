package com.sg.foundations.flowcontrol.whiles;

import java.util.Random;

public class LazyTeenager {
    public static void main(String[] args) {
        Random randomizer = new Random();

        int probability = 0;
        boolean isRoomClean = false;
        int timesAsked = 1;

        do{
            System.out.println("Clean your room!! (x" + timesAsked + ")");

            if(timesAsked == 7) {
                System.out.println("Clean your room!! That's IT, I'm doing it!!! YOU'RE GROUNDED AND I'M TAKING YOUR XBOX!");
                break;
            }

            probability = randomizer.nextInt(11);
            System.out.println("probability: " + probability);

            if(probability < timesAsked) {
                System.out.println("FINE I'LL CLEAN MY ROOM BUT I REFUSE TO EAT MY PEAS.");
                isRoomClean = true;
            }

            timesAsked++;
        } while(!isRoomClean);
    }
}
