package org.example.class12;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class E8Sets {
    public static void main(String[] args) {

        TreeSet<String> fruits=new TreeSet<>();
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
