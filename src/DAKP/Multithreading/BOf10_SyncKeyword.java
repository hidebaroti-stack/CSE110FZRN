package DAKP.Multithreading;

import java.io.IOException;

class Account {
    private int balance = 0;

    // synchronized method
    public synchronized void deposit(int amount) {
        balance += amount;
    }
    public int getBalance() {
        return balance;
    }
}

class AddPennyTask implements Runnable {
    private Account account;

    public AddPennyTask(Account account) {
        this.account = account;
    }

    @Override
    public void run() {
        account.deposit(1);
    }
}

public class BOf10_SyncKeyword {
    public static void main(String[] args) throws InterruptedException {
        Account account = new Account();

        Thread[] threads = new Thread[100];
        for (int i = 0; i < 100; i++) {
            threads[i] = new Thread(new AddPennyTask(account));
            threads[i].start();
        }

        // Wait for all threads to finish
        for (int i = 0; i < 100; i++) {
            threads[i].join();
        }

        System.out.println("Final balance: " + account.getBalance());
    }
}