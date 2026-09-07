package DAKP.Multithreading;

import java.util.Random;

/**
 * Task:
 * Create three threads:
 * First thread → generates random integers (1000 times).
 * Second thread → prints character "A" (1000 times).
 * Third thread → prints symbol "*" (1000 times).
 */

class NumberThread implements Runnable {
    @Override
    public void run() {
        Random random = new Random();
        for (int i = 0; i < 1000; i++) {
            System.out.println(random.nextInt(100) + " ");
        }
    }
}

class CharThread implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("A ");
        }
    }
}

class SymbolThread implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("* ");
        }
    }
}

public class AOf10_3ThreadsGeneratingOutput {
    public static void main(String[] args) {
        Thread t1 = new Thread(new NumberThread());
        Thread t2 = new Thread(new CharThread());
        Thread t3 = new Thread(new SymbolThread());

        // Start threads
        t1.start();
        t2.start();
        t3.start();
    }
}
