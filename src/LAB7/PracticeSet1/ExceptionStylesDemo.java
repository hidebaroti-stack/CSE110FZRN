package LAB7.PracticeSet1;

import java.util.Scanner;

public class ExceptionStylesDemo {

    // Style 1: Nested try-catch
    static void nestedTryCatch(Scanner scanner) {
        try {
            System.out.print("Enter the first number: ");
            int num1 = Integer.parseInt(scanner.next());
            System.out.print("Enter the second number: ");
            int num2 = Integer.parseInt(scanner.next());

            try {
                int result = num1 / num2;
                System.out.print("Result(nested): " + result);
            } catch (ArithmeticException e) {
                System.out.println("division by zero (nested). " + e.getMessage());
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input (nested). " + e.getMessage());
        }
    }

    // Style 2: Multiple catch clauses
    static void multipleCatch(Scanner scanner) {
        try {
            System.out.print("Enter first number: ");
            int num1 = Integer.parseInt(scanner.next());
            System.out.print("Enter second number: ");
            int num2 = Integer.parseInt(scanner.next());

            int result = num1 / num2;
            System.out.println("Result (multiple): " + result);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input (multiple). " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Division by zero (multiple). " + e.getMessage());
        }
    }

    // Style 3: Multi-catch
    static void multiCatch(Scanner scanner) {
        try {
            System.out.print("Enter first number: ");
            int num1 = Integer.parseInt(scanner.next());
            System.out.print("Enter second number: ");
            int num2 = Integer.parseInt(scanner.next());

            int result = num1 / num2;
            System.out.println("Result (multi-catch): " + result);
        } catch (NumberFormatException | ArithmeticException e) {
            System.out.println("Error (multi-catch). " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n--- Style 1: Nested try-catch ---");
        nestedTryCatch(scanner);

        System.out.println("\n--- Style 2: Multiple catch clauses ---");
        multipleCatch(scanner);

        System.out.println("\n--- Style 3: Multi-catch ---");
        multiCatch(scanner);
    }
}