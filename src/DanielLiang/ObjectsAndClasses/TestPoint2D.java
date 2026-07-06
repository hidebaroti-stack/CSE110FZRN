package DanielLiang.ObjectsAndClasses;

import javafx.geometry.Point2D;
import java.util.Scanner;

public class TestPoint2D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter point1's (x,y) coordinates: ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();

        System.out.print("Enter point2's (x,y) coordinates: ");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        Point2D p1 = new Point2D(x1, y1);
        Point2D p2 = new Point2D(x2, y2);

        System.out.println("P1 is, " + p1.toString());
        System.out.println("P2 is, " + p2.toString());
        System.out.println("Distance between, " + String.format("%.2f", p1.distance(p2)));
    }
}