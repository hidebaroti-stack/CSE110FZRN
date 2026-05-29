package LAB4;

public class Rectangle {

    /* Problem 2:
    Create a class named 'Rectangle' with two data members- length and breadth and a method to calculate the area which is 'length*breadth'.
    The class has three constructors which are :
    1 - having no parameter - values of both length and breadth are assigned zero.
    2 - having two numbers as parameters - the two numbers are assigned as length and breadth respectively.
    3 - having one number as a parameter - both length and breadth are assigned that number.
    Now, create objects of the 'Rectangle' class having none, one and two parameters and print their areas.*/

    //Data members
    int length;
    int breadth;

    //Method
    public int calculateArea() {
        return length*breadth;
    }
    //Constructor
    public Rectangle() {
        length  = 0;
        breadth = 0;
    }
    //Constructor(Two Parameters)
    public Rectangle(int length,int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    //Constructor(One Parameters)
    public Rectangle(int n) {
        this.length = n;
        this.breadth = n;
    }

    public static void main(String[] args) {

        Rectangle c1 = new Rectangle();
        System.out.println("When Length: " + c1.length + " and breadth: " + c1.breadth  + " Area(No Parameters): " + c1.calculateArea());

        Rectangle c2 = new Rectangle(4, 5);
        System.out.println("When Length: " + c2.length + " and breadth: " + c2.breadth  + " Area(Two Parameters): " + c2.calculateArea());

        Rectangle c3 = new Rectangle(5);
        System.out.println("When Length: " + c3.length + " and breadth: " + c3.breadth  + " Area(One Parameters): " + c3.calculateArea());

    }
}
