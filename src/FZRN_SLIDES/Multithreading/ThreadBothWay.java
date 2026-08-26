package FZRN_SLIDES.Multithreading;

class Multi1 extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("\t From Thread 1 i = " + i);
        }
    }
}
class Multi2 extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("\t From Thread 2 i = " + i);
        }
    }
}
public class ThreadBothWay {
    public static void main(String[] args) {
        Multi1 m1 = new Multi1();
        m1.start();

        Multi2 m2 = new Multi2();
        m2.start();
    }
}