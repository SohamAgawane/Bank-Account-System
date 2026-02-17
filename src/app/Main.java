package app;

import bank.account.*;
import bank.exception.InsufficientBalanceException;
import core.Bank;

public class Main {

    public static void main(String[] args) {

        Bank bank = new Bank();

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

        // Add accounts
        bank.addAccount(savings);
        bank.addAccount(current);

        System.out.println("---- All Accounts ----");
        bank.displayAllAccounts();

        System.out.println("\n---- Withdraw Test ----");
        try {
            savings.withdraw(2000);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n---- Update Status ----");
        bank.updateStatus(102, AccountStatus.SUSPENDED);

        System.out.println("\n---- After Status Change ----");
        bank.displayAllAccounts();

        System.out.println("\n---- Remove Account 101 ----");
        bank.removeAccount(101);

        bank.displayAllAccounts();
    }
}