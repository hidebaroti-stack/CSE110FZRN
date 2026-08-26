package FZRN_SLIDES.Multithreading;

class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Thread is running...");
    }
}
public class ByExtendingThread {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        System.out.println("Before start: " + t1.isAlive());
        t1.start();
        System.out.println("After start: " + t1.isAlive());
    }
}