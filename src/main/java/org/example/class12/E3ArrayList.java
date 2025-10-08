package org.example.class12;

import java.util.ArrayList;

public class E3ArrayList {
    public static void main(String[] args) {

        ArrayList<String> names=new ArrayList<>();
        names.add("Adam");
        names.add("John");
        names.add("Yasir");
        names.add("Andrae");
        names.add("Aimal");
        System.out.println(names);
       // names.removeIf(name->name.contains("i"));
       // names.removeIf(x->x.length()>4);
        names.removeIf(x->x.startsWith("A"));
        System.out.println(names);



    }
}
