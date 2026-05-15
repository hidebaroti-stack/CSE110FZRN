import java.util.Scanner;

public class LabProblem10 {
    /*10: Write a Java program that prompts the user to enter the center (p,q) and the radius (r) of a circle.
    Then, prompts user to enter a point (x, y) and checks whether the point is within the circle centered at (p, q) with radius r.*/
    static void main() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of a circle: ");
        int radius = scanner.nextInt();

        System.out.print("Enter the centre(x,y) of a circle: ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        System.out.print("Enter a point(p,q) of the circle: ");
        int p = scanner.nextInt();
        int q = scanner.nextInt();

        double distance = Math.sqrt(Math.pow((x-p), 2) + Math.pow((y-q), 2));

        if (distance > radius) System.out.println("Point is outside the circle.");
        else if (distance < radius) System.out.println("Point is within the circle.");
        else System.out.println("Point is on the circle.");
    }
}
