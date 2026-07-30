package QUIZ_2;

import java.sql.SQLOutput;

public abstract class Shape {
    abstract double area();

    void describe() {
        System.out.println("This is a shape.");
    }
}
class Circle extends Shape {
    double radius;

    Circle (double radius) { this.radius = radius; }

    @Override
    double area() {
        return Math.PI * Math.pow(radius, 2);
    }
    @Override
    void describe() {
        System.out.println("This is a Circle.");
    }
}
class ShapeMain {
    public static void main(String[] args) {
        Shape c = new Circle(2);

        c.describe();
        System.out.println("Area: " + c.area());
    }
}