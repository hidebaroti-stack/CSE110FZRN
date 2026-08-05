package FZRN_SLIDES.Generics;

class Test<T> {
    T a;
    T b;

    Test(T x, T y) {
        a = x;
        b = y;
    }
}
public class GenericConstructor {
    public static void main(String[] args) {
        Test<Integer> obj = new Test<>(2, 4);

        System.out.println(obj.a + obj.b);
    }
}