package org.example.class3;

public class E1IfElseStatements {
    public static void main(String[] args) {

        // CTRL+ALT+L for windows
        // Rich CMD+Opts+L
        // zoom in CTRL+   Zoom out CTRL-
        int age = 18;
        boolean isRegistered = true;

        if (age >= 18) {
            if (isRegistered) {
                System.out.println("You can go and vote Trump");
            } else {
                System.out.println("You need to register");
            }

        } else {
            System.out.println("You are not eligible to vote");
        }


    }
}
