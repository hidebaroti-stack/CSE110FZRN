package FZRN_SLIDES.Multithreading;

public class JoinTest2AfterJoin {
    public static void main(String[] args) throws InterruptedException {
        MyThread2 t1 = new MyThread2();
        t1.start();
        t1.join(); // Main wait until t1 finishes
        System.out.println("Main thread continues after t1 finishes.");
    }
}