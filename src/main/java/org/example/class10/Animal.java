package org.example.class10;

public class Animal {
    void eat(){
        System.out.println("Animal Eating");
    }

    void sleep(){
        System.out.println("Animal Sleeping");
    }
}

class Dog extends Animal{
    void eat(){
        System.out.println("Eating Bones");
    }

}

class Cat extends Animal{
    void eat(){
        System.out.println("Eating fish");
    }
    void sleep(){
        System.out.println("Sleeping for 18 hours");
    }
}