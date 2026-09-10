package OOPS.Phase1_PracticeSet;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class BankAccount_Updated {
    private String owner;
    private double balance;
    private List<String[]> transactions; //history log

    //Constructor with both owner and initial balance
    public BankAccount_Updated(String owner, double balance) {
        if (balance < 0) {
            throw new IllegalArgumentException("Initial balance cannot be negative!");
        } else {
            this.balance = balance;

        }
        this.owner = owner;
        this.transactions = new ArrayList<>();
        addTransaction("Account Created", balance);
    }

    //Helper method to add timestamp
    private String timestamp() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return now.format(formatter);
    }

    //Helper; add transaction row
    private void addTransaction(String action, double amount) {
        transactions.add(new String[]{timestamp(), action, String.valueOf(amount), String.valueOf(balance)});
    }

    //Deposit method
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit amount must be positive!");
            addTransaction("Failed Deposit", amount);
            return;
        }
        balance += amount;
        System.out.println("Deposited: " + amount + ", New Balance: " + balance);
        addTransaction("Deposit", amount);
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount <= 0 || amount > balance) {
            System.out.println("Invalid withdrawal!");
            addTransaction("Failed withdrawal", amount);
            return;
        }
        balance -= amount;
        System.out.println("Withdrew: " + amount + ", New Balance: " + balance);
        addTransaction("Withdrawal", amount);
    }

    // Getters
    public double getBalance() {
        return balance;
    }

    public String getOwner() {
        return owner;
    }

    // Print transaction history
    public void printTransactions() {
        System.out.println("\n---- Transaction History ----");
        System.out.printf("%-20s %-20s %-10s %-10s%n", "Date & Time", "Action", "Amount", "Balance");
        System.out.println("=== === === === === === === === === === === === === === ===");
        for (String[] t : transactions) {
            System.out.printf("%-20s %-20s %-10s %-10s%n", t[0], t[1], t[2], t[3]);
        }
    }

    // Main simulation
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // User Input owner name
        System.out.print("Bank owner's name: ");
        String owner = scanner.nextLine();
        // User input initial balance
        System.out.print("Enter the initial balance: ");
        double initialBalance = scanner.nextDouble();
        // Create object
        BankAccount_Updated acc = new BankAccount_Updated(owner, initialBalance);
        //Simulate deposits and withdraws
        int choice;
        do {
            System.out.println("\n---- Bank Menu ----");
            System.out.println("1.  Deposit.");
            System.out.println("2.  Withdraw.");
            System.out.println("3.  Check Balance.");
            System.out.println("4.  Transaction History.");
            System.out.println("5.  Exit.");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    acc.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawalAmount = scanner.nextDouble();
                    acc.withdraw(withdrawalAmount);
                    break;
                case 3:
                    System.out.println("Current Balance: " + acc.getBalance());
                    break;
                case 4:
                    acc.printTransactions();
                    break;
                case 5:
                    System.out.println("Exiting... Final Balance for " + acc.getOwner() + ": " + acc.getBalance());
                    acc.printTransactions();
                    break;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
        while (choice != 5);
        scanner.close();
    }
}