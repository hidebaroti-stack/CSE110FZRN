package LAB7.PracticeSet1;

import java.util.Scanner;

public class NumberFormatAndArithmeticNested {
    /**
     * Problem 1 — The hidden trick
     * Write a program that takes two numbers and divides them. But this time take both inputs as String and convert them to integers before dividing.
     * Handle both NumberFormatException and ArithmeticException.
     *
     * Trick: two different exceptions possible from two different sources
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the first number: ");
            int num1 = Integer.parseInt(scanner.next());
            System.out.print("Enter the second number: ");
            int num2 = Integer.parseInt(scanner.next());

            try {
                int result = num1 / num2;
                System.out.println("Result: " + result);
            } catch (ArithmeticException e) {
                System.out.println("Division by Zero!" + e.getMessage());
            }
        } catch (NumberFormatException e) {
            System.out.println("Strings cannot be parsed into Integer." + e.getMessage());
        }
    }
}