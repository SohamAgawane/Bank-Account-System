package bank.account;

public class BankAccount extends Account {

    private double currentBalance;

    public BankAccount(int accountNumber, String accountHolderName, double currentBalance) {
        super(accountNumber, accountHolderName);
        this.currentBalance = currentBalance;
    }

    public double getCurrentBalance() {
        return currentBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            currentBalance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && currentBalance >= amount) {
            currentBalance -= amount;
        }
    }
}