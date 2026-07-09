package MID_PRACTICE.CodeThis;

public class BankAccount {
   private double balance;

   BankAccount(double initialBalance) {
       this.balance = initialBalance;
   }

    public double getBalance() {
        return balance;
    }

    void deposit(double amount) {
        if (amount < 0) System.out.println("Invalid input!");
        else balance += amount;
    }

    void withdraw(double amount) {
       if (amount > balance) System.out.println("Invalid funds!");
       else balance -= amount;
    }
}

class BankAccountMain {
    //Create a class BankAccount with private balance.
    //Provide deposit(double amount) (reject if negative), withdraw(double amount) (reject if more than balance), and getBalance(). Test in main.
    public static void main(String[] args) {
       BankAccount acc = new BankAccount(10000);
       acc.deposit(2000);
       System.out.println("Balance: " + acc.getBalance());
       acc.withdraw(3000);
       System.out.println("Balance: " + acc.getBalance());

       acc.deposit(-20000);
       System.out.println("Balance: " + acc.getBalance());
       acc.withdraw(30000);
       System.out.println("Balance: " + acc.getBalance());
    }
}