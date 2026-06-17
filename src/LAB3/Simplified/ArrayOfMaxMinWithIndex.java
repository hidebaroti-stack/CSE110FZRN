package LAB3.Simplified;

import java.util.Scanner;

public class ArrayOfMaxMinWithIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Inout the size of the array
        System.out.print("Enter the size of the array: ");
        int N = scanner.nextInt();
        // Create the int type N sized array
        int[] arr = new int[N];
        // Input the elements of the array
        System.out.print("Enter " + N + " integers: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        // Find the highest and smallest with index
        int highest = Integer.MIN_VALUE;
        int highestIndex = 0;
        int smallest = Integer.MAX_VALUE;
        int smallestIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > highest) {
                highest = arr[i];
                highestIndex = i;
            }
            if (arr[i] < smallest) {
                smallest = arr[i];
                smallestIndex = i;
            }
        }
        // Display the values and index
        System.out.print("Highest Value: " + highest + " at Index: " + highestIndex);
        System.out.println();
        System.out.print("Smallest Value: " + smallest + " at Index: " + smallestIndex);
        scanner.close();
    }
}