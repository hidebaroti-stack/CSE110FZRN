package FINAL_PRACTICE;

class MyThread extends Thread {
    @Override
    public void run() {
        try {
            // Simulate some work with sleep
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
public class SleepTest {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start(); // start the thread

        try {
            t.join(); // main waits until t finishes
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Done");
    }
}