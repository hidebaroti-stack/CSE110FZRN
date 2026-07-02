package LAB6;

public interface Shape {
    abstract void draw();
    abstract double area();
    abstract double perimeter();
}
class Rectangle implements Shape {
    private double height, width;
    Rectangle(double height, double width) {this.height = height; this.width = width; }

    @Override
    public void draw() {
        System.out.println("Rectangle has been drawn.");
    }
    @Override
    public double area() {
        return height * width;
    }
    @Override
    public double perimeter() {
        return 2 * (height + width);
    }
}
class Circle implements Shape {
    private double radius;
    Circle(double radius) {this.radius = radius;}

    @Override
    public void draw() {
        System.out.println("Circle has been drawn.");
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double perimeter() {
        return 2 *  Math.PI * radius;
    }
}
class ShapeMain {
    public static void main(String[] args) {
        Shape r = new Rectangle(4, 5);
        r.draw();
        System.out.println("Area: " + r.area());
        System.out.println("Perimeter: " + r.perimeter());

        Shape c = new Circle(2);
        c.draw();
        System.out.println("Area: " + c.area());
        System.out.println("Perimeter: " + c.perimeter());
    }
}