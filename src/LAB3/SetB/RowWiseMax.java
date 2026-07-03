package LAB3.SetB;

import java.util.Scanner;

public class RowWiseMax {
    //Read an n×m matrix. For each row, find and print the maximum element and its column index.
    //
    //Sample:
    //Matrix:
    //3 7 2
    //8 1 5
    //4 6 9
    //
    //Output:
    //Row 0: Max = 7 at Column 1
    //Row 1: Max = 8 at Column 0
    //Row 2: Max = 9 at Column 2
    //(Twist: max per row, not overall — nested loop with per-row reset)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter row: ");
        int n = scanner.nextInt();

        System.out.print("Enter column: ");
        int m = scanner.nextInt();

        int[][] arr = new int[n][m];

        System.out.print("Enter the array elements: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Matrix: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            int maxInRow = arr[i][0];
            int columnIndex = 0;
            for (int j = 1; j < m; j++) {
                if (arr[i][j] > maxInRow) {
                    maxInRow = arr[i][j];
                    columnIndex = j;
                }
            }
            System.out.println("Row " + i + ": Max = " + maxInRow + " at Column " + columnIndex);
        }
    }
}