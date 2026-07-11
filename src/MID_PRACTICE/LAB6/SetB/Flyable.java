package MID_PRACTICE.LAB6.SetB;

interface Flyable {
    void fly();
}
interface Swimmable {
    void swim();
}
class Duck implements Flyable, Swimmable {
    public void fly() {
        System.out.println("Duck can fly.");
    }
    public void swim() {
        System.out.println("Duck can swim.");
    }
}
class DuckMain {
    public static void main(String[] args) {
        Flyable f = new Duck();
        f.fly();
        Swimmable s = new Duck();
        s.swim();
    }
}