package LAB4;

import java.util.Scanner;

public class RectangleP3 {

    /* Problem 3:Write a program which has two classes.
    First class is Rectangle which has two private variable height and width and three functions get_height, get_width, and set_value.
    Another class is Area. Which has a function calc_area which takes an object of Rectangle as input, calculate area and return the value.
    Print the area in main function. Height and width will be given by user in main function.*/

    //Private Variable
    private int height;
    private int width;

    public int get_height() {
        return height;
    }
    public int get_width() {
        return width;
    }

    public void set_value(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input Height: ");
        int userInputHeight = scanner.nextInt();

        System.out.print("Input Width: ");
        int userInputWidth = scanner.nextInt();

        //Create Rectangle object and set values
        RectangleP3 rectangle = new RectangleP3();
        rectangle.set_value(userInputHeight, userInputWidth);

        //Create Area object and calculate
        Area areaObject = new Area();
        int result = areaObject.cal_area(rectangle);

        System.out.print("Area: " + result);


    }
}