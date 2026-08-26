package FZRN_SLIDES.Multithreading;

class MyThread2 extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println("Thread: " + i);
        }
    }
}
public class JoinTest1 {
    public static void main(String[] args) throws InterruptedException {
        MyThread2 t1 = new MyThread2();
        t1.start();
        System.out.println("Main thread");
    }
}
