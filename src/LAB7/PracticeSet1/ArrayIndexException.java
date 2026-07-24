package LAB7.PracticeSet1;

import java.util.Scanner;

public class ArrayIndexException {
    /**
     * Problem 2 — The off by one
     * Create an array of size n from user input. Let the user input an index and print that element.
     * But this time display a custom message showing valid range if out of bounds:
     * "Index out of range! Valid range is 0 to [n-1]."
     *
     * Trick: using n inside the catch block
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = i * 10;
        }

        System.out.print("Enter an index to access: ");
        int index = scanner.nextInt();

        try {
            System.out.println("Value at index: " + index + " = " + arr[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index out of range! Valid range is 0 to " + (n - 1) + ".");
        }
    }
}