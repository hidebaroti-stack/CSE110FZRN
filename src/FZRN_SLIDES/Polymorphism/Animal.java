package FZRN_SLIDES.Polymorphism;

public class Animal {
    protected String type = "animal";

    public void eat() {
        System.out.println("I can eat.");
    }
    public void sleep() {
        System.out.println("I can sleep.");
    }
}

class Dog extends Animal {

    @Override
    public void eat() {
        System.out.println("I eat dog food.");
    }

    public void bark() {
        System.out.println("I can bark.");
    }
}
class AnimalMain {
    public static void main(String[] args) {
        Dog dog = new Dog();

        dog.eat();
        dog.sleep();
        dog.bark();


        Animal animal = new Dog();

        animal.eat();
        animal.sleep();
        // animal.bark(); // as reference is of superclass
    }
}