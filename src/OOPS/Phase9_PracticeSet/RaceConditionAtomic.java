package OOPS.Phase9_PracticeSet;

import java.util.concurrent.atomic.AtomicInteger;

public class RaceConditionAtomic {
    private AtomicInteger count = new AtomicInteger(0);

    public void increment() {
        count.incrementAndGet(); // atomic increment
    }
    public int getCount() {
        return count.get(); // safely read value
    }

    public static void main(String[] args) {
        RaceConditionAtomic counter = new RaceConditionAtomic();

        Runnable task = () -> {
            for (int i = 0; i < 1000; i++) counter.increment();
        };

        Thread t1 = new Thread(task, "task1");
        Thread t2 = new Thread(task, "task2");

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Final count: " + counter.getCount());
    }
}