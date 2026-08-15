package OOPS.Phase10_PracticeSet;

public class StaticNestedClass {
    private static String outerStatic = "I am static outer field";

    // Static nested class
    public static class StaticNested {
        public void display() {
            System.out.println("Static nested class.");
            System.out.println(outerStatic); // can access STATIC outer fields only
        }
    }
}
// No outer objected needed - created directly
class StaticMain {
    public static void main(String[] args) {
        StaticNestedClass.StaticNested nested = new StaticNestedClass.StaticNested();
        nested.display();
    }
}