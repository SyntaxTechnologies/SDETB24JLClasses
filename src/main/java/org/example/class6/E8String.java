package org.example.class6;

public class E8String {
    public static void main(String[] args) {

        String str="Java is easy JK...";
        System.out.println(str.startsWith("java"));
        System.out.println(str.startsWith("Python"));
        System.out.println(str.endsWith("."));
        System.out.println(str.endsWith("JK..."));
        String number="+1-54123-545415";
        if(number.startsWith("+1")){
            System.out.println("Someone is calling from USA");
        }

        String email="abs@gmail.com";
        if(email.endsWith("gmail.com")){
            System.out.println("The email is from google");
        }





    }
}
