package FZRN_SLIDES.Inheritance;

class Cat extends Animal {
    void meow() {
        System.out.println("meowing...");
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.eat();
        cat.meow();
    }
}