package bank.account;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class Account {
    private final int accountNumber;
    private String accountHolderName;
    private double balance;
    private final long timestamp;

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

    public long getTimestamp() {
        return timestamp;
    }

    protected void deductAmount(double amount) {
        balance -= amount;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Invalid deposit amount");
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

        return "Account{" +
                "accountNumber=" + accountNumber +
                ", accountHolderName='" + accountHolderName + '\'' +
                ", balance=" + balance +
                ", createdAt=" + sdf.format(date) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(!(o instanceof Account)) return false;
        Account account = (Account) o;
        return accountNumber == account.accountNumber;

    }

    @Override
    public int hashCode() {
        return Objects.hash(accountNumber);
    }
}