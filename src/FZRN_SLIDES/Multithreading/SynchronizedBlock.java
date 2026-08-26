package FZRN_SLIDES.Multithreading;

class Counter2 {
    int count = 0;
    void increment() {
        System.out.println("Start"); // not synchronized
        synchronized (this) {
            count++;
        }
        System.out.println("End");  // not synchronized
    }
}
public class SynchronizedBlock {
    public static void main(String[] args) {
        Counter2 c = new Counter2();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                c.increment();
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                c.increment();
            }
        });
        t1.start();
        t2.start();

        try {
            t1.join(); // wait until t1 finishes
            t2.join(); // wait until t2 finishes
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Final count: " + c.count);
    }
}
