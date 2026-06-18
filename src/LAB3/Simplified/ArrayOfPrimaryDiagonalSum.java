package LAB3.Simplified;

import java.util.Scanner;

public class ArrayOfPrimaryDiagonalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Input the size of the square matrix
        System.out.print("Enter the size of the square matrix: ");
        int n = scanner.nextInt();
        // Create the square matrix
        int[][] arr = new int[n][n];
        // Input the elements of the square matrix
        System.out.print("Enter the elements of the matrix: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        // Display the matrix
        System.out.println("The matrix: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        // Sum of the primary diagonal
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) sum += arr[i][j];
            }
        }
        // Display the sum of the primary diagonal
        System.out.print("Sum of the primary diagonal: " + sum);
        scanner.close();
    }
}