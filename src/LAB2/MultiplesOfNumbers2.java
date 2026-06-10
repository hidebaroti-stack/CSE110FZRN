package LAB2;

import java.util.Scanner;

public class MultiplesOfNumbers2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int PER_LINE = 5;
        int value, limit, multiple, count = 0;

        System.out.print("Enter a positive value: ");
        value = scanner.nextInt();

        System.out.print("Enter the upper limit: ");
        limit = scanner.nextInt();

        System.out.println();

        System.out.println("The multiples of " + value + " between " + value + " and " + limit + " (inclusive) are: ");

        for (multiple = value; multiple <= limit; multiple += value) {
            System.out.print(multiple + "\t");
            count++;
            if (count % PER_LINE == 0) {
                System.out.println();
            }
        }
    }
}