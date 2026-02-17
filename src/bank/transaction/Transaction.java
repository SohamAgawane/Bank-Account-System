package bank.transaction;

import bank.exception.InsufficientBalanceException;

public interface Transaction {

    void deposit(double amount);

    boolean withdraw(double amount)
            throws InsufficientBalanceException;

    void transfer(double amount, Transaction targetAccount)
            throws InsufficientBalanceException;
}