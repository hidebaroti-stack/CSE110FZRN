package FZRN_SLIDES.ExceptionHandling;

public class ComplexExceptionDemo {
    public static void main(String[] args) {
        String[] data = {"42", null, "0", "hello"};

        for (int i = 0; i <= data.length; i++) {
            try {
                System.out.println("Processing index " + i + "...");
                String value = data[i];

                // Might throw NullPointerException
                int number = Integer.parseInt(value);
                int result = 100 / number;

                System.out.println("Result: " + result);
            } catch (ArrayIndexOutOfBoundsException | ArithmeticException | NullPointerException | NumberFormatException e) {
                System.out.println("Caught Exception: " + e.getMessage());
            } finally {
                System.out.println("Cleaning up index " + i + "...\n");
            }
        }
        System.out.println("Program completed.");
    }
}
