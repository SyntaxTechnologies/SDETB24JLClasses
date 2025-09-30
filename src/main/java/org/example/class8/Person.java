package org.example.class8;

public class Person {

    String color="Blue";

    void printColor(){
        String color="Red";
        System.out.println(this.color);
    }

    public static void main(String[] args) {
        Person p=new Person();
        p.printColor();
    }
}
