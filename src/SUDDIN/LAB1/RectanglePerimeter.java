package SUDDIN.LAB1;

public class RectanglePerimeter {
    //8. Rectangle Perimeter
    //Story:
    //A garden has length 40 meters and width 20 meters.
    //Task:
    //Write a Java program to calculate the perimeter.
    //Formula:
    //Perimeter = 2 × (length + width)
    public static void main(String[] args) {
        final double length =  40;
        final double width =  20;

        System.out.println("Length: " + length + " meters");
        System.out.println("Width: " + width + " meters");

        double Perimeter = 2 * (length + width);
        System.out.println("Perimeter: " + Perimeter);
    }
}