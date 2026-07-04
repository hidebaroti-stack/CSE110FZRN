package MID_PRACTICE.LAB4.SetA;

public class Account {
    double balance;

    Account() {
        balance = 0;
    }
    Account(double initialBalance) {
        if (initialBalance < 0) {
            balance = 0;
            System.out.println("Invalid input!");
        } else {
            balance = initialBalance;
        }
    }
}
class AccountMain{
    public static void main(String[] args) {

        Account ac1 = new Account();
        System.out.println("For no-arg: " + ac1.balance);

        Account ac2 = new Account(10_000);
        System.out.println("For positive initial balance: " + ac2.balance);

        Account ac3 = new Account(-10_000);
        System.out.println("For negative initial balance: " + ac3.balance);
    }
}