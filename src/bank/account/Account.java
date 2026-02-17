package bank.account;

import bank.transaction.Transaction;
import bank.exception.InsufficientBalanceException;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public abstract class Account implements Transaction {

    private final int accountNumber;
    private String accountHolderName;
    private double balance;
    private final long timestamp;
    private AccountStatus status;

    public Account(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.timestamp = System.currentTimeMillis();
        this.status = AccountStatus.ACTIVE;
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

    public AccountStatus getStatus() {
        return status;
    }

    public void setStatus(AccountStatus status) {
        this.status = status;
    }

    protected void deductAmount(double amount) {
        balance -= amount;
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0 && status == AccountStatus.ACTIVE) {
            balance += amount;
        } else {
            System.out.println("Deposit failed");
        }
    }

    @Override
    public void transfer(double amount, Transaction targetAccount)
            throws InsufficientBalanceException {

        if (status != AccountStatus.ACTIVE) {
            throw new InsufficientBalanceException("Account is not active");
        }

        if (amount > 0 && balance >= amount) {
            this.withdraw(amount);
            targetAccount.deposit(amount);
        } else {
            throw new InsufficientBalanceException("Transfer failed");
        }
    }

    @Override
    public abstract boolean withdraw(double amount)
            throws InsufficientBalanceException;

    public abstract double calculateInterest();

    @Override
    public String toString() {
        Date date = new Date(timestamp);
        SimpleDateFormat sdf =
                new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");

        return "Account{" +
                "accountNumber=" + accountNumber +
                ", holder='" + accountHolderName + '\'' +
                ", balance=" + balance +
                ", status=" + status +
                ", createdAt=" + sdf.format(date) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Account)) return false;
        Account account = (Account) o;
        return accountNumber == account.accountNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountNumber);
    }
}