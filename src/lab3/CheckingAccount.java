package lab3;

public class CheckingAccount extends Account {
    private static final double OVERDRAFT_FEE = 35.0;
    private static final double OVERDRAFT_LIMIT = -500.0;

    public CheckingAccount(String accountNumber, Customer owner) {
        super(accountNumber, owner);
    }

    @Override
    public void withdraw(double amount) {
        double newBalance = getBalance() - amount;

        if (newBalance < OVERDRAFT_LIMIT) {
            System.out.println("Error: Insufficient funds");
        } else {
            deposit(-amount);

            if (newBalance < 0) {
                double overdraftFee = OVERDRAFT_FEE;
                System.out.println("Charged overdraft fee of " + overdraftFee);
                deposit(-overdraftFee);
            }
        }
    }
}

