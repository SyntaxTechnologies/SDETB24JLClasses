package org.example.class12;

import java.util.LinkedList;

public class E5LinkedList {
    public static void main(String[] args) {

        LinkedList<String> fruits=new LinkedList<>();

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
