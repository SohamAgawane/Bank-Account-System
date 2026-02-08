package app;

import bank.account.Bank;
import bank.account.BankAccount;

public class Main {
    public static void main(String[] args) {
        Bank bank = Bank.getInstance();
        bank.printBankDetails();

        System.out.println("-------------------------------------");

        BankAccount user1 = new BankAccount(
                123456789,
                "Soham Agawane",
                10000.00
        );

        System.out.println(user1);
    }
}
