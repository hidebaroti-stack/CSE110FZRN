package DAKP.ObjectsAndClasses;

public class Rectangle {
    private double width = 1;
    private double height = 1;

    public double setHeight() {
        return height;
    }
    public double setWidth() {
        return width;
    }

    Rectangle() {
    }

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }
}

class TestRectangle {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(4, 40);
        Rectangle r2 = new Rectangle(3.5, 35.9);

        System.out.println("Rectangle 1: width = " + r1.setWidth() +
                ", height = " + r1.setHeight() +
                ", area = " + String.format("%.2f", r1.getArea()) +
                ", perimeter = " + String.format("%.2f",r1.getPerimeter()));

        System.out.println("Rectangle 2: width = " + r2.setWidth() +
                ", height = " + r2.setHeight() +
                ", area = " + String.format("%.2f", r2.getArea()) +
                ", perimeter = " + String.format("%.2f", r2.getPerimeter()));
    }
}