package OOPS.Phase4_PracticeSet;

import java.util.Scanner;

public class ModifiedBankAccount {
    private final String owner;
    private double balance;

    //Constructor with both owner and initial balance
    public ModifiedBankAccount(String owner, double balance) {
        if (balance < 0) {
            System.out.println("Initial balance cannot be negative!");
            this.balance = 0;
        } else {
            this.balance = balance;
        }
        this.owner = owner;
    }
    //Deposit method
    public void deposit(double amount) {
        if (amount <= 0)  {
            System.out.println("Deposit amount must be positive!");
            return;
        }
        balance += amount;
        System.out.println("Deposited: " + amount + ", New Balance: " + balance);
    }
    // Withdraw method
    void withdraw(double amount) throws InsufficientFundsException {
        if (amount <= 0 || amount > balance) {
            throw new InsufficientFundsException("Insufficient funds!");
        }
        balance -= amount;
        System.out.println("Withdrew: " + amount + ", New Balance: " + balance);
    }
    // Getters
    public double getBalance() {
        return balance;
    }

    public String getOwner() {
        return owner;
    }

    static class InsufficientFundsException extends Exception {
        public InsufficientFundsException(String message) {
            super(message);
        }
    }

    // Main simulation
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // User Input owner name
        System.out.print("Bank owner's name: ");
        String owner = scanner.nextLine();
        // Iser inout Initial balance
        System.out.print("Enter the initial balance: ");
        double initialBalance = scanner.nextDouble();
        // Create object
        ModifiedBankAccount acc = new ModifiedBankAccount(owner, initialBalance);
        // Simulate deposits and withdraws
        acc.deposit(500);
        acc.deposit(0);
        // Custom Exceptions
        try {
            acc.withdraw(300);
            acc.withdraw(999999);
        } catch (InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.print("Final Balance for " + acc.getOwner() + ": " + acc.getBalance());

        scanner.close();
    }
}