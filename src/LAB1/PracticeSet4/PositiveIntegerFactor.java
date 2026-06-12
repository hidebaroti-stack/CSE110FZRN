package LAB1.PracticeSet4;

import java.util.Scanner;

public class PositiveIntegerFactor {
    //Write a program that reads a positive integer and prints all of its factors.
    //Sample: input 12 → output 1, 2, 3, 4, 6, 12
    //(Hint: loop from 1 to n, check divisibility)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter a positive integer: ");
        int integer = scanner.nextInt();

        for (int i = 1; i <= integer; i++) {
            if (integer % i == 0) System.out.print((i == integer) ? (i + " ") : (i + ", "));
        }
    }
}
