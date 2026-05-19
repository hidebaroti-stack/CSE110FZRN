package LAB1;

import java.util.Scanner;

public class LabProblem6 {
    /* 06: Write a program that reads an integer from the console and determines whether the given number is divisible by either 2 or 3 (but not both).
     Then the program should print TRUE, otherwise, the program should print FALSE. */
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input an integer: ");
        int integer = scanner.nextInt();

        if ((integer % 2 == 0) ^ (integer % 3 == 0)) System.out.println("TRUE"); //X-OR
        else System.out.println("FALSE");
    }
}
