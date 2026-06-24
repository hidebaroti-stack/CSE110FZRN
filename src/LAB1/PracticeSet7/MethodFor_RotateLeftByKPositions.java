package LAB1.PracticeSet7;

import java.util.Scanner;

public class MethodFor_RotateLeftByKPositions {
    //Write a program that reads an array of integers and rotates it left by k positions.
    //Sample: [1, 2, 3, 4, 5], k=2 → [3, 4, 5, 1, 2]
    public static void reverse(int[] arr, int left, int right) {
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
    public static int[] rotateLeftInPlace(int[] arr, int k) {
        k = k % arr.length;
        // step 1: reverse first k
        reverse(arr, 0, k - 1);
        // step 2: reverse remaining n - k
        reverse(arr, k, arr.length - 1);
        // step 3: reverse whole array
        reverse(arr, 0, arr.length - 1);

        return arr;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Input array size
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        //Input array elements
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        //Print array elements
        System.out.print("Original array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.print("Enter the k: ");
        int k = scanner.nextInt();
        //Calling rotateLeftInPlace() method
        int[] rotate = rotateLeftInPlace(arr, k);
        System.out.print("Rotate Left By k Positions: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(rotate[i] + " ");
        }
    }
}