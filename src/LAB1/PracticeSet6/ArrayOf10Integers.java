package LAB1.PracticeSet6;

import java.util.Scanner;

public class ArrayOf10Integers {
    //Write a program that reads 10 integers into an array and finds:
    //
    //The largest element
    //The smallest element
    //The sum
    //The average
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.print("Enter the array elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.print("Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int largest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) largest = arr[i];
        }
        System.out.print("Largest element: " + largest);
        int smallest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) smallest = arr[i];
        }
        System.out.println();
        System.out.print("Smallest element: " + smallest);
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println();
        System.out.print("The sum of the array elements: " + sum);
        System.out.println();
        System.out.print("The average of the array elements: " + (double)sum / arr.length);
    }
}