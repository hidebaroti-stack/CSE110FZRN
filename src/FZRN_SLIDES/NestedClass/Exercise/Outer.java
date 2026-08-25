package FZRN_SLIDES.NestedClass.Exercise;

public class Outer {
    int num = 5;
    class Inner {
        void display() {
            System.out.println("Number: " + num);
        }
    }
}
class OuterTest {
    public static void main(String[] args) {
        Outer o = new Outer();
        Outer.Inner i = o.new Inner();
        i.display();
    }

    /*
    class Outer {
        int num = 5;
        class Inner {
            void display() {
                System.out.println("Number: " + num);
            }
        }
    }
    ▪ Task: Create object and print value
     using Inner class.
   */

}