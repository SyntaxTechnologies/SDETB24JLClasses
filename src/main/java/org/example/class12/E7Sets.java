package org.example.class12;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class E7Sets {
    public static void main(String[] args) {

        LinkedHashSet<String> fruits=new LinkedHashSet<>();
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
