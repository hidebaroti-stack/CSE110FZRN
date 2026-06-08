package LAB1.PracticeSet1;

import java.util.Scanner;

public class MultiplicationTable {
    /* P5. Write a program that reads an integer and prints its multiplication table from 1 to 10.
    Sample output for input 5:*/

    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an Integer: ");
        int integer = scanner.nextInt();

        System.out.println("Multiplication table of " + integer + " is, ");
        for (int i = 1; i <= 10; i++) {
            System.out.println(integer + " x " +  i + " = " + integer * i);
        }
        scanner.close();
    }
}
