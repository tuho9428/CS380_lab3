package lab3;

import java.util.Date;

public class Transaction {
    private double amount;
    private Date timestamp;
    private String description;

    public Transaction(double amount, String description) {
        this.amount = amount;
        this.timestamp = new Date();
        this.description = description;
    }

    public double getAmount() {
        return this.amount;
    }

    public Date getTimestamp() {
        return this.timestamp;
    }

    public String getDescription() {
        return this.description;
    }
}

