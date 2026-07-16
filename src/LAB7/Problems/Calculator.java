package LAB7.Problems;

import java.util.Scanner;

public class Calculator {
    int x;
    int y;

    Calculator(int x, int y){
        this.x = x;
        this.y = y;
    }

    int Add() {
        if (x < 0 || y < 0) {
            throw new ArithmeticException("Addition not allowed with negative numbers!");
        }
        return x + y;
    }
    int Subtract() {
        if (x < 0 || y < 0) {
            throw new ArithmeticException("Subtraction not allowed with negative numbers!");
        }
        return x - y;
    }
    int Multiply() {
        if (x == 0 || y == 0) {
            throw new ArithmeticException("Multiplication not allowed with zero!");
        }
        return x * y;
    }
    int Division() {
        if (x == 0 || y == 0) {
            throw new ArithmeticException("Division not allowed with zero!");
        }
        return x / y;
    }
}

class CalculatorMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter first number: ");
            int x = Integer.parseInt(scanner.next());
            System.out.print("Enter the second number: ");
            int y = Integer.parseInt(scanner.next());

            Calculator obj1 = new Calculator(x, y);
            Calculator obj2 = new Calculator(x, y);
            Calculator obj3 = new Calculator(x, y);
            Calculator obj4 = new Calculator(x, y);

            try {
                System.out.println("Addition: " + obj1.Add());
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            }
            try {
                System.out.println("Subtraction: " + obj2.Subtract());
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            }
            try {
                System.out.println("Multiplication: " + obj3.Multiply());
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            }
            try {
                System.out.println("Division: " + obj4.Division());
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            }

        } catch (NumberFormatException e) {
            System.out.println("Invalid input! Please enter integers only.");
        }
    }
}