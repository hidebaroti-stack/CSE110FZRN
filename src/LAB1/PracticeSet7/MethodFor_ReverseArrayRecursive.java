package LAB1.PracticeSet7;

import java.util.Scanner;

public class MethodFor_ReverseArrayRecursive {
    public static int[] reverse(int[] arr, int index) {
        // Base case when index reaches length, return new array
        if (index == arr.length) return new int[arr.length];
        // Recursive call
        int[] reversed = reverse(arr, index + 1);
        // Place current element in reversed position
        reversed[arr.length - 1 - index] = arr[index];
        return reversed;
    }
    /* *----------------------------------------DRY RUN---------------------------------
     * For the line,
     * reversed[arr.length - 1 - index] = arr[index];
     * Let arr.length = 5
     *
     * For index = 0:
     * reversed[5 - 1 - 0] = arr[0];
     * reversed[4] = arr[0];
     *
     * For index = 1:
     * reversed[5 - 1 - 1] = arr[1];
     * reversed[3] = arr[1];
     *
     * For index = 2:
     * reversed[5 - 1 - 2] = arr[2];
     * reversed[2] = arr[2];
     *
     * For index = 3:
     * reversed[5 - 1 - 3] = arr[3];
     * reversed[1] = arr[3];
     *
     * For index = 4:
     * reversed[5 - 1 - 4] = arr[4];
     * reversed[0] = arr[4];
     *
     * Final mapping:
     * arr[0] → reversed[4]
     * arr[1] → reversed[3]
     * arr[2] → reversed[2]
     * arr[3] → reversed[1]
     * arr[4] → reversed[0]
     * ------------------------------------------------------------------------------------
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Input array size
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        //Input array elements
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        //Print array elements
        System.out.print("Original array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int[] reversed = reverse(arr, 0);
        System.out.print("Reversed array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(reversed[i] + " ");
        }
    }
}