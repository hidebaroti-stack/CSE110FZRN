package LAB3.FromLectureSlide;

import java.util.Scanner;

public class FindingSmallestIndexOfLargestElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter the array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int largest = Integer.MIN_VALUE;
        int smallestIndex = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == largest) {
                System.out.println("largest " + largest + " in the positions of " + i);
                if (i < smallestIndex) smallestIndex = i;
            }
        }
        System.out.println("So, the Smallest Index of Largest Element is: " + smallestIndex);
    }
}