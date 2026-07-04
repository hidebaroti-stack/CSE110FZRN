package DAKP.InheritanceAndPolymorphism;

import java.util.Date;

public class GeometricObject {
    private String color;
    private boolean isFilled;
    private Date dateCreated = new Date();

    public Date getDateCreated() {
        return dateCreated;
    }

    protected GeometricObject(String color, boolean isFilled) {
        this.color = color;
        this.isFilled = isFilled;
    }
    public double getArea() {
        return 0;
    }

    public double getPerimeter() {
        return 0;
    }
}

class Circle extends GeometricObject {
    private double radius;

    protected Circle(String color, boolean isFilled, double radius) {
        super(color, isFilled);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}

class Rectangle extends GeometricObject {
    private double height;
    private double width;

    protected Rectangle(String color, boolean isFilled, double height, double width) {
        super(color, isFilled);
        this.height = height;
        this.width = width;
    }

    @Override
    public double getArea() {
        return height * width;
    }

    @Override
    public double getPerimeter() {
        return 2 * (height + width);
    }
}

class TestGeomatricObject {
    public static void main(String[] args) {
        GeometricObject geoObj1 = new Circle("Yellow", true, 2.5);
        System.out.println("Date created: " + geoObj1.getDateCreated());
        System.out.println("Area of Circle: "+ geoObj1.getArea());
        System.out.println("Perimeter of Circle: " + geoObj1.getPerimeter());

        System.out.println("====================================================");

        GeometricObject geoObj2 = new Rectangle("Blue", false, 4.6, 6.6);
        System.out.println("Date created: " + geoObj2.getDateCreated());
        System.out.println("Area of Rectangle: " + geoObj2.getArea());
        System.out.println("Perimeter of Rectangle: " + geoObj2.getPerimeter());

    }
}