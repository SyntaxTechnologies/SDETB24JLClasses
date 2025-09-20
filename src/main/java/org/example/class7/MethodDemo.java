package org.example.class7;

import org.example.class6.Cat;

public class MethodDemo {

    void printCatInfo(Cat cat){
        cat.speak();
    }

    void print(String [] names){
        for (String name: names){
            System.out.println(name);
        }
    }
}
