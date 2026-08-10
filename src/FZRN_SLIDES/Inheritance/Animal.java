package FZRN_SLIDES.Inheritance;

public class Animal {
    public void eat() {
        System.out.println("I can eat.");
    }
    public void sleep() {
        System.out.println("I can sleep.");
    }
}
class Dog extends Animal {
    public void bark() {
        System.out.println("I can bark.");
    }
}
class AnimalMain {
    public static void main(String[] args) {
        Dog dog = new Dog();

        dog.eat();     // Animals method
        dog.sleep();   // Animals method
        dog.bark();    // Dog's own method

        Animal animal = new Animal();

        animal.eat();
        animal.sleep();

    }
}