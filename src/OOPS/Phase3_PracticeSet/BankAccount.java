package OOPS.Phase3_PracticeSet;

public class BankAccount {
    private String owner;
    private double balance;
    private static double totalBankFunds = 0; // tracks total money across ALL accounts
    private static int accountCount = 0;      // tracks how many accounts exists

    BankAccount(String owner, double initialBalance) {
        this.owner = owner;
        this.balance = initialBalance;

        accountCount++;                        // increment account count
        this.totalBankFunds += initialBalance; // add to total funds

    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            totalBankFunds += amount;
        }
    }

    public double getBalance() {
        return balance;
    }

    public static void displayBankSummary() {
        System.out.println("Total accounts created: " + accountCount);
        System.out.println("Total funds across the whole bank: " + totalBankFunds);
    }
}
class BankAccountMain {
    public static void main(String[] args) {

        BankAccount acc1 = new BankAccount("Karan", 20_000);
        BankAccount acc2 = new BankAccount("Sneha", 50_000);
        BankAccount acc3 = new BankAccount("Mohan", 1_00_000);

        acc2.deposit(5653.98);
        acc3.deposit(10_865.786);

        BankAccount.displayBankSummary();

    }
}