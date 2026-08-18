package OOPS.Phase10_PracticeSet;

class Outer {
    int x = 10; // outer x

    class Inner {
        int x = 20; // inner x - shadows outer x

        void display() {
            int x = 30; // local x - shadows inner x

            System.out.println(x);              // 30 - local variable
            System.out.println(this.x);         // 20 - inner class field
            System.out.println(Outer.this.x);   // 10 - outer class field
        }
    }
}

public class VariableShadowing {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.display();
    }
}