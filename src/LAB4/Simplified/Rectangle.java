package LAB4.Simplified;

import java.util.Scanner;

public class Rectangle {
    double length, breadth;
    // 1 - having no parameter - values of both length and breadth are assigned zero.
    Rectangle() {
        this.length = 0;
        this.breadth = 0;
    }
    // 2 - having two numbers as parameters - the two numbers are assigned as length and breadth respectively.
    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    // 3 - having one number as a parameter - both length and breadth are assigned that number.
    Rectangle(double length) {
        this.length = length;
        this.breadth = length;
    }
    // a method to calculate the area which is 'length*breadth'
    public double area() {
        return length * breadth;
    }
}

class RectangleMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length: ");
        double length = scanner.nextDouble();
        System.out.print("Enter the breadth: ");
        double breadth = scanner.nextDouble();

        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(length, breadth);
        Rectangle r3 = new Rectangle(length);

        System.out.println("Area (no parameters): " + r1.area());
        System.out.println("Area (two parameters): " + r2.area());
        System.out.println("Area (one parameters): " + r3.area());
    }
}