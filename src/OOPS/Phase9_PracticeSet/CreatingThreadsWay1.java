package OOPS.Phase9_PracticeSet;

class MyThread extends Thread {
    private String name;
    public MyThread(String name) {
        this.name = name;
    }
    @Override
    public void run() {
        // code that runs in this thread
        for (int i = 1; i <= 5; i++) {
            System.out.println(name + " - Count: " + i);
            try {
                Thread.sleep(500); // pause 500ms - simulates work
            } catch (InterruptedException e) {
                System.out.println(name + " interrupted.");
            }
        }
    }
}
public class CreatingThreadsWay1 {
    // Way 1 - extending Thread
    public static void main(String[] args) {
        MyThread t1 = new MyThread("Thread A");
        MyThread t2 = new MyThread("Thread B");

        t1.start(); // do not call t1.run() - that would run sequentially on main thread
        t2.start(); // start() creates a new thread and runs run() on it
    }
}