package OOPS.Phase1_PracticeSet;

import java.util.Scanner;

public class Rectangle {
    // ---------------------------------
    // Fields (Private for Encapsulation)
    // ----------------------------------
    private double length;
    private double width;
    // ------------------------------------------------------
    // Parameterized Constructor
    // Initializes the rectangle with given length and width
    // ------------------------------------------------------
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    // ----------------------------------
    // Getters ( to access private fields)
    // ----------------------------------
    public double getLength() {
        return length;
    }
    public double getWidth() {
        return width;
    }
    // -----------------------------------------
    // Instance Methods
    // area() returns length x width
    // perimeter() returns 2 x (length + width)
    // -----------------------------------------
    public double area() {
        return length * width;
    }
    public double perimeter() {
        return 2 * (length + width);
    }
    // ------------------------------------------
    // Main Method (program entry point)
    // -------------------------------------------
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for Rectangle 1
        System.out.print("Enter the length1: ");
        double length1 = scanner.nextDouble();
        System.out.print("Enter the width1: ");
        double width1 = scanner.nextDouble();
        // Create Rectangle 1 object
        Rectangle rectangle1 = new Rectangle(length1, width1);
        System.out.println("Rectangle 1, Area: " + rectangle1.area() + " Perimeter: " + rectangle1.perimeter());
        System.out.println(); //Blank line for readability
        // Input for Rectangle 2
        System.out.print("Enter the length2: ");
        double length2 = scanner.nextDouble();
        System.out.print("Enter the width2: ");
        double width2 = scanner.nextDouble();

        // Create Rectangle 2 object
        Rectangle rectangle2 = new Rectangle(length2, width2);
        System.out.println("Rectangle 2, Area: " + rectangle2.area() + " Perimeter: " + rectangle2.perimeter());
        scanner.close();
    }
}