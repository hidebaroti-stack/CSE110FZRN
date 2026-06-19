package OOPS.Phase1_PracticeSet;

public class Counter {
    private int count;
    // Constructor initializes count to 0
    Counter() {
        this.count = 0;
    }
    // Increment by 1;
    public void increment() {
        count++;
    }

    public void decrement() {
        if (count > 0) {
            count--;
        } else {
            System.out.println("Can't go below 0.");
        }
    }
    // Reset to 0
    public void reset() {
        count = 0;
    }
    // Return current count
    public int getCount() {
        return count;
    }

    public static void main(String[] args) {
        Counter counter = new Counter();

        counter.increment();
        System.out.println("Count after increment: " + counter.getCount());

        counter.decrement();
        System.out.println("Count after decrement: " + counter.getCount());

        counter.decrement();
        System.out.println("Count after decrement: " + counter.getCount());

        counter.reset();
        System.out.println("Counter after reset: " + counter.getCount());
    }
}
