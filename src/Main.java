public class Main {
    public static void main(String[] args) {
        BankAccount user1 = new BankAccount(
                123456789,
                "Soham Agawane",
                10000.00
        );

        user1.printAccountDetails();
    }
}

class BankAccount {
    int account_number;
    String account_holder_name;
    double current_balance;

    BankAccount(int account_number, String account_holder_name, double current_balance) {
        this.account_number = account_number;
        this.account_holder_name = account_holder_name;
        this.current_balance = current_balance;
    }

    void printAccountDetails() {
        System.out.println("Account Number: " + account_number);
        System.out.println("Account Holder Name: " + account_holder_name);
        System.out.println("Current Balance: " + current_balance);
    }
}