package FZRN_SLIDES.Interface.Exercise;

interface Animal {
    void makeSound();
}
interface Pet extends Animal {
    void beFriendly();
}
abstract class Cat implements Pet {
    public void makeSound() {
        System.out.println("Meow");
    }
}
class HouseCat extends Cat implements Pet {
    public void beFriendly() {
        System.out.println("Purring...");
    }
    public static void main(String[] args) {
        Pet p = new HouseCat();
        p.makeSound();
        p.beFriendly();
    }
}