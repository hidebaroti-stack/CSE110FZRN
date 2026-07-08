package SUDDIN.LAB3;

import java.util.Scanner;

public class StudentMarksAnalyzer {
    /*Scenario A teacher wants to analyze marks of 10 students in a class.
    Tasks 1. Create an array to store marks of 10 students.
    2. Take input from user.
    3. Calculate:
      o Highest mark
      o Lowest mark
      o Average mark
    4. Count how many students scored above average */
    public static int highestMark(int[] marks) {
        int highest = Integer.MIN_VALUE;
        for (int mark : marks) {
            if (mark > highest) highest = mark;
        }
        return highest;
    }
    public static int lowestMark(int[] marks) {
        int lowest = Integer.MAX_VALUE;
        for (int mark : marks) {
            if (mark < lowest) lowest = mark;
        }
        return lowest;
    }
    public static double averageMark(int[] marks) {
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        return (double) sum / marks.length;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] marks = new int[10];

        System.out.print("Enter marks: ");
        for (int i = 0; i < marks.length; i++) {
            marks[i] = scanner.nextInt();
        }
        System.out.println("Highest Mark: " + highestMark(marks));
        System.out.println("Lowest Mark: " + lowestMark(marks));
        System.out.println("Average Mark: " + averageMark(marks));

        int count = 0;
        for (int mark : marks) {
            if (mark > averageMark(marks)) {
                count++;
            }
        }
        System.out.println("Students scored above average: " + count);
    }
}