package MID_PRACTICE.CodeThis;

import java.util.Scanner;

public class CopyArray {
    //Write a program that copies all elements of one array into a second array and prints both.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter the array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("First Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        int[] brr = new int[n];
        for (int i = 0; i < n; i++) {
            brr[i] = arr[i];
        }
        System.out.print(" and Second Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(brr[i] + " ");
        }
    }
}
