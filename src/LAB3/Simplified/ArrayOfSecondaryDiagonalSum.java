package LAB3.Simplified;

import java.util.Scanner;

public class ArrayOfSecondaryDiagonalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Input the size of the square matrix
        System.out.print("Enter the size of the square matrix: ");
        int n = scanner.nextInt();
        // Create the int type square matrix
        int[][] arr = new int[n][n];
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
        // Sum of the secondary diagonal
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i + j == n - 1) sum += arr[i][j];
            }
        }
        // Display the sum of the secondary diagonal
        System.out.print("Sum of the secondary diagonal: " + sum);
        scanner.close();
    }
}
