package SUDDIN.LAB2;


/* Problem 3: Student Grading System
Create a Java program that calculates a student’s final grade using object-oriented programming.

Requirements:
1. Define a Student class with the following:
   ○ Private fields to store marks for:
        - Quiz (out of 20)
        - Midterm (out of 30)
        - Assignment (out of 20)
        - Final Exam (out of 30)
   ○ A constructor to initialize these fields.
   ○ A method calculateTotalMarks() that computes the total marks out of 100.
   ○ A method getGrade() that determines the final grade based on the total marks:
        - Marks ≥ 90 → "A"
        - Marks ≥ 80 → "B"
        - Marks ≥ 70 → "C"
        - Marks ≥ 60 → "D"
        - Marks < 60 → "F"

2. Implement a main class where:
   ○ User input is taken for quiz, midterm, assignment, and final exam marks.
   ○ A Student object is created with the entered marks.
   ○ The program calls calculateTotalMarks() and getGrade() to display the final result.

Example Input/Output:
Enter Quiz Marks (out of 20): 13
Enter Midterm Marks (out of 30): 25
Enter Assignment Marks (out of 20): 15
Enter Final Exam Marks (out of 30): 27

Total Marks: 80
Grade: B
 */

import java.util.Scanner;

class Student {
    private int quiz;
    private int midterm;
    private int assignment;
    private int finalExam;

    Student(int quiz, int midterm, int assignment, int finalExam) {
        this.quiz = quiz;
        this.midterm = midterm;
        this.assignment = assignment;
        this.finalExam = finalExam;
    }

    public int calculateTotalMarks() {
        return quiz + midterm + assignment + finalExam;
    }

    public String getGrade() {
        if (calculateTotalMarks() >= 90) return "A";
        else if (calculateTotalMarks() >= 80) return "B";
        else if (calculateTotalMarks() >= 70) return "C";
        else if (calculateTotalMarks() >= 60) return "D";
        else return "F";
    }
}

public class StudentGradingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Quiz Marks(out of 20): ");
        int quiz = scanner.nextInt();

        System.out.print("Enter Midterm Marks(out of 30): ");
        int mid = scanner.nextInt();

        System.out.print("Enter Assignment Marks(out of 20): ");
        int assignment = scanner.nextInt();

        System.out.print("Enter Final exam Marks(out of 30): ");
        int finals = scanner.nextInt();


        Student students = new Student(quiz, mid, assignment, finals);

        System.out.println("Total Marks: " + students.calculateTotalMarks());
        System.out.println("Grade: " + students.getGrade());
    }
}