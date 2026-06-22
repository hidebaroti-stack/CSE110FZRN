package OOPS.Phase2_PracticeSet;
// Base class demonstrating Encapsulation
public class Shape {
    private String color; //Encapsulation: private field

    //Parameterized constructor
    public Shape(String color) {
        this.color = color; //'this' keyword refers to the color of field
    }
    //Getter to have access to the private field
    public String getColor() {
        return color;
    }
    // Default implementation of area
    public double area() {
        return 0.0;
    }
    // Polymorphic display method
    public void display() {
        System.out.printf("Color: %s, Area: %.2f%n",  getColor(), area());
    }
}

// Inheritance: Circle inherits from Shape by 'extends'
class Circle extends Shape {
    private double radius;

    public Circle(String color, double radius) {
        super(color); // Constructor chaining
        this.radius = radius;
    }
    @Override
    public double area() { // Overriding
        return Math.PI * Math.pow(radius, 2);
    }
}
// Inheritance: rectangle inherits from Shape by 'extends'
class Rectangle extends Shape {
    private double length;
    private double width;

    Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }
    @Override
    public double area() {
        return length * width;
    }
}
// Main class to demonstrate Polymorphism
class ShapeMain {
    public static void main(String[] args) {
        //Polymorphism: storing Circle and Rectangle objects in Shape reference
        Shape s1 = new Circle("Red", 5.0);
        Shape s2 = new Rectangle("Blue", 4.0, 6.0);

        s1.display(); // calls Circle's area()
        s2.display(); // calls Rectangle's area()
    }
}