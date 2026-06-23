package LAB3.SetA;

import java.util.Scanner;

public class Right_Circular_Shift_By_K {
    public static void reverse(int[] arr, int left, int right) {
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    public static void rotateRight(int[] arr, int k) {
        k = k % arr.length;

        reverse(arr, 0, arr.length - 1);
        reverse(arr, 0 , k - 1);
        reverse(arr, k, arr.length - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the array size: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.print("Original Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.print("Enter k: ");
        int k = scanner.nextInt();

        rotateRight(arr, k);
        System.out.print("After right circular rotation shift by " + k + ": ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}