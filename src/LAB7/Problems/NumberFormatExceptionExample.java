package LAB7.Problems;

import java.util.Scanner;

public class NumberFormatExceptionExample {
    //3. Write a Java program that takes a string as input and tries to parse it into an integer.
    // Handle the number format exception and display an appropriate error message.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = scanner.next();

        try {
            int integer = Integer.parseInt(str);
            System.out.println("Parsed integer: " + integer);
        } catch (NumberFormatException e) {
            System.out.println("String cannot be parsed into integer! " + e.getMessage());
        }
    }
}