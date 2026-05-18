package LAB3;

import java.util.Scanner;

public class ArrayOfMaxMinWithIndex {
    /* 03: Write a Java program that input an integer array of size N from the user.
    Then, find the value and index (position) of the highest and the smallest element.
    Use separate method for determining highest and smallest element.*/
    static void highestElement(int[] arr){
        int i;
        int highest = arr[0];
        int highestIndex = 0;
        for (i = 0; i < arr.length; i++) {
            if (arr[i] > highest) {
                highest = arr[i];
                highestIndex = i;
            }
        }
        System.out.println("Highest Value: " + highest + " at index: " + highestIndex);
    }
    static void smallestElement(int[] arr){
        int j;
        int smallest = arr[0];
        int smallestIndex =0;
        for (j = 0; j < arr.length; j++) {
            if (arr[j] < smallest) {
                smallest = arr[j];
                smallestIndex = j;
            }
        }
        System.out.println("Smallest Value: " + smallest + " at index: " + smallestIndex);

    }
    static void main() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the Array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
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
        System.out.println();
        highestElement(arr);
        smallestElement(arr);
    }
}