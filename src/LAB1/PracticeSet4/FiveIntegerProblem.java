package LAB1.PracticeSet4;

import java.util.Scanner;

public class FiveIntegerProblem {
    //Write a program that reads 5 integers one by one and prints:
    //
    //The largest
    //The smallest
    //The sum
    //The average (formatted to 2 decimal places)
    //
    //(No arrays — just variables and if-else
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter 5 integer: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int e = scanner.nextInt();

        int sum = a + b + c + d + e;
        double average = (double) sum / 5;

        int largest = a;
        int smallest = a;

        //for largest
        if (b > largest) largest = b;
        if (c > largest) largest = c;
        if (d > largest) largest = d;
        if (e > largest) largest = e;

        //for smallest
        if (b < smallest) smallest = b;
        if (c < smallest) smallest = c;
        if (d < smallest) smallest = d;
        if (e < smallest) smallest = e;

        System.out.print("The largest: " + largest);
        System.out.println();
        System.out.print("The smallest: " + smallest);
        System.out.println();
        System.out.print("Sum: " + sum);
        System.out.println();
        System.out.printf("Average: %.2f", average);
    }
}