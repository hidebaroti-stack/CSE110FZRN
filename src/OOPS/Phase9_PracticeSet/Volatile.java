package OOPS.Phase9_PracticeSet;

class FlagExample implements Runnable {
    private volatile boolean running = true; // volatile guarantees visibility

    @Override
    public void run() {
        while (running) {
            // doing work...
            try {
                Thread.sleep(100); // slow down to see effects
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName() + " stopped.");
    }
    public void stop() {
        running = false; // change visibility to other threads immediately
    }
}

public class Volatile {
    public static void main(String[] args) {
        FlagExample task = new FlagExample();
        Thread worker = new Thread(task, "WorkerThread");

        worker.start();

        try {
            Thread.sleep(1000); // let worker run for a while
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Main thread requests stop...");
        task.stop(); // signal worker to stop

        try {
            worker.join(); // wait for worker to finish
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Main thread finished.");
    }
}