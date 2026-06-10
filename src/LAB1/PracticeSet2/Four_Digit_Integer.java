package LAB1.PracticeSet2;

import java.util.Scanner;

public class Four_Digit_Integer {
    /* P7. Write a program that reads a 4-digit integer and prints the sum of its digits.
     Sample: input 1234 → output 10 (Hint: use / and % to extract each digit)*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int digit, sum = 0;

        System.out.print("Enter a 4-digit integer: ");
        int number = scanner.nextInt();

        int originalNumber = number;

        while (number != 0) {
            digit = number % 10;
            sum += digit;
            number /= 10;
        }
        if (originalNumber < 1000 || originalNumber > 9999) System.out.println("Please, enter a 4-digit number.");
        else System.out.println("Sum of its digits: " + sum);
    }
}
