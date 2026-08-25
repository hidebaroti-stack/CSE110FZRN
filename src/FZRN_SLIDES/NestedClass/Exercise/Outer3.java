package FZRN_SLIDES.NestedClass.Exercise;

public class Outer3 {
    int x = 10;
    class Inner {
        int x = 20;
        void show() {
            System.out.println("Inner x: " + x);
            System.out.println("Outer x: " + Outer3.this.x);
        }
    }
}
class Outer3Test {
    public static void main(String[] args) {
        Outer3 o = new Outer3();
        Outer3.Inner i = o.new Inner();
        i.show();
    }
    /*
    class Outer {
        int x = 10;
        class Inner {
            int x = 20;
            void show() {
                System.out.println("Inner x: " + x);
                System.out.println("Outer x: " + Outer.this.x);
            }
        }
    }
    ▪ Task: Call show() and observe difference.
    */
}