package LAB3.SetB;

import java.util.Scanner;

public class DiagonalBoundaryElements_Simple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = scanner.nextInt();

        int[][] arr = new int[n][n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Border:");

        // Top row
        for (int j = 0; j < n; j++) System.out.print(arr[0][j] + " ");
        // Right column (excluding first row)
        for (int i = 1; i < n; i++) System.out.print(arr[i][n - 1] + " ");
        // Bottom row (excluding last column)
        for (int j = n - 2; j >= 0; j--) System.out.print(arr[n - 1][j] + " ");
        // Left column (excluding first and last row)
        for (int i = n - 2; i > 0; i--) System.out.print(arr[i][0] + " ");
    }
}
