package LAB3.FromLectureSlide;

import java.util.Scanner;

public class SummingAllElementsByRow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the rows: ");
        int n = scanner.nextInt();
        System.out.print("Enter the columns: ");
        int m = scanner.nextInt();

        int[][] arr = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < m; j++) {
                sum += arr[i][j];
            }
            System.out.println("Sum of row " + i + " = " + sum);
        }
    }
}
