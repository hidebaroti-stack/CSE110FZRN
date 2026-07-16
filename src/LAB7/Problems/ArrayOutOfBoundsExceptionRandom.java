package LAB7.Problems;

import java.util.Scanner;

public class ArrayOutOfBoundsExceptionRandom {
    //4. Write a program that meets the following requirements: Creates an array with 100 randomly chosen integers.
    // Prompts the user to enter the index of the array, then displays the corresponding element value.
    // If the specified index is out of bounds, display the message Out of Bounds.
    public static void main(String[] args) {
        int[] arr = new int[100]; // Creates an array of size 100.

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 100); // Fills it with random integers between 0-99
        }
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the index of the array: ");
        int index = scanner.nextInt(); // Prompts the user to enter an index

        try {
            int value = arr[index]; // tries to access the array at that index
            System.out.println("Value of index: " + index + ": " + value); // for valid index
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Out Of Bounds!"); // for exception
        }
    }
}