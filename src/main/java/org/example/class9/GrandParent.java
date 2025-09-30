package org.example.class9;

public class GrandParent {
    void sleep(){
        System.out.println("I like to sleep for 8 hours");
    }
}

class Parent extends GrandParent{

    void eat(){
        System.out.println("I like to eat 3 times a day");
    }
}

class Child extends Parent{

}

class GrandChild extends Child{

}