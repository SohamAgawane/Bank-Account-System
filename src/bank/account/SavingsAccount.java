package bank.account;

public class SavingsAccount extends BankAccount {

    private double interestRate;

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
}