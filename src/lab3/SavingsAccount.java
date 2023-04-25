package lab3;

public class SavingsAccount extends Account {
    private static final double INTEREST_RATE = 0.05;

    public SavingsAccount(String accountNumber, Customer owner) {
        super(accountNumber, owner);
    }

    public void addInterest() {
        double interest = getBalance() * INTEREST_RATE;
        deposit(interest);
    }

    @Override
    public void withdraw(double amount) {
        if (amount > getBalance()) {
            System.out.println("Error: Insufficient funds");
        } else {
            deposit(-amount);
        }
    }
}

