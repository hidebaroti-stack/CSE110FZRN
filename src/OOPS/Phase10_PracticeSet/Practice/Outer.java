package OOPS.Phase10_PracticeSet.Practice;

public class Outer {
    int x = 10; // outer field

    class Inner {
        int x = 20; // inner field

        void show() {
            int x = 30; // local variable

            // Print all three
            System.out.println("Local x = " + x);              // refers to local variable (30)
            System.out.println("Inner x = " + this.x);        // refers to inner class field (20)
            System.out.println("Outer x = " + Outer.this.x); // refers to outer class field (10)
        }
    }
}
class Shadowing {
    public static void main(String[] args) {
        Outer o = new Outer();
        Outer.Inner i = o.new Inner();
        i.show();
    }
}