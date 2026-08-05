package FZRN_SLIDES.Generics;

class TestGeneric<T> {
    T a;
    T b;

    TestGeneric(T a, T b) {
        this.a = a;
        this.b = b;
    }

    T get() { return a; }
}
public class GenericFloatAndInteger {
    public static void main(String[] args) {
        TestGeneric<Integer> obj1 = new TestGeneric<>(2, 4);

        System.out.println(obj1.a + obj1.b);
        System.out.println(obj1.get());

        TestGeneric<Float> obj2 = new TestGeneric<>(2.5F, 2.5F);
        System.out.println(obj2.a + obj2.b);
        System.out.println(obj2.get());
    }
}