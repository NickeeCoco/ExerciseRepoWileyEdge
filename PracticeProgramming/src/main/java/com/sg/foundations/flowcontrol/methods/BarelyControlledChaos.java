package com.sg.foundations.flowcontrol.methods;

import java.util.Random;

public class BarelyControlledChaos {
    public static void main(String[] args) {
        String color = randomColor();
        String animal = randomAnimal();
        String colorAgain = randomColor();
        int weight = randomInteger(5, 200);
        int distance = randomInteger(10, 20);
        int number = randomInteger(10000, 20000);
        int time = randomInteger(2, 6);

        System.out.println("Once, when I was very small...");

        System.out.println("I was chased by a " + color + ", "
                + weight + "lb " + " miniature " + animal
                + " for over " + distance + " miles!!");

        System.out.println("I had to hide in a field of over "
                + number + " " + colorAgain + " poppies for nearly "
                + time + " hours until it left me alone!");

        System.out.println("\nIt was QUITE the experience, "
                + "let me tell you!");
    }

    static String randomColor() {
        Random rd = new Random();
        String[] colors = {"blue", "orange", "purple", "yellow", "red", "green", "black"};

        return colors[rd.nextInt(colors.length)];
    }

    static String randomAnimal() {
        Random rd = new Random();
        String[] animals = {"llama", "cow", "owl", "horse", "cat", "parrot", "snake"};
        
        return animals[rd.nextInt(animals.length)];
    }

    static int randomInteger(int min, int max) {
        Random rd = new Random();
        return rd.nextInt(max - min) + min;
    }
}
