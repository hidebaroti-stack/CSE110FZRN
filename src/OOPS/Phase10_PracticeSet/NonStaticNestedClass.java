package OOPS.Phase10_PracticeSet;

public class NonStaticNestedClass {
    private String outerField = "I am outer instance field";

    // Non-static inner class
    public class Inner {
        public void display() {
            System.out.println("Inner class.");
            System.out.println(outerField);
        }
    }
}
class NonStaticMain {
    public static void main(String[] args) {
        NonStaticNestedClass outer = new NonStaticNestedClass();
        NonStaticNestedClass.Inner inner = outer.new Inner(); // special syntax
        inner.display();
    }
}