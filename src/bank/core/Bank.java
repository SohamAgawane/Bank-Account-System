package bank.core;

public class Bank {
    public static final String BANK_NAME = "Standard Chartered";
    public static final String IFSC_CODE = "SCBL0001234";

    private static Bank bankInstance;
    private Bank() {}

    public static Bank getInstance() {
        if(bankInstance == null) {
            bankInstance = new Bank();
        }
        return bankInstance;
    }

    public void printBankDetails() {
        System.out.println("Bank Name: " + BANK_NAME);
        System.out.println("IFSC Code: " + IFSC_CODE);
    }
}
