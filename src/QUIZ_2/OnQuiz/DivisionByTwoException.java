package QUIZ_2.OnQuiz;

import java.util.Scanner;

public class DivisionByTwoException extends Exception {
    DivisionByTwoException(String str) {
        super(str);
    }
}
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter the first number: ");
            int num1 = scanner.nextInt();

            System.out.print("Enter the second number: ");
            int num2 = scanner.nextInt();

            if (num2 == 2) throw new DivisionByTwoException("Division by two is not allowed!");
            int result = num1 / num2;
            System.out.println("Division Result: " + result);

        } catch (DivisionByTwoException e) {
            System.out.println("Custom exception: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception: Division By Zero!");
        }
    }
}