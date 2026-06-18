package OOPS.Phase1_PracticeSet;

import java.util.Scanner;

public class BankAccount {
    private String owner;
    private double balance;

    //Constructor with both owner and initial balance
    public BankAccount(String owner, double balance) {
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
    public void withdraw(double amount) {
        if (amount <= 0 || amount > balance) {
            System.out.println("Insufficient funds!");
            return;
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
        BankAccount acc = new BankAccount(owner, initialBalance);
        //Simulate deposits and withdraws
        acc.deposit(500);
        acc.withdraw(300);
        acc.deposit(0);
        acc.withdraw(100000);
        System.out.print("Final Balance for " + acc.getOwner() + ": " + acc.getBalance());
        scanner.close();
    }
}