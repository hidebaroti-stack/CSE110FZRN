package LAB3.Variant.Group3;

import java.util.Scanner;

public class Transpose {
    //E11. Read an m×n matrix. Print it in transpose form (rows become columns).
    //Input:          Output:
    //1 2 3           1 4
    //4 5 6           2 5
    //                3 6
    //(Uses 2D array logic — same tools as Q06/Q07)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the row numbers: ");
        int n = scanner.nextInt();

        System.out.print("Enter the column numbers: ");
        int m = scanner.nextInt();

        int[][] transpose = new int[n][m];

        System.out.print("Enter the array elements: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                transpose[i][j] = scanner.nextInt();
            }
        }

        System.out.println("The Matrix: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("The Transpose Matrix: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(transpose[j][i] + " ");
            }
            System.out.println();
        }
    }
}