package org.example.class11;

import java.util.ArrayList;

public class E3ArrayList {
    public static void main(String[] args) {

        ArrayList<String> productNames = new ArrayList<>();
        productNames.add("Dell XPS");
        productNames.add("Macbook M1");
        productNames.add("HP Dragonfly");
        System.out.println(productNames.size());
        System.out.println(productNames);
       // productNames.remove(0);
        productNames.remove("Macbook M1");
        System.out.println(productNames);
        System.out.println(productNames.size());


    }

}
