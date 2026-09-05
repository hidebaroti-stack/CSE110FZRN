package DAKP.AbstractClassAndInterface;

import java.util.Arrays;

// Abstract superclass
abstract class GeometryObject {
    public abstract double getArea();
    public abstract double getPerimeter();
}

// Rectangle subclass
class Rectangles extends GeometryObject {
    protected double width;
    protected double height;

    public Rectangles(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public String toString() {
        return "Rectangle [width=" + width + ", height=" + height + ", area=" + getArea() + "]";
    }
}

// ComparableRectangle subclass
class ComparableRectangle extends Rectangles implements Comparable<ComparableRectangle> {
    public ComparableRectangle(double width, double height) {
        super(width, height);
    }

    @Override
    public int compareTo(ComparableRectangle o) {
        // Compare by area
        if (this.getArea() > o.getArea()) return 1;
        else if (this.getArea() > o.getArea()) return -1;
        else return 0;
    }
}
public class ComparableRectangleMain {
    public static void main(String[] args) {
        ComparableRectangle[] rectangles = {
                new ComparableRectangle(4, 5),
                new ComparableRectangle(2, 6),
                new ComparableRectangle(3, 3),
                new ComparableRectangle(5, 5)
        };

        System.out.println("Before sorting: ");
        for (ComparableRectangle r : rectangles) {
            System.out.println(r);
        }

        Arrays.sort(rectangles);

        System.out.println("\nAfter sorting by area: ");
        for (ComparableRectangle r : rectangles) {
            System.out.println(r);
        }
    }
}