package org.example.class7;

import org.example.class8.BankAccount;

public class BankAccountTester {
    public static void main(String[] args) {

        System.out.println(BankAccount.accountBalance);
        System.out.println(BankAccount.userName);
        System.out.println(BankAccount.password);
        System.out.println(BankAccount.AccountTitle);
        System.out.println(BankAccount.accountNumber);

        BankAccount.printUserName();

    }
}
