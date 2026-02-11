package app;

import bank.account.Account;
import bank.account.CurrentAccount;
import bank.account.SavingsAccount;
import bank.core.Bank;
import bank.account.BankAccount;

public class Main {
    public static void main(String[] args) {
        Account savings = new SavingsAccount(
                101,
                "Soham",
                10000,
                5
        );

        Account current = new CurrentAccount(
                102,
                "Rahul",
                5000,
                2000
        );

        System.out.println("---- Withdraw Tests ----");

        savings.withdraw(2000);   // Normal withdraw
        current.withdraw(6000);   // Uses overdraft

        System.out.println("\n---- Interest ----");

        System.out.println("Savings Interest: " + savings.calculateInterest());
        System.out.println("Current Interest: " + current.calculateInterest());

        System.out.println("\n---- Final State ----");
        System.out.println(savings);
        System.out.println(current);
    }
}
