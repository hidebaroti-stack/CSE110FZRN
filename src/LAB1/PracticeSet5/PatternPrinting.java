package LAB1.PracticeSet5;

import java.util.Scanner;

public class PatternPrinting {
    //Write a method printPattern(int n) that prints a right-angled triangle of stars with n rows.
    public static void printPattern(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int n = scanner.nextInt();

        printPattern(n);
    }
}