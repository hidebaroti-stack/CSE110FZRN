package OOPS.Phase9_PracticeSet;

class MyTask implements Runnable {
    private String name;

    public MyTask(String name) {
        this.name = name;
    }
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(name + " - Count: " + i);
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

public class CreatingThreadsWay2 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyTask("Task A"));
        Thread t2 = new Thread(new MyTask("Task B"));

        t1.start();
        t2.start();
    }
}