import java.util.Scanner;

public class LabProblem4 {
    //04: Write a program that converts a Fahrenheit degree to Celsius using the formula: Celsius = (5.0 / 9) * (Fahrenheit – 32)
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Fahrenheit Degree: ");
        int Fahrenheit = scanner.nextInt();

        double Celsius = (5.0 / 9) * (Fahrenheit - 32);

        System.out.printf("Celsius Degree: %.2f ", Celsius);
    }
}
