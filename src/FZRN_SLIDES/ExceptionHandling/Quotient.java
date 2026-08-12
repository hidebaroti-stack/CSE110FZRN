package FZRN_SLIDES.ExceptionHandling;

import java.util.Scanner;

public class Quotient {
    public static int quotient(int num1, int num2) {
        if (num2 == 0) throw new ArithmeticException("Division cannot be zero.");
        return num1 / num2;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the two integer: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        try {
            int result = quotient(num1, num2);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Division by zero!");
        }
        System.out.println("Execution continues...");
    }
}