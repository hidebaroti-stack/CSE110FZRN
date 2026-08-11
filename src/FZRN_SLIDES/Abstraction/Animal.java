package FZRN_SLIDES.Abstraction;

public abstract class Animal {
    public abstract void sound();
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Woof");
    }
}
class AnimalMain {
    public static void main(String[] args) {
        Animal obj = new Dog();
        obj.sound();
    }
}