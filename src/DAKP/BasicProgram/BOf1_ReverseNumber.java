package DAKP.BasicProgram;

import java.util.Scanner;

public class BOf1_ReverseNumber {
    // b. Write a complete Java program that reads a number and prints the reverse of the number.
    // For example, if the input is 3245, the output will be 5423.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        int reverse = 0;
        while(number != 0) {
            reverse = reverse * 10 + (number % 10);
            number /= 10;
        }
        System.out.println("Reverse number: " + reverse);
    }
}