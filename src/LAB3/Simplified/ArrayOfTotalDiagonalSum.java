package LAB3.Simplified;

import java.util.Scanner;

public class ArrayOfTotalDiagonalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Input the size of the square matrix
        System.out.print("Enter the size of the square matrix: ");
        int n = scanner.nextInt();
        // Create the int type square matrix
        int[][] arr = new int[n][n];
        // Inout the elements of the square matrix
        System.out.print("Enter the elements of the matrix: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        // Display the square matrix
        System.out.println("The matrix: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        // Find the total sum
        int sumPrimary = 0;
        int sumSecondary = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) sumPrimary += arr[i][j];
                if (i + j == n - 1) sumSecondary += arr[i][j];
            }
        }
        // To subtract the same element
        int sumTotal = (sumPrimary + sumSecondary);
        if (n % 2 == 1) sumTotal -= arr[n/2][n/2];
        // Display the total sum
        System.out.print("Sum of the total diagonal: " + sumTotal);
        scanner.close();
    }
}