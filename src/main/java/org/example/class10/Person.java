package org.example.class10;

import javax.swing.*;

public abstract class Person {

   abstract void sleep();
   abstract void eat();
   abstract void walk();
}

class Student extends Person{

    @Override
    void sleep() {
        System.out.println("Students only sleep few hours");
    }

    @Override
    void eat() {
        System.out.println("Most of the times they eat Fast food");
    }

    @Override
    void walk() {
        System.out.println("Students walking to universities");
    }
}

class Employee extends Person{
    @Override
    void sleep() {
        System.out.println("Employees sleep 8 hours:)");
    }
    void eat(){
        System.out.println("Most of the employees eat food made by their homeminsters");
    }
    void walk(){
        System.out.println("Employees walking to office");
    }
}
