package LAB4.Simplified;

import java.util.Scanner;

public class Rectangle_Class1 {
    private double height, width;

    public double get_height() {
        return height;
    }

    public double get_width() {
        return width;
    }

    public void set_value(double height, double width) {
        this.height = height;
        this.width = width;
    }
}

class Area_Class2 {
    public double calc_area(Rectangle_Class1 rectangle) {
        return rectangle.get_height()  *  rectangle.get_width();
    }
}

class RectangleAreaMain{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the height: ");
        double height = scanner.nextDouble();
        System.out.print("Enter the width: ");
        double width = scanner.nextDouble();

        Rectangle_Class1 rectangle = new Rectangle_Class1();
        rectangle.set_value(height, width);

        Area_Class2 area = new Area_Class2();
        System.out.print("Area of a rectangle: " + area.calc_area(rectangle));
    }
}