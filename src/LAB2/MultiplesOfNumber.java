package LAB2; //Loop Manipulation

import java.util.Scanner;

public class MultiplesOfNumber {
    //01. Write a Java program that uses a for loop to print multiples of a number

    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        System.out.println("Multiples of number " + number + " is, ");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + number * i);
        }
    }
}
