package MID_PRACTICE.LAB5.SetA;

public class Animal {
    String name;

    void makeSound() {
        System.out.println("Some sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog make sound BARK! BARK!");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cat make sound MEOW! MEOW!");
    }
}

class AnimalMain {
    public static void main(String[] args) {
        Animal[] animals = {
                new Dog(),
                new Cat()
        };

        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
}