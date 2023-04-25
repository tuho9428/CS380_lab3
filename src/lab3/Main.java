package lab3;

import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("My Bank");
        
        // Add some customers to the bank
        Customer alice = new Customer("Alice");
        Customer bob = new Customer("Bob");
        bank.addCustomer(alice);
        bank.addCustomer(bob);
        
        // Alice opens a checking account and a savings account
        CheckingAccount aliceChecking = new CheckingAccount("1111", alice);
        SavingsAccount aliceSavings = new SavingsAccount("2222", alice);
        alice.addAccount(aliceChecking);
        alice.addAccount(aliceSavings);
        
        // Bob opens a checking account and a savings account
        CheckingAccount bobChecking = new CheckingAccount("3333", bob);
        SavingsAccount bobSavings = new SavingsAccount("4444", bob);
        bob.addAccount(bobChecking);
        bob.addAccount(bobSavings);
        
        // Alice deposits $1000 into her checking account
        aliceChecking.deposit(1000.0);
        
        // Bob deposits $500 into his savings account
        bobSavings.deposit(500.0);
        
        // Alice transfers $500 from her checking account to Bob's checking account
        aliceChecking.withdraw(500.0);
        bobChecking.deposit(500.0);
        
        // Print out the account balances
        ArrayList<Customer> customers = bank.getCustomers();
        for (Customer customer : customers) {
            System.out.println(customer.getName() + "'s accounts:");
            ArrayList<Account> accounts = customer.getAccounts();
            for (Account account : accounts) {
                System.out.println("- " + account.getAccountNumber() + ": $" + account.getBalance());
            }
        }
        
        // Print out the transaction history for Alice's checking account
        System.out.println("Transaction history for Alice's checking account:");
        ArrayList<Transaction> transactions = aliceChecking.getTransactionHistory();
        for (Transaction transaction : transactions) {
            System.out.println("- " + transaction.getDescription() + ": $" + transaction.getAmount() + " on " + transaction.getTimestamp());
        }
    }
}

