package LAB1.PracticeSet7;

import java.util.Scanner;

public class MethodFor_ReverseArray {
    //Write a method reverseArray(int[] arr) that reverses the array in place
    // — meaning no second array, modify the original itself. Print before and after in main.
    public static void reverseArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
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
        //Calling the reverseArray method -reverse array in place
        reverseArray(arr);
        //Print array after reversal
        System.out.print("Reversed array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}