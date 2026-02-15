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

    @Override
    public boolean withdraw(double amount) {
        if(amount > 0 && (getBalance() - amount) >= -overdraftLimit) {
            deductAmount(amount);
            return true;
        } else {
            System.out.println("Overdraft limit exceeded");
            return false;
        }
    }

    @Override
    public double calculateInterest() {
        return 0;
    }
}