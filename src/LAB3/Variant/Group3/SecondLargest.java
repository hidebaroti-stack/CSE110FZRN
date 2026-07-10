package LAB3.Variant.Group3;

import java.util.Scanner;

public class SecondLargest {
    //E12. Read n integers. Without sorting, find:
    //
    //The largest element
    //The second-largest element
    //Both using separate methods
    //
    //(Q03 method style + second-largest logic from your Set 7)
    public static int largest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        for (int i : arr) {
            if (i > largest) largest = i;
        }
        return largest;
    }

    public static int secondLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int i : arr) {
            if (i > largest) {
                secondLargest = largest;
                largest = i;
            } else if (i > secondLargest && i < largest) {
                secondLargest = i;
            }
        }
        return secondLargest;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the row numbers: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter the array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i]= scanner.nextInt();
        }
        System.out.println("Largest: " + largest(arr));
        System.out.println("Second Largest: " + secondLargest(arr));
    }
}