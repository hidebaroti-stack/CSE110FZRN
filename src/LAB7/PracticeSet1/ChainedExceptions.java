package LAB7.PracticeSet1;

import java.util.Scanner;

public class ChainedExceptions {
    /**
     * Problem 4 — Chained exceptions
     * Write a method getElement(int[] arr, int index) that:
     *
     * Throws ArrayIndexOutOfBoundsException if index is invalid
     * Throws ArithmeticException if the element at that index is 0
     * Returns the result of 100 / element otherwise
     *
     * Trick: two throws in one method, both handled separately in main
     */
    public static int getElement(int[] arr, int index) throws ArrayIndexOutOfBoundsException, ArithmeticException{
        // If index is invalid, ArrayIndexOutOfBoundsException will be thrown automatically
        int element = arr[index];

        // If element is 0, throw ArithmeticException manually
        if (element == 0) throw new ArithmeticException("Element at index " + index + " is zero.");

        // Otherwise return 100 / element
        return 100 / element;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an array size: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = i * 10;
        }

        System.out.print("Enter an index to access: ");
        int index = scanner.nextInt();

        try {
            int result = getElement(arr, index);
            System.out.println("Result: " + result);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index out of range! valid range is 0 to " + (n - 1));
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic error: " + e.getMessage());
        }
    }
}