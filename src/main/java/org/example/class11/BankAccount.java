package org.example.class11;

public class BankAccount {
    private String userName;
    private String password;
    private String accountTitle;
    private double accountBalance;
    private String accountNumber;

   public double getAccountBalance(String password){
       /* if(password.equals(this.password)){
            return accountBalance;
        }else {
            return 0;
        }*/

       return accountBalance;

    }

    public String getAccountNumber() {
        return accountNumber;
    }

    void setAccountBalance(double accountBalance){
       this.accountBalance=accountBalance;
    }

}
