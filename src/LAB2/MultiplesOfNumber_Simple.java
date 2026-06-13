package LAB2;

import java.util.Scanner;

public class MultiplesOfNumber_Simple {
    //01. Write a Java program that uses a for loop to print multiples of a number
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        int limit = scanner.nextInt();
        System.out.println("Multiples of " + value + " between " + value + " and " + limit + " (inclusive) are: ");
        for (int multiple = value; multiple <= limit; multiple += value) {
            System.out.print(multiple + " ");
        }
    }
}