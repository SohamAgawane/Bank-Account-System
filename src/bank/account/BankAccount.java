package bank.account;

import java.text.SimpleDateFormat;
import java.util.Date;

public class BankAccount {
    int account_number;
    String account_holder_name;
    double current_balance;
    long timestamp;

    public BankAccount(int account_number, String account_holder_name, double current_balance) {
        this.account_number = account_number;
        this.account_holder_name = account_holder_name;
        this.current_balance = current_balance;
        this.timestamp = System.currentTimeMillis();
    }

    @Override
    public String toString() {
        Date date = new Date(timestamp);
        SimpleDateFormat sdf =
                new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");

        return "Account Number: " + account_number +
                "\nAccount Holder Name: " + account_holder_name +
                "\nCurrent Balance: " + current_balance +
                "\nCreated At: " + sdf.format(date);
    }
}
