package LAB1.PracticeSet7;

import java.util.Scanner;

public class MethodFor_MergeArrays {
    //Write a program with a method mergeArrays(int[] a, int[] b) that merges two arrays into one and returns it. Print the merged array in main.
    public static int[] mergeArrays(int[] a, int[] b) {
        int[] merged = new int[a.length + b.length];
        // Copy from Array a
        for (int i = 0; i < a.length; i++) {
            merged[i] = a[i];
        }
        // Copy from Array b
        for (int i = 0; i < b.length; i++) {
            merged[a.length + i] = b[i];
        }
        return merged;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Array a:
        // Input array size
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        int[] a = new int[n];
        // Input array elements
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }
        System.out.println();
        // Array b:
        System.out.print("Enter the size of the array: ");
        int m = scanner.nextInt();
        int[] b = new int[m];
        // Input array elements
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < b.length; i++) {
            b[i] = scanner.nextInt();
        }
        System.out.println();
        int[] merged = mergeArrays(a, b);
        System.out.print("Merged Array: ");
        for (int merge : merged) {
            System.out.print(merge + " ");
        }
    }
}