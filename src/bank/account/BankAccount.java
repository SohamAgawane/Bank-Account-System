package bank.account;

public class BankAccount extends Account {
    private static final double DEFAULT_INTEREST_RATE = 2.0;

    public BankAccount(int accountNumber, String accountHolderName, double currentBalance) {
        super(accountNumber, accountHolderName, currentBalance);
    }

    @Override
    public boolean withdraw(double amount) {
        if (amount > 0 && getBalance() >= amount) {
            deductAmount(amount);
            return true;
        }
        System.out.println("Insufficient balance");
        return false;
    }

    @Override
    public double calculateInterest() {
        return getBalance() * (DEFAULT_INTEREST_RATE / 100.0);
    }
}