package FZRN_SLIDES.NestedClass;

class Outer2 {
    static class Nested {
        static int x = 20;
        void show() {
            System.out.println(x);
        }
    }
}

public class StaticNestedClass {
    public static void main(String[] args) {
        Outer2.Nested n = new Outer2.Nested();
        n.show();
    }
}
