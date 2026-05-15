package LAB2;

import java.util.Scanner;

public class ReverseNumber {
    /* 03: Write a Java program that prompts the user to enter a positive integer, then uses a do-while loop to reverse the digits of the number.
    Finally, display the reversed number.
    Enter a number:1234
    Reverse of a number:4321 */
    static void main() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a positive integer: ");
        int integer = scanner.nextInt();

        int reverse = 0;
        int digit;

        do {
            digit = integer % 10;
            reverse = (reverse * 10) + digit;
            integer /= 10;
        }
        while (integer != 0);

        System.out.println("Reverse number: " + reverse);
    }
}
