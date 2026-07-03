package LAB3.SetB;

import java.util.Scanner;

public class SaddlePoint_alt {
    //Read an n×m matrix. Find the saddle point — the element that is the maximum in its row but the minimum in its column. Print it with its position, or print "No saddle point" if none exists.
    //
    //Sample:
    //Matrix:
    //1 2 3
    //4 5 6
    //7 8 9
    //Saddle point: 7 at (2, 0)
    //(Twist: two-condition search — hardest in Set B, BUET-level)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the row: ");
        int n = scanner.nextInt();
        System.out.print("Enter the column: ");
        int m = scanner.nextInt();

        int[][] arr = new int[n][m];
        System.out.print("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) arr[i][j] = scanner.nextInt();
        }

        System.out.println("Matrix: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        boolean found = false;
        for (int i = 0; i < m; i++) {
            int maxCol = Integer.MIN_VALUE;
            int rowIndex = 0;
            for (int j = 0; j < n; j++) {
                if (arr[j][i] > maxCol) {
                    maxCol = arr[j][i];
                    rowIndex = j;
                }
            }
            boolean isSaddle = true;
            for (int k = 0; k < m; k++) {
                if (arr[rowIndex][k] < maxCol) {
                    isSaddle = false;
                    break;
                }
            }
            if (isSaddle) {
                System.out.println("Saddle point: " + maxCol + " at " + "(" + rowIndex + "," + i + ")");
                found = true;
            }
        }
        if (!found) System.out.println("No Saddle Point.");
    }
}