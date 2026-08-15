package OOPS.Phase9_PracticeSet;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolWithExecutorService {
    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(3); // 3 threads in the pool

        for (int i = 0; i <= 6; i++) {
            final int taskNum = i;
            pool.execute(() -> {
                System.out.println("Task " + taskNum + " running on " + Thread.currentThread().getName());
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }
        pool.shutdown(); // no new tasks accepted, existing tasks finish
    }
}