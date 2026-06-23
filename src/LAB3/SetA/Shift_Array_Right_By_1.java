package LAB3.SetA;

import java.util.Scanner;

public class Shift_Array_Right_By_1 {
    // Shift Array Right by 1
    //
    //Read n integers. Shift every element one position to the right. The last element wraps to the first position. Print original and shifted.
    //
    //Sample:
    //Input:  1 2 3 4 5
    //Output: 5 1 2 3 4
    //(Twist: circular shift — needs temp variable and careful loop direction)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the array size: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.print("Original Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        // Circular right by 1, shift
        int temp = arr[n - 1];
        for (int i = n - 1; i > 0; i--) {
           arr[i] = arr[i - 1];
        }
        arr[0] = temp;
        System.out.println();
        System.out.print("After Circular shift: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}