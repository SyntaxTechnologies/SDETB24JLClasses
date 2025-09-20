package org.example.class8;

public class CatTester {
    public static void main(String[] args) {

        Cat c1=new Cat();
        c1.name="lucy";
        c1.age=5;
        c1.weight=2;
        c1.color="Black";
        c1.hasTail=false;

        Cat c2=new Cat();
        c2.name="Felix";
        c2.color="White";
        c2.age=7;
        c2.weight=3;
        c2.hasTail=true;

        c1.printHasTail();
    }
}
