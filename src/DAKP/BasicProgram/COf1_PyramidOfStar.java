package DAKP.BasicProgram;

import java.util.Scanner;

public class COf1_PyramidOfStar {
    // c. Write a complete Java program that print the pyramid of * given the input as a number of lines.
    // For example if the input is 5, the output will be
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the rows: ");
        int n = scanner.nextInt();

        // Outer loop: for lines
        for (int i = 1; i <= n; i++) {
            // Inner loop 1: for printing spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Inner loop 2: for printing stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}