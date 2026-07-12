package LAB7;

public class NestedTryCatch {
    public static void main(String[] args) {

        try {
            System.out.println("Outer try block starts.");
            try {
                int a = 10 / 0;
            } catch (ArithmeticException e) {
                System.out.println("Inner catch: ArithmeticException caught.");
            }
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("Outer catch: NullPointerException caught.");
        }
        System.out.println("Program continues...");
    }
}