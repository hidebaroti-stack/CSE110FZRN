package LAB1.PracticeSet1;

import java.util.Scanner;

public class CelsiusToFahrenheit {
    /* P1. Write a program that prompts the user to enter a temperature in Celsius and converts it to Fahrenheit using the formula:
       Fahrenheit = (9.0 / 5) * Celsius + 32 */

    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Celsius: ");
        double Celsius = scanner.nextDouble();

        double Fahrenheit = (9.0 / 5) * Celsius + 32;

        System.out.printf("Fahrenheit: %.2f", Fahrenheit);
        scanner.close();
    }
}
