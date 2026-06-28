package OOPS.Phase4_PracticeSet;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter the numbers: ");
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();

            int result = num1 / num2;
            System.out.println("Result: " + result);

        } catch (InputMismatchException e) {
            System.out.println("Non-Integer Input!");
        } catch (ArithmeticException e) {
            System.out.println("Division by Zero!");
        } finally {
            scanner.close();
        }
    }
}