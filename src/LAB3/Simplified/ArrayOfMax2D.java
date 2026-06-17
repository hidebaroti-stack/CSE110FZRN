package LAB3.Simplified;

import java.util.Scanner;

public class ArrayOfMax2D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Input row of the matrix
        System.out.print("Enter the row of the matrix: ");
        int n = scanner.nextInt();
        // Input column of the matrix
        System.out.print("Enter the column of the matrix: ");
        int m = scanner.nextInt();
        // Create 2D array
        int[][] arr = new int[n][m];
        // Input the elements of the matrix
        System.out.print("Enter the elements in the matrix: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        // Display the matrix
        System.out.println("The matrix: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        // Find the maximum element in the matrix with index
        int max = Integer.MIN_VALUE;
        int maxIndexRow = 0;
        int maxIndexColumn = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                    maxIndexRow = i;
                    maxIndexColumn = j;
                }
            }
        }
        // Display the maximum element with index
        System.out.print("The maximum element " + max + " with index location from that matrix is at: " + "{"+ maxIndexRow + ", " + maxIndexColumn + "}.");
        scanner.close();
    }
}