package LAB3;

import java.util.Scanner;

public class ArrayOfSecDiagonalSum {
    /* 07: Write a Java program that will take (m x n) integer inputs into a matrix of dimension m x n. 
    Now just simply add second diagonal in that matrix and show the result. */
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Row of the Matrix: ");
        int n = scanner.nextInt();
        System.out.print("Enter the Column of the Matrix: ");
        int m = scanner.nextInt();
        
        int[][] arr = new int[n][m];

        System.out.print("Enter the elements of the Matrix: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        System.out.println("The 2D Matrix: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i == j) sum += arr[i][j];
            }
        }
        System.out.println("Sum of the second diagonal: " + sum);
    }
}
