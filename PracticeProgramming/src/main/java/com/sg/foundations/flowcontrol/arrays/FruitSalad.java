package com.sg.foundations.flowcontrol.arrays;

public class FruitSalad {
    public static void main(String[] args) {
        String[] fruit = {"Kiwi Fruit", "Gala Apple", "Granny Smith Apple", "Cherry Tomato", "Gooseberry", "Beefsteak Tomato", "Braeburn Apple", "Blueberry", "Strawberry", "Navel Orange", "Pink Pearl Apple", "Raspberry", "Blood Orange", "Sungold Tomato", "Fuji Apple", "Blackberry", "Banana", "Pineapple", "Florida Orange", "Kiku Apple", "Mango", "Satsuma Orange", "Watermelon", "Snozzberry"};

        String[] fruitSalad = new String[12];

        int fruitSaladIndex = 0;

        int typesOfApples = 0;
        int typesOfOranges = 0;
        int typesOfFruits = 0;

        for (int i = 0; i < fruit.length; i++) {
            String currentFruit = fruit[i];

            if(typesOfFruits == 12) {
                break;
            }

            if (currentFruit.contains("Apple") && typesOfApples < 3) {
                fruitSalad[fruitSaladIndex] = currentFruit;
                typesOfFruits++;
                typesOfApples++;
                fruitSaladIndex++;
            } else if (currentFruit.contains("Orange") && typesOfOranges < 2) {
                fruitSalad[fruitSaladIndex] = currentFruit;
                typesOfFruits++;
                typesOfOranges++;
                fruitSaladIndex++;
            } else if (!currentFruit.contains("Tomato") && !currentFruit.contains("Apple") && !currentFruit.contains("Orange")) {
                fruitSalad[fruitSaladIndex] = currentFruit;
                typesOfFruits++;
                fruitSaladIndex++;
            }
        }


        System.out.println("Here are all the fruits contained inside my delicious fruit salad: ");
        for (int i = 0; i < fruitSalad.length; i++) {
            System.out.print(fruitSalad[i] + " - ");
        }
    }
}
