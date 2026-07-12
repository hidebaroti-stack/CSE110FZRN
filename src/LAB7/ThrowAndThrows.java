package LAB7;

public class ThrowAndThrows {
    static void checkAge(int age) throws ArithmeticException {
        if (age < 18) {
            throw new ArithmeticException("Access denied - You must be at least 18 yeas old.");
        } else {
            System.out.println("Access granted - You are old enough!");
        }
    }
    public static void main(String[] args) {
        try {
            checkAge(16);
        } catch (ArithmeticException e) {
            System.out.println("Caught Exception: " + e);
        }
        System.out.println("Program continues...");
    }
}
