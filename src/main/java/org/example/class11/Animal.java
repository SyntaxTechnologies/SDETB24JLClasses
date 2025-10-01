package org.example.class11;

public interface Animal {

    int AGE=12;

    void eat();

    void sleep();

    void speak();
}

class Dog implements Animal {

    public void eat() {

        System.out.println("Dogs like to east bones");
    }
    public void sleep(){
        System.out.println("ZZZzzzZZZZzzzzz.");
    }


    public void speak() {
        System.out.println("Wuff wuff");
    }
}
class Cat implements Animal{
    public void eat() {
        System.out.println("Cats like to eat Fish");
    }
    public void sleep(){
        System.out.println("ZZZzzzZZZZzzzzz.");
    }


    public void speak() {
        System.out.println("Meow Meow");
    }
}