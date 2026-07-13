package LAB7.Problems;

import java.util.Scanner;

public class ArrayIndexOutOfBoundsExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        try {
            int result = arr[n + 1];
            System.out.println("Result: " + result);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out Bounds Exception." + e);
        }
    }
}