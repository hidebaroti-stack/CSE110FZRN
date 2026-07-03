package LAB3.SetB;

import java.util.Scanner;

public class DiagonalBoundaryElements {
    //Read an n×n square matrix. Print all elements that lie on the border of the matrix (first row, last row, first column, last column).
    //
    //Sample:
    //Matrix:
    //1 2 3
    //4 5 6
    //7 8 9
    //Border: 1 2 3 6 9 8 7 4
    //(Twist: border traversal — requires careful index conditions)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the nxn matrix: ");
        int n = scanner.nextInt();

        int[][] arr = new int[n][n];

        System.out.print("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) arr[i][j] = scanner.nextInt();
        }

        System.out.println("Matrix: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        int top = 0;        // starting row
        int bottom = n - 1; // ending row
        int left = 0;       // starting column
        int right = n - 1;  // ending column

        System.out.println("Border: ");
        // Loop until boundaries cross
        while (top <= bottom && left <= right) {
            // Step 1: traverse left -> right across the top row
            for (int j = left; j <= right; j++) {
                System.out.print(arr[top][j] + " ");
            }
            top++; // move top boundary down
            // Step 2: traverse top -> bottom down the right column
            for (int i = top; i <= bottom; i++) {
                System.out.print(arr[i][right] + " ");
            }
            right--; // move right boundary left
            // Step 3: traverse right -> left across the bottom row
            if (top <= bottom) {
                for (int j = right; j >= left; j--) {
                    System.out.print(arr[bottom][j] + " ");
                }
                bottom--;
            }
            // Step 4: traverse bottom -> top up the left column
            if (left <= right) {
                for (int i = bottom; i >= top; i++) {
                    System.out.print(arr[i][left] + " ");
                }
                left++; // move left boundary right
            }
        }
    }
}