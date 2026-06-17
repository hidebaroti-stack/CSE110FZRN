package LAB3.Simplified;

import java.util.Scanner;

public class ArrayOfGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Input the number of students
        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();
        int[] marks = new int[n];
        // Input the numbers
        System.out.print("Enter " + n + " scores: ");
        for (int i = 0; i < marks.length; i++) marks[i] = scanner.nextInt();
        // Get the Best score
        int best = marks[0];
        for (int mark : marks) if (mark > best) best = mark;
        // Display grades
        for (int i = 0; i < marks.length; i++) {
            char grade = (marks[i] >= best - 10) ? 'A' :
                         (marks[i] >= best - 20) ? 'B' :
                         (marks[i] >= best - 30) ? 'C' :
                         (marks[i] >= best - 40) ? 'D': 'F';
            System.out.println("Student " + (i+1) + " score is " + marks[i] + " and grade is " + grade);
        }
        scanner.close();
    }
}