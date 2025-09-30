package org.example.class9;

public class Furniture {
    String color="Blue";

    void m1(){
        System.out.println("M1 in the parent");
    }
}

class Chair extends Furniture{

    String color="Red";

    void m1(){
        System.out.println("M1 from child");
    }

    void printColor(){
       // System.out.println(color);
        System.out.println(super.color);
        super.m1();
    }
}

class ChairTester{
    public static void main(String[] args) {

        Chair c=new Chair();
        c.printColor();
    }
}
