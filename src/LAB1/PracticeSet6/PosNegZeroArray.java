package LAB1.PracticeSet6;

import java.util.Scanner;

public class PosNegZeroArray {
    //Write a program that reads an array of n integers and counts how many are positive, negative, and zero.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the array elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.print("Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        int countPositive = 0;
        int countNegative = 0;
        int countZero = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                countPositive++;
            } else if (arr[i] < 0) {
                countNegative++;
            } else {
                countZero++;
            }
        }
        System.out.println();
        System.out.print("Positives are: " + countPositive);
        System.out.println();
        System.out.print("Negatives are: "  + countNegative);
        System.out.println();
        System.out.print("Zeros are: " + countZero);
    }
}