package OOPS.Phase10_PracticeSet;

public class LocalNestedClass {
    public void someMethod() {
        // Local class - exits only inside this method
        class LocalHelper {
            public void help() {
                System.out.println("Local helper doing work.");
            }
        }
        LocalHelper helper = new LocalHelper();
        helper.help();
    }
}
class LocalMain {
    public static void main(String[] args) {
        LocalNestedClass local = new LocalNestedClass();
        local.someMethod();
    }
}