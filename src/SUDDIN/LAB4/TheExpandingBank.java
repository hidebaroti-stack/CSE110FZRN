package SUDDIN.LAB4;

class BankAccount {
    protected double balance;

    BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit: " + amount);
    }
    void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds");
        } else {
            balance -= amount;
            System.out.println("Withdraw: " + amount);
        }
    }
    void showBalance() {
        System.out.println("Balance: " + balance);
    }
}

class SavingsAccount extends BankAccount {
    private double interestRate;

    SavingsAccount(double initialBalance, double interestRate) {
        super(initialBalance);
        this.interestRate = interestRate;
    }
    void addInterest() {
        double interest = balance * interestRate / 100;
        balance += interest;
        System.out.println("Interest added: " + interest);
    }
}
class StudentAccount extends SavingsAccount {
    private double bonusAmount;

    StudentAccount(double initialBalance, double interestRate, double bonusAmount) {
        super(initialBalance, interestRate);
        this.bonusAmount = bonusAmount;
    }
    @Override
    void deposit(double amount) {
        super.deposit(amount);
        if (amount > 1000) {
            balance += bonusAmount;
            System.out.println("Bonus added: " + bonusAmount);
        }
    }
}

public class TheExpandingBank {
    public static void main(String[] args) {

        BankAccount acc1 = new BankAccount(10_000);
        acc1.deposit(1000);
        acc1.showBalance();
        acc1.withdraw(500);
        acc1.showBalance();

        SavingsAccount acc2 = new SavingsAccount(5000, 5);
        acc2.deposit(2000);
        acc2.showBalance();
        acc2.withdraw(500);
        acc2.showBalance();
        acc2.addInterest();
        acc2.showBalance();

        StudentAccount acc3 = new StudentAccount(2000, 4, 100);
        acc3.deposit(1500);
        acc3.showBalance();
        acc3.withdraw(500);
        acc3.showBalance();
    }
}