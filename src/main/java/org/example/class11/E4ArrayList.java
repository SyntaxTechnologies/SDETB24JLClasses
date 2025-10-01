package org.example.class11;

import java.util.ArrayList;

public class E4ArrayList {
    public static void main(String[] args) {

        ArrayList<String> productNames = new ArrayList<>();
        productNames.add("Dell XPS");
        productNames.add("Macbook M1");
        productNames.add("HP Dragonfly");
        System.out.println(productNames.isEmpty());
        System.out.println(productNames.contains("Lenovo"));
        System.out.println(productNames.indexOf("HP Dragonfly"));


    }

}
