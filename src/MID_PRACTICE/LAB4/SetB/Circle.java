package MID_PRACTICE.LAB4.SetB;

import java.util.Scanner;

public class Circle {
    private double radius;

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
}

class Geometry {
    double calculateCircumference(Circle c) {
        return 2 * Math.PI * c.getRadius();
    }
}

class CircleMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius: ");
        double radius = scanner.nextDouble();

        Circle circle = new Circle();
        circle.setRadius(radius);

        Geometry object = new Geometry();
        System.out.println("The circumference: " + String.format("%.4f", object.calculateCircumference(circle)));
    }
}