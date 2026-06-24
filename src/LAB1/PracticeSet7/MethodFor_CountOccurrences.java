package LAB1.PracticeSet7;

import java.util.Scanner;

public class MethodFor_CountOccurrences {
    //Write a method countOccurrences(int[] arr, int key) that returns how many times key appears in the array.
    //In main, read the array, read the key, call the method, print result.
    public static int countOccurrences(int[] arr, int key) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) count++;
        }
        return count;
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
        System.out.print("Elements of the array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        //Input the key
        System.out.print("Enter the key to find: ");
        int key = scanner.nextInt();
        //Count Occurrences
        System.out.println("Key found: " + countOccurrences(arr, key) + " times");
    }
}