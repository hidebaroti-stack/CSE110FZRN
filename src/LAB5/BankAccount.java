package LAB5;

public class BankAccount {
    double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    public void calculateInterest() {
        System.out.println("Interest calculation method for BankAccount.");

    }
}

class SavingsAccount extends BankAccount {
    private static final double INTEREST_RATE = 0.05;

    public SavingsAccount(double balance) {
        super(balance);
    }

    @Override
    public void calculateInterest() {
        double interest = balance * INTEREST_RATE;
        System.out.println("Savings Account Interest: " + interest);
    }
}

class CheckingAccount extends BankAccount {

    public CheckingAccount(double balance) {
        super(balance);
    }

    public void calculateInterest() {
        System.out.println("Checking Account has no interest.");
    }
}

class BankAccountMain {
    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount(1000);
        SavingsAccount mySavings = new SavingsAccount(20_000);
        CheckingAccount myChecking = new CheckingAccount(10_000);

        bankAccount.calculateInterest();
        mySavings.calculateInterest();
        myChecking.calculateInterest();
    }
}