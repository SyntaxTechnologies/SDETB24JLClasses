package org.example.class6;

public class E11String {
    public static void main(String[] args) {

        String userName="Trump";
        String password="asd";
        if(password.equals(userName)){
            System.out.println("Your Password can't be same as useranme");
        } else if (password.contains(userName)) {
            System.out.println("Your Password can't contain useranme");
        } else if (password.length()<8) {
            System.out.println("Password can't be less than 8 characters");
        }


    }
}
