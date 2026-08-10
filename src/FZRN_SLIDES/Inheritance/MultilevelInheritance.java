package FZRN_SLIDES.Inheritance;

class BabyDog extends Dogs {
    void weep() {
        System.out.println("weeping...");
    }
}
public class MultilevelInheritance {
    public static void main(String[] args) {
        BabyDog d = new BabyDog();

        d.eat();
        d.bark();
        d.weep();
    }
}