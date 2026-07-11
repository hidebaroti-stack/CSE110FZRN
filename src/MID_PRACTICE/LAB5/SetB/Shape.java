package MID_PRACTICE.LAB5.SetB;

public class Shape {
    protected String shapeName;

    Shape(String shapeName) {
        this.shapeName = shapeName;
    }

    double area() {
        return 0;
    }

    void printArea() {
        System.out.println(shapeName + " area: " + this.area());
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    Rectangle(String shapeName, double length, double width) {
        super(shapeName);
        this.length =  length;
        this.width = width;
    }

    @Override
    double area() {
        return length * width;
    }
}

class Circle extends Shape {
    private double radius;

    Circle(String shapeName, double radius) {
        super(shapeName);
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

class TestShapes {
    public static void main(String[] args) {
        Shape r = new Rectangle("Rectangle", 4, 6);
        r.printArea(); // calls Shape.printArea(), but executes Rectangle.area()

        Shape c = new Circle("Circle", 4);
        c.printArea(); // calls Shape.printArea(), but executes Circle.area()
    }
}