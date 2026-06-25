package LAB1.PracticeSet7;

import java.util.Scanner;

public class MethodFor_ReverseArrayBruteForce {
    public static int[] reverseArray(int[] arr) {
        int[] reverseArray = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reverseArray[i] = arr[arr.length - 1 - i];
        }
        return reverseArray;
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
        int[] reverseArray = reverseArray(arr);
        //Print array after reversal
        System.out.print("Reversed array: ");
        for (int i = 0; i < reverseArray.length; i++) {
            System.out.print(reverseArray[i] + " ");
        }
    }
}