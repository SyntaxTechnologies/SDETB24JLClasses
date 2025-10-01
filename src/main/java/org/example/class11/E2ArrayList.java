package org.example.class11;

import java.util.ArrayList;

public class E2ArrayList {
    public static void main(String[] args) {

        ArrayList<String> productNames=new ArrayList<>();
        productNames.add("Dell XPS");
        productNames.add("Macbook M1");
        productNames.add("HP Dragfly");
        System.out.println(productNames.size());
        productNames.add("Dell3");
        System.out.println(productNames.size());
        System.out.println(productNames);
        System.out.println(productNames.get(0));


    }

}
