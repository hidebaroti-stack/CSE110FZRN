package LAB1.PracticeSet7;

import java.util.Scanner;

public class MethodForPalindrome {
    //Write a method isPalindrome(int[] arr) that returns true if the array reads the same forwards and backwards.
    //Sample: [1, 2, 3, 2, 1] → true
    //[1, 2, 3, 4, 5] → false
    public static boolean isPalindrome(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            if (arr[left] != arr[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;
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
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
        System.out.println("The array is Palindrome: " + isPalindrome(arr));
        scanner.close();
    }
}