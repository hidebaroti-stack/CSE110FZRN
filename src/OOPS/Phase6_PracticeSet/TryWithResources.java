package OOPS.Phase6_PracticeSet;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryWithResources {
    public static void main(String[] args) {

        // Try-With-Resources
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Enter the first number: ");
            int a = scanner.nextInt();
            System.out.println("Enter the second number: ");
            int b = scanner.nextInt();

            int result = a / b;
            System.out.println("Result: " + result);

            // Multi-Catch
        } catch (InputMismatchException | ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}