package QUIZ_2;

public class MultipleCatchBlocks {
    //Multiple catch blocks
    //Write a method that takes an array and an index, and:
    //
    //catches ArrayIndexOutOfBoundsException separately
    //catches ArithmeticException (e.g. divide by the value at that index) separately
    //has a finally block that prints "Done processing
    public static void processArray(int[] arr, int index) {
        try {
            int value = arr[index];   // Try to access the element
            int result = 100 / value; // Try dividing 100 by that element

            System.out.println("Result: " + result);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid index! " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by 0!");
        } finally {
            System.out.println("Done processing.");
        }
    }
    public static void main(String[] args) {
        int[] numbers = {10, 0, 5};


        // Case 1: Valid index, non-zero
        processArray(numbers, 0);

        // Case 2: Valid index, but zero → ArithmeticException
        processArray(numbers, 1);

        // Case 3: Invalid index → ArrayIndexOutOfBoundsException
        processArray(numbers, 5);
    }
}