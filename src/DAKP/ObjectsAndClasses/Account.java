package DAKP.ObjectsAndClasses;

import java.util.Date;

public class Account {
    private int id = 0;
    private double balance = 0;
    private double annualInterestRate = 0;
    private Date dateCreated = new Date();

    Account() {
        this(0,0);
    }

    Account(int id, double initialBalance) {
        this.id = id;
        this.balance = initialBalance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public double getMonthlyInterestRate() {
        return (annualInterestRate / 100) / 12;
    }
    public double getMonthlyInterest() {
        return balance * getMonthlyInterestRate();
    }
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds!");
        }
    }
    public void deposit(double amount) {
        if (amount < 0) {
            System.out.println("Invalid deposit amount!");
        } else {
            balance += amount;
        }
    }
}

class TestAccount {
    public static void main(String[] args) {

        Account acc = new Account(1122, 20_000);

        acc.setAnnualInterestRate(4.5);

        acc.withdraw(2500);
        System.out.println("After withdrawal: " + acc.getBalance());
        acc.deposit(3000);
        System.out.println("After deposal: " + acc.getBalance());

        System.out.printf("Monthly Interest: %.2f%n", acc.getMonthlyInterest());
        System.out.println("The date: " + acc.getDateCreated());
    }
}