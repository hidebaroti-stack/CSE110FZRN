package LAB1.PracticeSet5;

import java.util.Scanner;

public class Max {
    //Write a method findMax(int a, int b, int c) that returns the largest of three numbers without using Math.max. Call it from main.
    public static int findMax(int a, int b, int c) {
        int largest = a;
        if (b > largest) largest = b;
        if (c > largest) largest = c;

        return largest;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a, b, c: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        System.out.println("Largest: " + findMax(a, b, c));
    }
}