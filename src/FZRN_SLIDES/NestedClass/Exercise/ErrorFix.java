package FZRN_SLIDES.NestedClass.Exercise;

class Outer4 {
    int x = 10;
    class Inner {
        int y = 20; // removed 'static'
        void show() {
            System.out.println("x = " + x);
            System.out.println("y = " + y);
        }
    }
}
public class ErrorFix {
    public static void main(String[] args) {
        Outer4 o = new Outer4();        // create outer object
        Outer4.Inner i = o.new Inner(); // create inner object using outer
        i.show();
    }
}
