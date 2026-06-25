package LAB3.SetA;

import java.util.Scanner;

public class Parallel_Arrays_Subjects_and_Marks {
    //Parallel Arrays — Subject and Marks
    //
    //Read n subject names and their marks. Find the subject with the highest mark and the subject with the lowest mark. Print both.
    //
    //Sample:
    //Input: Math 85, Physics 72, CSE 91, English 68
    //Output:
    //Highest: CSE - 91
    //Lowest: English - 68
    //(Twist: parallel arrays like her student problem, but finding both extremes)

    public static int findHighestMarks(int[] marks) {
        int highestIndex = 0;
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] > marks[highestIndex]) highestIndex = i;
        }
        return highestIndex;
    }

    public static int findLowestMarks(int[] marks) {
        int lowestIndex = 0;
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] < marks[lowestIndex]) lowestIndex = i;
        }
        return lowestIndex;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        String[] subjects = new String[n];
        int[] marks = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter subject name: ");
            subjects[i] = scanner.nextLine();

            System.out.print("Enter marks for " + subjects[i] + ": ");
            marks[i] = scanner.nextInt();
            scanner.nextLine();
        }

        int highestIndex = findHighestMarks(marks);
        int lowestIndex = findLowestMarks(marks);

        System.out.println("Highest: " + subjects[highestIndex] + " - " + marks[highestIndex]);
        System.out.println("Lowest: " + subjects[lowestIndex] + " - " + marks[lowestIndex]);
        scanner.close();

    }
}