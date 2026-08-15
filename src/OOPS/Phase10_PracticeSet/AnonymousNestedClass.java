package OOPS.Phase10_PracticeSet;

public class AnonymousNestedClass {
    public static void main(String[] args) {
        // Without anonymous class: using named inner class
        class MyRunnable implements Runnable {
            @Override
            public void run() {
                System.out.println("Running with named class...");
            }
        }
        Thread t1 = new Thread(new MyRunnable());
        t1.start();

        // With anonymous class: same thing, no separate class needed
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Running with anonymous class...");
            }
        });
        t2.start();

        // Using lambda (Java 8+)
        Thread t3 = new Thread(() -> System.out.println("Running with lambda..."));
        t3.start();
    }
}