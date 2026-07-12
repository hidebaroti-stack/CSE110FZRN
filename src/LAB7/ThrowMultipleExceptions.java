package LAB7;

public class ThrowMultipleExceptions {
    static void validateAge(int age) {
        try {
            if (age < 18) {
                throw new ArithmeticException("Age must be 18 or older.");
            } else {
                System.out.println("Age is valid!");
            }
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        validateAge(15);
        validateAge(20);
    }
}