package LAB2;

import java.util.Scanner;

public class PalindromeNumber {
    //04: Write a Java program that prompts the user to enter a number and displays whether the number is a palindrome or not.
    static void main() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int integer = scanner.nextInt();

        int reverse = 0;
        int digit;
        int originalNumber = integer;

        while (integer != 0) {
            digit = integer % 10;
            reverse = (reverse * 10) + digit;
            integer /= 10;
        }

        if (originalNumber == reverse) System.out.println("Palindrome Number.");
        else System.out.println("Not a Palindrome Number.");

    }

}
