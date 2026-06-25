package LAB3.SetA;

import java.util.Scanner;

public class Bubble_Sort_Descending_Count_Swaps {
    //  Bubble Sort Descending + Count Swaps
    //
    //Read n integers. Sort in descending order using bubble sort. Also count and print the total number of swaps made.
    //
    //Sample:
    //Input:  3 1 4 1 5
    //Sorted: 5 4 3 1 1
    //Total swaps: 6
    //(Twist: descending + swap counter — combines her BubbleSort with a counter)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the array size: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        //Bubble sort descending + Swap counter
        int countSwaps = 0;
        for (int i = 0; i < n - 1; i++) {
            boolean isSwapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] < arr[j + 1]) { // Descending order
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    countSwaps++; // Count when swap happens
                    isSwapped = true;
                }

            }
            if (!isSwapped) break; // stop early if no swaps
        }
        // After sorting
        System.out.print("Sorted Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nTotal Swaps: " + countSwaps);
    }
}