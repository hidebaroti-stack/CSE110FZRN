package LAB1;

import java.util.Scanner;
public class LabProblem1 {
    //01: Write a program to compute the area of a circle and use the final keyword to specify the value of PI.
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Radius of a Circle: ");
        int radius = scanner.nextInt();

        final float PI = 3.1416F; //Constant using "final" keyword

        double area = PI * radius * radius;

        System.out.printf("Area Of a Circle: %.2f%n",area);

    }
}