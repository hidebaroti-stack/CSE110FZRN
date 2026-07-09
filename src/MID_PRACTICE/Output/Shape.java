package MID_PRACTICE.Output;

public class Shape {
    double area() { return 0; }
}
class Circle extends Shape {
    double r;
    Circle(double r) { this.r = r; }
    @Override
    double area() { return Math.PI * r * r; }
}
class Rectangle extends Shape {
    double l, w;
    Rectangle(double l, double w) { this.l = l; this.w = w; }
    @Override
    double area() { return l * w; }
}
class ShapeMain {
    public static void main(String[] args) {
        Shape[] shapes = {new Circle(3), new Rectangle(4, 5)};
        for (Shape s : shapes) {
            System.out.println(s.area());
        }
    }
}