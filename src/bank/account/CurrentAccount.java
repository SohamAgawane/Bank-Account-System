package bank.account;

public class CurrentAccount extends BankAccount {

    private double overdraftLimit;

    public CurrentAccount(
            int accountNumber,
            String accountHolderName,
            double currentBalance,
            double overdraftLimit
    ) {
        super(accountNumber, accountHolderName, currentBalance);
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }
}