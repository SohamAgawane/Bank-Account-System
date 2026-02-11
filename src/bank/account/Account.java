package bank.account;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Account {
    private int accountNumber;
    private String accountHolderName;
    private double balance;
    private long timestamp;

    public Account(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.timestamp = System.currentTimeMillis();
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    protected void deductAmount(double amount) {
        balance -= amount;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public double calculateInterest() {
        return 0;
    }

    @Override
    public String toString() {
        Date date = new Date(timestamp);
        SimpleDateFormat sdf =
                new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");

        return "Account Number: " + accountNumber +
                "\nAccount Holder Name: " + accountHolderName +
                "\nBalance: " + balance +
                "\nCreated At: " + sdf.format(date);
    }
}