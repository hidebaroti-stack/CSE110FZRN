package LAB1.PracticeSet3;

import java.util.Scanner;

public class Palindrome_3DigitInteger {
    //Write a program that reads a 3-digit integer and checks if it is a palindrome — meaning it reads the same forwards and backwards.
    //Sample: 121 → Palindrome, 123 → Not a palindrome
    //(Hint: extract hundreds digit, units digit, compare them)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a 3-digit integer: ");
        int integer = scanner.nextInt();

        if (integer < 100 || integer > 999) {
            System.out.print("Please enter a 3-digit integer.");
        } else {
            int originalNumber = integer;
            int digit, reverse = 0;

            while (integer != 0) {
                digit = integer % 10;
                reverse = reverse * 10 + digit;
                integer /= 10;
            }
            if (originalNumber == reverse) System.out.print("Palindrome.");
            else System.out.print("Not a Palindrome.");
        }
    }
}