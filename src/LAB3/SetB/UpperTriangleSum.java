package LAB3.SetB;

import java.util.Scanner;

public class UpperTriangleSum {
    //Read an n×n matrix. Find the sum of all elements above the primary diagonal (where j > i).
    //
    //Sample:
    //Matrix:
    //1 2 3
    //4 5 6
    //7 8 9
    //Upper triangle sum: 11  (2+3+6)
    //(Twist: extends her diagonal logic — condition j > i instead of i == j)
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

        int sum = 0;
        System.out.print("Upper triangle elements: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j > i) {
                    sum += arr[i][j];
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
        System.out.println();
        System.out.print("Upper triangle sum = " + sum);
    }
}