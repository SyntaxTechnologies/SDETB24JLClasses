package org.example.project1;

/*
Write a program to swap 2 numbers without a temporary variable.
 */


public class Q5 {
    public static void main(String[] args) {



        int a=10;
        int b=20;
        a=a+b; //10+20=>30 a:30
        b=a-b; //a:30 b:20 a-b 30-20=>10
        a=a-b;
        System.out.println("a: "+a);
        System.out.println("b: "+b);
    }
}
