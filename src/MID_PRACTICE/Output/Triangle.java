package MID_PRACTICE.Output;

abstract class Shapes {
    String name;
    Shapes(String name) {
        this.name = name;
        System.out.println("Shape: " + name);
    }
    abstract double area();
    void display() {
        System.out.println("Area = " + area());
    }
}
public class Triangle extends Shapes {
    double base, height;
    Triangle(double base, double height) {
        super("Triangle");
        this.base = base;
        this.height = height;
    }
    @Override
    double area() {
        return 0.5 * base * height;
    }
}
class TriangleMain {
    public static void main(String[] args) {
        Shapes t = new Triangle(6, 4);
        t.display();
    }
}