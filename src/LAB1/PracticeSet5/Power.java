package LAB1.PracticeSet5;

import java.util.Scanner;

public class Power {
    // Write a method power(int base, int exp) that calculates base^exp without using Math.pow — using a loop instead. Return the result.
    public static int power(int base, int exp) {
        int result = 1;
        for (int i = 1; i <= exp; i++) {
            result *= base;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the base: ");
        int base = scanner.nextInt();
        System.out.print("Enter the exponent: ");
        int exponent = scanner.nextInt();

        System.out.print("Base^exponent is: " + power(base, exponent));
    }
}
