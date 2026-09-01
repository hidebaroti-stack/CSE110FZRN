package SUDDIN.LAB3;

import java.util.ArrayList;
import java.util.Scanner;

public class ClassroomPerformanceReport {
    /*Scenario Teacher stores fixed student roll numbers but marks can vary per subject.
    Tasks1. Store roll numbers using array.
         2. Store marks using ArrayList.
         3. Display student roll and marks together.
         4. Find class average.*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();

        //Fixed roll numbers
        int[] roll = new int[n];

        System.out.println("Enter the roll numbers: ");
        for (int i = 0; i < n; i++) {
            roll[i] = scanner.nextInt();
        }

        // Marks for each student stored in ArrayList
        ArrayList<ArrayList<Integer>> marksList = new ArrayList<>();

        // Input marks
        for (int i = 0; i < n; i++) {
            System.out.print("Enter number of subjects for roll " + roll[i] + ": ");
            int subjects = scanner.nextInt();

            ArrayList<Integer> marks = new ArrayList<>();
            System.out.println("Enter marks for " + subjects + " subjects:");
            for (int j = 0; j < subjects; j++) {
                marks.add(scanner.nextInt());
            }
            marksList.add(marks);
        }

        // Display roll + marks
        System.out.println("\n--- Student Performance Report ---");
        double totalSum = 0;
        int totalCount = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Roll " + roll[i] + " -> Marks: ");
            int studentSum = 0;
            for (int mark : marksList.get(i)) {
                System.out.println(mark + " ");
                studentSum += mark;
                totalSum += mark;
                totalCount++;
            }
            double studentAverage = (double) studentSum / marksList.get(i).size();
            System.out.printf(" | Average: %.2f%n", studentAverage);
        }

        // Class average
        double classAverage = totalSum / totalCount;
        System.out.printf("\nClass Average: %.2f%n", classAverage);
        scanner.close();
    }
}