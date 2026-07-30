package QUIZ_2;

class InsufficientFundsException extends Exception {
    InsufficientFundsException (String str) {
        super (str);
    }
}

public class BankAccount {
    // Write a class BankAccount with a withdraw(double amount) method that throws a custom checked exception InsufficientFundsException
    // if the amount exceeds the balance. Show how you'd call it with try-catch.
    double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }
    double withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) throw new InsufficientFundsException ("Invalid approach!");
        else return balance - amount;
    }
}
class BankAccountCheck {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount(10000);

        try {
            System.out.println("Withdraw: " + acc.withdraw(20000));
        } catch (InsufficientFundsException e) {
            System.out.println("Insufficient Funds");
        }
        try {
            System.out.println("Withdraw: " + acc.withdraw(2000));
        } catch (InsufficientFundsException e) {
            System.out.println("Insufficient Funds");
        }
    }
}