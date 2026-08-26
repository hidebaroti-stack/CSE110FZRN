package FZRN_SLIDES.Multithreading;

class X extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("\t from threadA." + "i = " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class SleepInThread {
    public static void main(String[] args) {
        X x = new X();
        x.start();
    }
}