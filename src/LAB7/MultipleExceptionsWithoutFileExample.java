package LAB7;

public class MultipleExceptionsWithoutFileExample {
    static void validateData(Integer num1, Integer num2) throws ArithmeticException, NullPointerException {
        if (num1 == null || num2 == null) {
            throw new NullPointerException("Input values cannot be null.");
        } else {
            int result = num1 / num2;
            System.out.println("Result: " + result);
        }
    }

    public static void main(String[] args) {
        try {
            validateData(10, 0);
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
    }
}