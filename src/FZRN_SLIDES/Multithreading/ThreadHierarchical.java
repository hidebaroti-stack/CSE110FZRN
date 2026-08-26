package FZRN_SLIDES.Multithreading;

class A extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("\t From ThreadA: " + i);
        }
        System.out.println("Exit from A");
    }
}
class B extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("\t From ThreadB: " + i);
        }
        System.out.println("Exit from B");
    }
}
class C extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("\t From ThreadC: " + i);
        }
        System.out.println("Exit from C");
    }
}
public class ThreadHierarchical {
    public static void main(String[] args) {
        new A().start();
        new B().start();
        new C().start();
    }
}