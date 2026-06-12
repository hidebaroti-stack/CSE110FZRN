package LAB1.PracticeSet5;

import java.util.Scanner;

public class FahrenheitCelsius {
    //Write two methods:
    //
    //celsiusToFahrenheit(double c) — converts and returns result
    //fahrenheitToCelsius(double f) — converts and returns result
    //In main, ask user which conversion they want, take input, call the right method, print result.
    public static double celsiusToFahrenheit(double c) {
        return (9.0 / 5) * c + 32;
    }
    public static double fahrenheitToCelsius(double f) {
        return (5.0 / 9) * (f - 32);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter 'F' to convert Celsius→Fahrenheit, 'C' to convert Fahrenheit→Celsius: ");
        char choice = scanner.next().toUpperCase().charAt(0);

        switch (choice){
            case 'F':
                System.out.print("Enter Celsius: ");
                double c = scanner.nextDouble();
                System.out.println("For Fahrenheit Conversion: " + celsiusToFahrenheit(c));
                break;
            case 'C':
                System.out.print("Enter Fahrenheit: ");
                double f = scanner.nextDouble();
                System.out.println("For Celsius Conversion: " + fahrenheitToCelsius(f));
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }
}