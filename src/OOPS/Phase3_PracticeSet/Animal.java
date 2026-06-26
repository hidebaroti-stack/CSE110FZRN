package OOPS.Phase3_PracticeSet;

public abstract class Animal {
    public abstract void makeSound();

    public void eat() {
        System.out.println("Animal is eating...");
    }
}

interface Swimmer {
    void swim();
}

class Duck extends Animal implements Swimmer {
    @Override
    public void makeSound() {
        System.out.println("Duck says: Quack Quack!!");
    }

    @Override
    public void swim() {
        System.out.println("Duck is swimming...");
    }
}
class InterfaceAndAbstract {
    public static void main(String[] args) {

        Duck duck = new Duck();

        duck.makeSound(); // from Animal (abstract method implement in Duck)
        duck.eat();       // from Animal (regular method)
        duck.swim();      // from Swimmer (interface method)
    }
}