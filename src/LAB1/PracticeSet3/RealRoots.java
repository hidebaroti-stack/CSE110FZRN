package LAB1.PracticeSet3;

import java.util.Scanner;

public class RealRoots {
    //Write a program that prompts the user to enter a, b, c for a quadratic equation
    // and determines how many real roots exist — but instead of printing the roots, only print:
    //
    //"Two real roots exist"
    //"Exactly one real root exists"
    //"No real roots exist"
    //
    //Based purely on the discriminant b² - 4ac.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a, b, c for a quadratic equation: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        double discriminant = Math.pow(b, 2) - 4 * a * c;

        if (discriminant > 0) System.out.println("Two real roots exist.");
        else if (discriminant == 0) System.out.println("Exactly one root exists.");
        else System.out.println("No real roots exists.");
    }
}