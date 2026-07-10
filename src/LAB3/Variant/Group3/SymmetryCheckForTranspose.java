package LAB3.Variant.Group3;

import java.util.Scanner;

public class SymmetryCheckForTranspose {
    private static void printMatrix(int[][] arr) {
        for (int[] row : arr) {
            for (int col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
    // Symmetric Matrix Definition:
    // A matrix is symmetric if A = A^T
    // That means every element satisfies:
    // arr[i][j] = arr[j][i]
    public static boolean isSymmetric(int[][] arr, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i][j] != arr[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the square matrix (n): ");
        int n = scanner.nextInt();

        int[][] arr = new int[n][n];

        System.out.print("Enter the elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Original Matrix:");
        printMatrix(arr);

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        System.out.println("\nTranspose (in-place):");
        printMatrix(arr);

        if (isSymmetric(arr, n)) {
            System.out.println("\nThe Matrix is symmetric.");
        } else {
            System.out.println("\nThe matrix is not symmetric.");
        }
    }
}