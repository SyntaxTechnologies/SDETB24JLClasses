package org.example.class8;

public class Cat {
    String name;
    String color;
    int age;
    double weight;

    static boolean hasTail;
    Cat(String catName,String catColor,int catAge,double catWeight){
       name=catName;
       color=catColor;
       age=catAge;
       weight=catWeight;
    }

    Cat(String catName,String catColor,int catAge){
        name=catName;
        color=catColor;
        age=catAge;

    }


    void printName(){
        System.out.println(name);
    }
    void printInfo(){
        System.out.println(name);
        System.out.println(color);
        System.out.println(age);
        System.out.println(weight);
    }
    void printHasTail(){
        System.out.println(hasTail);
    }
}
