package org.example.class12;

import java.util.ArrayList;
import java.util.HashSet;

public class E6Sets {
    public static void main(String[] args) {

        HashSet<String> fruits=new HashSet<>();
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Banana");
        fruits.add("Banana");
        fruits.add("Kiwi");
        fruits.add("Kiwi");
        fruits.add("Grapes");
        fruits.add("Grapes");
        fruits.add("Grapes");
        fruits.add("Grapes");
        fruits.add("Grapes");
        System.out.println(fruits);
        fruits.removeIf(x->x.contains("i"));
        for(String f:fruits){
            System.out.println(f);
        }
    }
}
