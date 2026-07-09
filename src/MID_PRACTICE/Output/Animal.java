package MID_PRACTICE.Output;

public class Animal {
    String type = "Animal";
    Animal() {
        System.out.println("Animal created");
    }
    void sound() {
        System.out.println("Generic sound");
    }
}
class Dog extends Animal {
    String type = "Dog";
    Dog() {
        System.out.println("Dog created");
    }
    @Override
    void sound() {
        System.out.println("Bark");
    }
}
class Main {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.sound();
        System.out.println(a.type);
    }
}