package org.example.class6;

public class E6String {
    public static void main(String[] args) {

        String userName="";
        String password="";
        System.out.println(password.isEmpty());

        if(userName.isEmpty()){
            System.out.println("UserName can not be empty");
        } else if (password.isEmpty()) {
            System.out.println("Password can not be empty");
        }


    }
}
