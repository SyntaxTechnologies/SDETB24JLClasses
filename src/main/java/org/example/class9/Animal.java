package org.example.class9;

public class Animal {
    String name;
    int age;
    double weight;
    String color;

    void sleep(){
        System.out.println("not sleeping");
    }

    public void eat(){
        System.out.println("Eating.....");
    }
}

class Dog extends Animal{


    void bark(){
        System.out.println("Wuff wuff....");
    }
}
class Cat extends Animal{

    void speak(){
        System.out.println("Meow Meow....");
    }
}