package core;

import bank.account.Account;
import bank.account.AccountStatus;

import java.util.*;

public class Bank {

    private List<Account> accounts = new ArrayList<>();
    private Map<Integer, Account> accountMap = new HashMap<>();
    private Vector<Account> legacyAccounts = new Vector<>();

    // Add account
    public void addAccount(Account account) {
        accounts.add(account);
        accountMap.put(account.getAccountNumber(), account);
        legacyAccounts.add(account);
    }

    // Remove account
    public void removeAccount(int accountNumber) {
        Account acc = accountMap.remove(accountNumber);
        if (acc != null) {
            accounts.remove(acc);
            legacyAccounts.remove(acc);
        }
    }

    // Find account
    public Account findAccount(int accountNumber) {
        return accountMap.get(accountNumber);
    }

    // Update status
    public void updateStatus(int accountNumber, AccountStatus status) {
        Account acc = accountMap.get(accountNumber);
        if (acc != null) {
            acc.setStatus(status);
        }
    }

    // Display all accounts
    public void displayAllAccounts() {
        for (Account acc : accounts) {
            System.out.println(acc);
        }
    }
}