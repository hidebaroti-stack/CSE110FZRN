package LAB3;

import java.util.Scanner;

public class ArrayOfBubbleSorting {
    //04: Write a Java program that input an integer array of size N from the user. Then, sort the array using bubble sort.
    static void main() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the Array: ");
        int N = scanner.nextInt();
        int[] arr = new int[N];
        //Input Elements
        System.out.print("Enter the elements of the Array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        //Printing Elements
        System.out.print("The elements of the Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        //Bubble Sort
        for (int i = 0; i < arr.length-1 ; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if ( arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println();
        //Printing sorted array
        System.out.print("Sorted array: ");
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}