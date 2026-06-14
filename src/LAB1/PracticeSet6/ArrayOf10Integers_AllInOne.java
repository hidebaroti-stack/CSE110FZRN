package LAB1.PracticeSet6;

import java.util.Scanner;

public class ArrayOf10Integers_AllInOne {
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
        int sum = 0;
        int largest = arr[0];
        int smallest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (arr[i] > largest) largest = arr[i];
            if (arr[i] < smallest) smallest = arr[i];
        }
        System.out.print("Largest element: " + largest);
        System.out.println();
        System.out.print("Smallest element: " + smallest);
        System.out.println();
        System.out.print("The sum of the array elements: " + sum);
        System.out.println();
        System.out.print("The average of the array elements: " + (double)sum / arr.length);
    }
}
