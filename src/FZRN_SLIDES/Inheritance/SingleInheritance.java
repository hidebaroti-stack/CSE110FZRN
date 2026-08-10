package FZRN_SLIDES.Inheritance;

class Animals {
    void eat() {
        System.out.println("eating...");
    }
}

class Dogs extends Animals {
    void bark() {
        System.out.println("barking...");
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        Dogs dogs = new Dogs();

        dogs.eat();
        dogs.bark();
    }
}