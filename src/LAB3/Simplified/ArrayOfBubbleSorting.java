package LAB3.Simplified;

import java.util.Scanner;

public class ArrayOfBubbleSorting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Input array size
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        // Create int type array
        int[] arr = new int[n];
        // Input array elements
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        // Bubble Sort optimized with isSwap flag
        for (int i = 0; i < arr.length - 1; i++) {
            boolean isSwapped = false;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isSwapped = true;
                }
            }
            if (!isSwapped) break;
        }
        // Display the array
        System.out.print("After Bubble Sort: ");
        for (int j : arr) {
            System.out.print(j + " ");
        }
        scanner.close();
    }
}