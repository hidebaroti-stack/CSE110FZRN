package LAB3.SetB;

import java.util.Scanner;

public class MatrixRowSumAndColumnSum {
    //Read an n×m matrix. Print the sum of each row and the sum of each column separately.
    //
    //Sample:
    //Matrix:
    //1 2 3
    //4 5 6
    //
    //Row sums:    6  15
    //Column sums: 5  7  9
    //(Twist: two separate summation directions — good 2D loop practice)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of the row: ");
        int n = scanner.nextInt();

        System.out.print("Enter the number of the column: ");
        int m = scanner.nextInt();

        int[][] arr = new int[n][m];

        System.out.print("Enter the array elements: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        System.out.println("The Matrix: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.print("Row sums: ");
        for (int i = 0; i < n; i++) {
            int sumRow = 0;
            for (int j = 0; j < m; j++) {
                sumRow += arr[i][j];
            }
            System.out.print(sumRow + " ");
        }
        System.out.print("\nColumn sums: ");
        for (int j = 0; j < m; j++) {
            int sumColumn = 0;
            for (int i = 0; i < n; i++) {
                sumColumn += arr[i][j];
            }
            System.out.print(sumColumn + " ");
        }
    }
}