package bank.transaction;

public interface Transaction {

    void deposit(double amount);

    boolean withdraw(double amount);

    void transfer(double amount, Transaction targetAccount);
}