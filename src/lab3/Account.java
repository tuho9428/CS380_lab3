package lab3;

import java.util.ArrayList;

public abstract class Account {
    private double balance;
    private String accountNumber;
    private Customer owner;
    private ArrayList<Transaction> transactionHistory;

    public Account(String accountNumber, Customer owner) {
        this.balance = 0.0;
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.transactionHistory = new ArrayList<Transaction>();
    }

    public void deposit(double amount) {
        this.balance += amount;
        Transaction transaction = new Transaction(amount, "Deposit");
        this.transactionHistory.add(transaction);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            this.balance -= amount;
            Transaction transaction = new Transaction(amount, "Withdrawal");
            this.transactionHistory.add(transaction);
        } else {
            System.out.println("Insufficient funds");
        }
    }

    public double getBalance() {
        return this.balance;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public Customer getOwner() {
        return this.owner;
    }

    public ArrayList<Transaction> getTransactionHistory() {
        return this.transactionHistory;
    }
}



