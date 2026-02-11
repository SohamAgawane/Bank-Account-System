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
    public void withdraw(double amount) {
        if(amount > 0 && getBalance() + getOverdraftLimit() >= amount) {
            deductAmount(amount);
            System.out.println("Withdrawal successful (Overdraft allowed)");
        } else {
            System.out.println("Overdraft limit exceeded");
        }
    }

    @Override
    public double calculateInterest() {
        return super.calculateInterest();
    }
}