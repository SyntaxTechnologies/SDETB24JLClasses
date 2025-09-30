package org.example.class8;

public class BankAccount {

     public static String userName = "User123";
    public static String password = "Pass456";
    public static double accountBalance = 10000;
    public static String AccountTitle = "James";
    public static String accountNumber = "12345678";

    public  static void printUserName() {
        System.out.println(userName);
    }


    public static void main(String[] args) {
        System.out.println(userName);
        printUserName();
    }

}
