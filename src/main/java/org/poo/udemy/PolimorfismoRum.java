package org.poo.udemy;

public class PolimorfismoRum {

    public static void main(String[] args) {

        Account account = new Account(1020, "Alex", 1000.0);
        Account savingsAccount = new SavingsAccount(1023, "Maria", 1000.0, 0.01);

        account.withdraw(50.0);
        savingsAccount.withdraw(50.0);

    }
}
