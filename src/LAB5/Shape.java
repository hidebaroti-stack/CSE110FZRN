package LAB5;

public class Shape {
    String name;
    double height;
    double width;

    Shape(String name, double height, double width) {
        this.name = name;
        this.height = height;
        this.width = width;
    }

    double area() {
        return height * width;
    }
}

class Rectangle extends Shape {
    double length;
    double breadth;

    Rectangle (String name, double length, double breadth) {
        super(name, length, breadth); // sets height = length, width = breadth
        this.length = length;
        this.breadth = breadth;
    }
    double area() {
        return length * breadth;
    }
}
class Circle extends Shape {
    double radius;

    Circle (String name, double radius) {
        super(name, radius, radius);
        this.radius = radius;
    }

    double area() {
        return Math.PI * radius * radius;
    }
}

class ShapeMain {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle("Rectangle", 4, 6);
        Circle circle = new Circle("Circle", 2);

        System.out.println(rectangle.name + "'s Area: " + rectangle.area());
        System.out.println(circle.name + "'s Area: " + String.format("%.2f", circle.area()));

    }
}