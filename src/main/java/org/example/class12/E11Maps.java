package org.example.class12;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class E11Maps {
    public static void main(String[] args) {

        var items=new LinkedHashMap<>();
        items.put("Apples",10.5);
        items.put("Oranges",4.5);
        items.put("Kiwis",7.2);
        items.put("Bananas",6.5);
        items.put("Apples",10.5);
        System.out.println(items);



    }
}
