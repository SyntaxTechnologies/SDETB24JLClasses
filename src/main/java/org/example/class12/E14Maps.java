package org.example.class12;

import java.util.LinkedHashMap;

public class E14Maps {
    public static void main(String[] args) {

        var items=new LinkedHashMap<>();
        items.put("Apples",10.5);
        items.put("Oranges",4.5);
        items.put("Kiwis",7.2);
        items.put("Bananas",6.5);
        items.put("Apples",10.5);

        System.out.println(items.size());
        System.out.println(items.containsKey("Oranges"));
        System.out.println(items.containsKey("Grapes"));
        System.out.println(items.containsValue(7.2));



    }
}
