package LAB3;

import java.util.Scanner;

public class ArrayOfMax2D {
    /* 06: Write a Java program that will take inputs of m x n sized matrix into a 2D array and
    find the maximum element with index location from that matrix. */
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the rows of the array: ");
        int n = scanner.nextInt();
        System.out.print("Enter the column of the array: ");
        int m = scanner.nextInt();

        int[][] arr = new int[n][m];

        System.out.print("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m ; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        System.out.println("The 2D Matrix: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m ; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        int max = arr[0][0];
        int maxRow = 0, maxColumn = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                    maxRow = i;
                    maxColumn = j;
                }
            }
        }
        System.out.println("The max element in 2D Matrix: " + max + " at index (" + maxRow + ", " + maxColumn + ")" );
    }
}
