package LAB7.Problems;

import java.util.Scanner;

public class ArithmeticExceptionExample {
    //1. Write a Java program that takes two integers as input and divides the first number by the second number.
    //Handle the division by zero exception and display an appropriate error message.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int x = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int y = scanner.nextInt();

        try {
           int result = x / y;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Division by zero. " + e);
        }
    }
}