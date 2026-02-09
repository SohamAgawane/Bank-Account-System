package bank.account;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Account {
    private int accountNumber;
    private String accountHolderName;
    private long timestamp;

    public Account(int accountNumber, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.timestamp = System.currentTimeMillis();
    }

    public int getaccountNumber() {
        return accountNumber;
    }

    public String getaccountHolderName() {
        return accountHolderName;
    }

    public long getTimestamp() {
        return timestamp;
    }

    @Override
    public String toString() {
        Date date = new Date(timestamp);
        SimpleDateFormat sdf =
                new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");

        return "Account Number: " + accountNumber +
                "\nAccount Holder Name: " + accountHolderName +
                "\nCreated At: " + sdf.format(date);
    }
}