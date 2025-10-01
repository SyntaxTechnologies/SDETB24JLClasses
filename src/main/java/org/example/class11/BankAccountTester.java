package org.example.class11;

import java.util.Scanner;

public class BankAccountTester {
    public static void main(String[] args) {

        BankAccount bankAccount=new BankAccount();
        bankAccount.setAccountBalance(20000);
        System.out.println(bankAccount.getAccountBalance("123"));



    }
}
