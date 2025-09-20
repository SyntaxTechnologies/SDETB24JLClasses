package org.example.class6;

public class E1String {
    public static void main(String[] args) {
        /*
        new keyword in java creates the object of a class
        whatever name we specify after the new
        keyword computer will create the object of that class.
         */
        // below line will create the object of String class, and it
        // will store it inside the s variable.
        String s=new String("asdjkfbhjksbfhjenskgbnskjgbsfjkgbjfgbjdfgbjdhbghjdfbgdhjgsdbf");
        System.out.println(s.length());
        int len=s.length();

        if(s.length()<8){
            System.out.println("Your password should be at least 8 characters");
        }

    }
}
