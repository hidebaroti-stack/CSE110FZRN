package LAB3.SetB;

import java.util.Scanner;

public class LowerTriangleSum {
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
        System.out.print("Lower triangle elements: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j < i) {
                    sum += arr[i][j];
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
        System.out.println();
        System.out.print("Lower triangle sum = " + sum);
    }
}
