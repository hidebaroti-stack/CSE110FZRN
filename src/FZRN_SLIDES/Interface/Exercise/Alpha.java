package FZRN_SLIDES.Interface.Exercise;

public interface Alpha {
    void alphaMethod();
}
interface Bravo {
    void bravoMethod();
}
interface Charlie extends Alpha, Bravo {
    void charlieMethod();
}
class MyClass implements Charlie {
    @Override
    public void alphaMethod() {
        System.out.println("Alpha");
    }

    @Override
    public void bravoMethod() {
        System.out.println("Bravo");
    }

    @Override
    public void charlieMethod() {
        System.out.println("Charlie");
    }

    public static void main(String[] args) {
        MyClass c = new MyClass();
        c.alphaMethod();
        c.bravoMethod();
        c.charlieMethod();
    }
}