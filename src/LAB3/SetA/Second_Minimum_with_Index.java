package LAB3.SetA;

import java.util.Scanner;

public class Second_Minimum_with_Index {
    //Read n integers. Find the second-smallest element and print its value and index.
    //
    //Sample:
    //Input:  5 3 8 1 3 7
    //Output: Second Minimum: 3 at Index: 1
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Input n
        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        // Create n size array
        int[] arr = new int[n];
        // Input n integers
        System.out.print("Enter the n integers: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        int smallestIndex = 0;
        int secondSmallestIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                secondSmallest = smallest;
                secondSmallestIndex = smallestIndex;
                smallest = arr[i];
                smallestIndex = i;
            }
            if (arr[i] < secondSmallest && arr[i] != smallest) {
                secondSmallest = arr[i];
                secondSmallestIndex = i;
            }
        }
        System.out.println("Second minimum: " + secondSmallest + " at Index: " + secondSmallestIndex);
    }
}
