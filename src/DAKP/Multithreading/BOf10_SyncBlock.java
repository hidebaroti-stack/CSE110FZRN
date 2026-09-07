package DAKP.Multithreading;

class AccountBlock {
    private int balance = 0;

    public void deposit(int amount) {
        // Only this block is synchronized
        synchronized (this) {
            balance += amount;
        }
    }

    public int getBalance() {
        return balance;
    }
}
class AddPennyTaskBlock implements Runnable {
    private AccountBlock account;

    public AddPennyTaskBlock(AccountBlock account) {
        this.account = account;
    }

    @Override
    public void run() {
        account.deposit(1);
    }
}

public class BOf10_SyncBlock {
    public static void main(String[] args) throws InterruptedException {
        AccountBlock account = new AccountBlock();

        Thread[] threads = new Thread[100];
        for (int i = 0; i < 100; i++) {
            threads[i] = new Thread(new AddPennyTaskBlock(account));
            threads[i].start();
        }

        // Wait for all threads
        for (int i = 0; i < 100; i++) {
            threads[i].join();
        }
        System.out.println("Final balance (Sync Block): " + account.getBalance());
    }
}