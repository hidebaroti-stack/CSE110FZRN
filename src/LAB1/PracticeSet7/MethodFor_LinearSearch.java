package LAB1.PracticeSet7;

import java.util.Scanner;

public class MethodFor_LinearSearch {
    //Write a method linearSearch(int[] arr, int key) that returns the index of the key in the array,
    // or -1 if not found. Test it in main.
    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) return i;
        }
        return -1;
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
        //Calling the linearSearch method
        System.out.print("The key found is : " + linearSearch(arr, key));
    }
}