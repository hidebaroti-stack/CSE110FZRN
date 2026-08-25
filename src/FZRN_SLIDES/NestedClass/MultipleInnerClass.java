package FZRN_SLIDES.NestedClass;

class Outer {
    class Inner1 {
        void show1() {
            System.out.println("Inner1");
        }
    }
    class Inner2 {
        void show2() {
            System.out.println("Inner2");
        }
    }
}
public class MultipleInnerClass {
    public static void main(String[] args) {
        // Step 1: Outer Object
        Outer o = new Outer();

        // Step 2: Inner1 Object
        Outer.Inner1 i1 = o.new Inner1();
        i1.show1();

        //Step 3: Inner2 Object
        Outer.Inner2 i2 = o.new Inner2();
        i2.show2();
    }
}