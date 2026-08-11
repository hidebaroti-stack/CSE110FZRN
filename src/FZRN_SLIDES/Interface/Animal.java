package FZRN_SLIDES.Interface;

public interface Animal {
    public void eat();
    public void sleep();
}
interface Bird extends Animal {
    public void fly();
}
class Sparrow implements Bird {
    @Override
    public void eat() {
        System.out.println("Sparrow is eating...");
    }

    @Override
    public void sleep() {
        System.out.println("Sparrow is sleeping...");
    }

    @Override
    public void fly() {
        System.out.println("Sparrow is flying...");
    }

    public static void main(String[] args) {
        Sparrow s = new Sparrow();
        s.eat();
        s.sleep();
        s.fly();
    }
}