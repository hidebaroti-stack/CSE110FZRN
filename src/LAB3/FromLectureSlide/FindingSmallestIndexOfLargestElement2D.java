package LAB3.FromLectureSlide;

import java.util.Scanner;

public class FindingSmallestIndexOfLargestElement2D {
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
        int largest = Integer.MIN_VALUE;
        int smallestIndexRow = -1;
        int smallestIndexCol = -1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] > largest) {
                    largest = arr[i][j];
                    smallestIndexRow = i;
                    smallestIndexCol = j;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == largest) {
                    System.out.println("largest " + largest + " in the positions of " + i +", " + j);
                }
            }
        }
        System.out.println("So, the Smallest Index of Largest Element is: " + smallestIndexRow +"," + smallestIndexCol);
    }
}