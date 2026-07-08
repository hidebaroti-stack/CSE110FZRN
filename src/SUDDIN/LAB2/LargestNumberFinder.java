package SUDDIN.LAB2;

/* Problem 1: Finding the Largest of Three Numbers Using Classes and Objects Objective:
Design a Java program that determines the largest of three numbers using object-oriented programming principles.
Requirements:
1. Create a NumberComparator class with the following:
   ○ Private fields to store three integer numbers (a, b, c).
   ○ A method findLargest() that:
       ■ Uses if-else statements to determine the largest number among a, b, and c.
       ■ Returns the largest number.
2. Create a LargestNumberFinder class that contains the main method:
   ○ Take user input for three numbers.
   ○ Instantiate a NumberComparator object.
   ○ Call the findLargest() method and print the result.
Example Input/Output: java Copy code Enter three numbers: 15 42 30   The largest number is: 42   */

import java.util.Scanner;

class NumberComparator {
    private int a, b, c;

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int findLargest() {
        int largest = a;
        if (b > largest) largest = b;
        if (c > largest) largest = c;

        return largest;
    }
}

public class LargestNumberFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the three numbers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        NumberComparator nc = new NumberComparator();

        nc.setA(a);
        nc.setB(b);
        nc.setC(c);

        System.out.println("Largest number:" + nc.findLargest());
    }
}