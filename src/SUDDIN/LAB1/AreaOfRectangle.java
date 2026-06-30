package SUDDIN.LAB1;

public class AreaOfRectangle {
    //2. Area of a Rectangle
    //Story:
    //A farmer has a rectangular field. The length is 25 meters and width is 12 meters.
    //Task:
    //Write a Java program to calculate the area of the field.
    //Formula:
    //Area = length × width
    public static void main(String[] args) {

        final double length = 25;
        System.out.println("Length: " + length + " meters");

        final double width = 12;
        System.out.println("Width: " + width + " meters");

        double area = length * width;
        System.out.println("Area = " + area);
    }
}