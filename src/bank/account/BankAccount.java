package bank.account;

import bank.exception.InsufficientBalanceException;

public class BankAccount extends Account
        implements Comparable<BankAccount> {

    private static final double DEFAULT_INTEREST_RATE = 2.0;

    public BankAccount(int accountNumber, String accountHolderName, double currentBalance) {
        super(accountNumber, accountHolderName, currentBalance);
    }

    @Override
    public boolean withdraw(double amount) throws InsufficientBalanceException {

        if (amount > 0 && getBalance() >= amount) {
            deductAmount(amount);
            return true;
        }

        throw new InsufficientBalanceException("Insufficient balance for withdrawal");
    }

    @Override
    public double calculateInterest() {
        return getBalance() * (DEFAULT_INTEREST_RATE / 100.0);
    }

    @Override
    public int compareTo(BankAccount other) {
        return Double.compare(this.getBalance(), other.getBalance());
    }
}