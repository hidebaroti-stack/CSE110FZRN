package FZRN_SLIDES.NestedClass;

class Outer3 {
    int x = 50;
    class Inner {
        int x = 100;
        void show() {
            System.out.println(x);             // Inner x
            System.out.println(Outer3.this.x); // Outer x
        }
    }
}
public class Shadowing {
    public static void main(String[] args) {
        Outer3 o = new Outer3();
        Outer3.Inner i = o.new Inner();
        i.show();
    }
}
