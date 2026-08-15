package OOPS.Phase9_PracticeSet;

public class RaceConditionFixed {
    private int count = 0;

    public synchronized void increment() {
        count++; // only one thread can execute this at a time now
    }

    public synchronized int getCount() { return count; }

    public void orIncrement() {
        synchronized (this) { // lock only this specific section
            count++;
        }
        // other non-critical code here runs without locking
    }

    public static void main(String[] args) {
        RaceConditionFixed counter = new RaceConditionFixed();

        // Define tasks with lambdas
        Runnable task1 = () -> {
            for (int i = 0; i < 1000; i++) counter.increment();
        };
        Runnable task2 = () -> {
            for (int i = 0; i < 1000; i++) counter.increment();
        };

        Thread t1 = new Thread(task1);
        Thread t2 = new Thread(task2);

        t1.start();
        t2.start();

        try {
            t1.join(); // main thread WAITS here until t1 finishes
            t2.join(); // main thread WAITS here until t1 finishes
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final count: " + counter.getCount());
        System.out.println("Both threads done."); // guaranteed to print AFTER both finish
    }
}