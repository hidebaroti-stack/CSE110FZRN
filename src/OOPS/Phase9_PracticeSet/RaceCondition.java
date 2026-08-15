package OOPS.Phase9_PracticeSet;

import java.net.ResponseCache;

public class RaceCondition {
    private int count = 0;

    public void increment() {
        count++; /* Three operations -> 1. read count
                                        2. add 1
                                        3. write back
                                                      */
    }
    public int getCount() {
        return count;
    }

    public static void main(String[] args) {
        RaceCondition counter = new RaceCondition();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) counter.increment();
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) counter.increment();
        });

        t1.start();
        t2.start();
        try {
            t1.join(); // wait for t1 to finish
            t2.join(); // wait for t2 to finish
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final count: " + counter.getCount()); // running it might give other than 2000
    }
}