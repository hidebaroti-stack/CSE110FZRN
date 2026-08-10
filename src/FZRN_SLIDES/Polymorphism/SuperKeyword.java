package FZRN_SLIDES.Polymorphism;

class Animals {
    public Animals() {
        System.out.println("I am an animal.");
    }
    public void eat() {
        System.out.println("I can eat.");
    }
}
class Dogs extends Animals {
    public Dogs() {
        super();
        System.out.println("I am a dog.");
    }
    @Override
    public void eat() {
        super.eat();
        System.out.println("I eat dog food.");
    }
    public void bark() {
        System.out.println("I can bark.");
    }
}

public class SuperKeyword {
    public static void main(String[] args) {
        Dogs dog = new Dogs();
        dog.eat();
        dog.bark();
    }
}