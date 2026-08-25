package FZRN_SLIDES.NestedClass.Exercise;

public class Outer2 {
    static int value = 30;
    static class Nested {
        void show() {
            System.out.println("Value: " + value);
        }
    }
}
class Outer2Test {
    public static void main(String[] args) {
        // Create object of static nested class without outer instance
        Outer2.Nested n = new Outer2.Nested();
        n.show();
    }

    /*
    class Outer {
        static int value = 30;
        static class Nested {
            void show() {
                System.out.println("Value: " + value);

            }
        }
    }
    ▪ Task: Create object without outer
    class instance and print value.
     */
}