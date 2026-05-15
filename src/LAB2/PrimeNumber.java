package LAB2;

import java.util.Scanner;

public class PrimeNumber {
    //05: Write a Java program that will determine whether a number is prime or not.
    static void main() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number <= 1) {
            System.out.println("Neither Prime nor Composite.");
            return;
        }

        boolean isPrime = true;

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) System.out.println(number + " is a Prime Number.");
        else System.out.println(number + " is Composite number.");

    }
}