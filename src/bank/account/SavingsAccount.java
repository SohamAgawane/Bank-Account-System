package bank.account;

public class SavingsAccount extends BankAccount {

    private double interestRate;
    private static final double MIN_BALANCE = 1000;

    public SavingsAccount(
            int accountNumber,
            String accountHolderName,
            double currentBalance,
            double interestRate
    ) {
        super(accountNumber, accountHolderName, currentBalance);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    @Override
    public boolean withdraw(double amount) {
        if (amount > 0 && (getBalance() - amount) >= MIN_BALANCE) {
            deductAmount(amount);
            return true;
        }
        System.out.println("Minimum balance requirement violated");
        return false;
    }

    @Override
    public double calculateInterest() {
        return getBalance() * (interestRate / 100.0);
    }
}