package SUDDIN.LAB2;

/* Problem 2: ATM System Simulation
Create a Java program that simulates a simple ATM system using object-oriented programming.
Requirements: 1. Define an ATM class with the following:
     ○ A private double balance field initialized through the constructor.
     ○ A deposit method that takes a double depositAmount and adds it to the balance.
     ○ A withdrawal method that takes a double withdrawAmount and deducts it from the balance if funds are sufficient; otherwise, print "Insufficient balance".
     ○ A getBalance method that returns the current balance.
              2. Implement a main class where:
     ○ An ATM object is created with an initial balance of 5000. ○ The user deposits 2000 into the account.
     ○ The user withdraws 1000 successfully.
     ○ An attempt is made to withdraw 6000, which should result in "Insufficient balance".
     Your program should correctly handle deposits, withdrawals, and balance checks.
*/

class ATM {
    private double balance;

    ATM(double balance) {
        this.balance = balance;
    }

    void deposit(double depositAmount) {
        balance += depositAmount;
        System.out.println("Deposited: " + depositAmount + ", New Balance: " + balance);
    }

    void withdraw(double withdrawAmount) {
        if (withdrawAmount >= balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance -= withdrawAmount;
            System.out.println("Withdrew: " + withdrawAmount + ", New Balance: " + balance);
        }
    }

    public double getBalance() {
        return balance;
    }
}

public class ATMSystemSimulation {
    public static void main(String[] args) {

        ATM atm = new ATM(5000);

        atm.deposit(2000);
        atm.withdraw(1000);
        atm.withdraw(6000);

        System.out.println("Current balance: " + atm.getBalance());
    }

}