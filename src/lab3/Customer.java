package lab3;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Account> accounts;

    public Customer(String name) {
        this.name = name;
        this.accounts = new ArrayList<Account>();
    }

    public void addAccount(Account account) {
        this.accounts.add(account);
    }

    public String getName() {
        return this.name;
    }

    public ArrayList<Account> getAccounts() {
        return this.accounts;
    }
}

