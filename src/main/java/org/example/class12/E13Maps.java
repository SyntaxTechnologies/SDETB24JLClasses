package org.example.class12;

import java.util.Map;
import java.util.TreeMap;

public class E13Maps {
    public static void main(String[] args) {

        TreeMap<String,Double> items=new TreeMap<>();
        items.put("Apples",10.5);
        items.put("Oranges",4.5);
        items.put("Kiwis",7.2);
        items.put("Bananas",6.5);
        items.put("Apples",10.5);

//        for(var e:items.entrySet()){
//            System.out.println(e.getKey()+" "+e.getValue());
//        }

        items.forEach((k,v)-> System.out.println(k+" "+v));



    }
}
