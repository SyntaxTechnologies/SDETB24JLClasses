package org.example.class12;

import java.util.ArrayList;

public class E4ArrayList {
    public static void main(String[] args) {
        // create an arraylist
        // store the names of 5 fruits in it
        // delete those fruits which have the letter e in their name
        // print the remaining fruits

        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Banana");
        fruits.add("Kiwi");
        fruits.add("Grapes");
        System.out.println(fruits);
        fruits.removeIf(x -> x.contains("e"));
        System.out.println(fruits);


    }
}
