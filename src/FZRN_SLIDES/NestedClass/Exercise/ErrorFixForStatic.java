package FZRN_SLIDES.NestedClass.Exercise;

class Outer5 {
    static int x = 10;                       // static member
    static class Inner {
        static int y = 20;                   // allowed because Inner is static
        void show() {
            System.out.println("x = " + x);  // can access Outer's static
            System.out.println("y = " + y);  // can access its own static
        }
    }
}
public class ErrorFixForStatic {
    public static void main(String[] args) {
        // No need for Outer object
        Outer5.Inner i = new Outer5.Inner();
        i.show();
    }
}