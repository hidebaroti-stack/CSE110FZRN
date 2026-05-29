package LAB4;

public class Area {

    /* Problem 3:Write a program which has two classes.
    First class is Rectangle which has two private variable height and width and three functions get_height, get_width, and set_value.
    Another class is Area. Which has a function calc_area which takes an object of Rectangle as input, calculate area and return the value.
    Print the area in main function. Height and width will be given by user in main function.*/

    public int cal_area(RectangleP3 rectangle) {

        int area;
        area = rectangle.get_height() * rectangle.get_width();
        return area;
    }

}
