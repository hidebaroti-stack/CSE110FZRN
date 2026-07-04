package DAKP.AbstractClassAndInterface;

import java.util.Date;

abstract class GeometricObject {
    private String color;
    private boolean isFilled;
    private Date dateCreated = new Date();

    public Date getDateCreated() {
        return dateCreated;
    }

    GeometricObject(String color, boolean isFilled) {
        this.color = color;
        this.isFilled = isFilled;
    }

    abstract void printArea();
}
class Rectangle extends GeometricObject {
    private double height;
    private double width;

    Rectangle(String color, boolean isFilled, double height, double width) {
        super(color, isFilled);
        this.height = height;
        this.width = width;
    }
    @Override
    void printArea() {
        double area = height * width;
        System.out.println("Area of Rectangle: " + area);
    }

}
class Triangle extends GeometricObject {
    private double base;
    private double height;

    Triangle(String color, boolean isFilled, double base, double height) {
        super(color, isFilled);
        this.base = base;
        this.height = height;
    }
    @Override
    void printArea() {
        double area = 0.5 * base * height;
        System.out.println("Area of Triangle: " + area);
    }
}
class Circle extends GeometricObject {
    private double radius;

    Circle(String color, boolean isFilled, double radius) {
        super(color, isFilled);
        this.radius = radius;
    }
    @Override
    void printArea() {
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("Area of Circle: " + String.format("%.2f", area));
    }
}

class GeometricObjectMain {
    public static void main(String[] args) {

        GeometricObject[] obj = {
                new Rectangle("Yellow", true, 4, 6 ),
                new Triangle("Blue", false,2, 4),
                new Circle("Red", true, 2.5)
        };

        for (GeometricObject o : obj) {
            o.printArea();
            System.out.println("Date created: " + o.getDateCreated());
        }
    }
}