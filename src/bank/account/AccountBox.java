package bank.account;

public class AccountBox<T> {

    private T account;

    public AccountBox(T account) {
        this.account = account;
    }

    public T getAccount() {
        return account;
    }

    public void setAccount(T account) {
        this.account = account;
    }

    @Override
    public String toString() {
        return "AccountBox{" +
                "account=" + account +
                '}';
    }
}