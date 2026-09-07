package DAKP.Multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class AccountLock {
    private int balance = 0;
    private Lock lock = new ReentrantLock();

    public void deposit(int amount) {
        lock.lock(); // acquire lock
        try {
            balance += amount;
        } finally {
            lock.unlock(); // release lock
        }
    }

    public int getBalance() {
        return balance;
    }
}

class AddPennyTaskLock implements Runnable {
    private AccountLock account;

    public AddPennyTaskLock(AccountLock account) {
        this.account = account;
    }

    public void run() {
        account.deposit(1);
    }
}

public class BOf10_LockMechanism {
    public static void main(String[] args) {
        AccountLock account = new AccountLock();

        Thread[] threads = new Thread[100];
        for (int i = 0; i < 100; i++) {
            threads[i] = new Thread(new AddPennyTaskLock(account));
            threads[i].start();
        }
        // Wait for all threads
        for (int i = 0; i < 100; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Final balance (lock): " + account.getBalance());
    }
}
