package DAKP.BasicProgram;

import java.util.Scanner;

public class AOf1_LargestAndSmallestFromArray {
    // a. Write a complete Java program that reads an array of integer numbers
    // and finds the largest and smallest numbers from the array.

    public static int largest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0 ; i < arr.length; i++) {
            if (arr[i] > largest) largest = arr[i];
        }
        return largest;
    }
    public static int smallest(int[] arr) {
        int smallest = Integer.MAX_VALUE;
        for (int i = 0 ; i < arr.length; i++) {
            if (arr[i] < smallest) smallest = arr[i];
        }
        return smallest;

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the array size: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter the array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Largest array element: " + largest(arr));
        System.out.println("Smallest array element: " + smallest(arr));

    }
}