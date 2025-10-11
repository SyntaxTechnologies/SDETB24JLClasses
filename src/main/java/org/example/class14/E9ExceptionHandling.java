package org.example.class14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class E9ExceptionHandling {
    public static void main(String[] args) throws FileNotFoundException {


        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        System.out.println("4");
        System.out.println("5");
        FileInputStream fileInputStream=new FileInputStream("Files/Employee");
        System.out.println("6");
        System.out.println("7");

    }
}
