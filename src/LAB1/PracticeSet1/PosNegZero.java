package LAB1.PracticeSet1;

import java.util.Scanner;

public class PosNegZero {
    /* P3. Write a program that reads an integer and prints whether it is positive, negative, or zero. */
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an Integer: ");
        int integer = scanner.nextInt();

        System.out.println((integer == 0) ? "Zero." : (integer > 0) ? "Positive." : "Negative.");
        scanner.close();
    }
}