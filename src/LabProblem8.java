import java.util.Scanner;

public class LabProblem8 {
    //08: Write a Java program that reads three numbers, calculates the discriminant, and prints whether the equation has two roots, one root, or no real roots.
    static void main() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input a: ");
        double a = scanner.nextDouble();

        System.out.print("Input b: ");
        double b = scanner.nextDouble();

        System.out.print("Input c: ");
        double c = scanner.nextDouble();

        double discriminant = Math.pow(b, 2)- 4 * a * c; //discriminant of the quadratic equation

        if (discriminant > 0) { //When discriminant is positive
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Two roots," + " Root 1: " + root1 + " Root 2: " + root2);
        } else if (discriminant == 0) { //When discriminant is zero
            double root = -b / (2 * a);
            System.out.println("One root," + " Root: " + root);
        } else { //When discriminant is negative
            System.out.println("The equation has no real roots.");
        }
    }
}