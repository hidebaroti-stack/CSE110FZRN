package LAB3.FromLectureSlide;

import java.util.Scanner;

public class RaggedArrayUserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Ask for rows
        System.out.print("Enter the  number of rows: ");
        int n = scanner.nextInt();
        // Declare ragged array
        int[][] raggedArray = new int[n][];
        // For each rows ask for its columns
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the number of column for each row " + i + ": ");
            int m = scanner.nextInt();
            raggedArray[i] = new int[m];

            System.out.print("Enter columns " + m + " elements for row " + i + ": ");
            for (int j = 0; j < m; j++) {
                raggedArray[i][j] = scanner.nextInt();
            }
        }
        // Print ragged array
        System.out.println("\nRagged Array: ");
        for (int i = 0; i < raggedArray.length; i++) {
            for (int j = 0; j < raggedArray[i].length; j++) {
                System.out.print(raggedArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}