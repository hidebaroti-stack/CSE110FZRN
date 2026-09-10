package LAB3.SetC;

import java.util.Scanner;

public class GradeWithGPA {
    //C1. Grade with GPA
    //Read n student scores (0–100). Assign letter grade using standard scale:
    //90–100 → A  (GPA 4.0)
    //80–89  → B  (GPA 3.0)
    //70–79  → C  (GPA 2.0)
    //60–69  → D  (GPA 1.0)
    //below  → F  (GPA 0.0)
    //Print each student's score, grade, and GPA. Then print class average GPA.
    //(Twist: adds GPA calculation on top of grading — like her grades problem extended)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();

        int[] scores = new int[n];
        double[] gpas = new double[n];
        String[] grades = new String[n];

        // Input scores
        for (int i = 0; i < n; i++) {
            System.out.print("Enter score for student " + (i + 1) + ": ");
            scores[i] = scanner.nextInt();

            // Assign grade and GPA
            if (scores[i] >= 90) {
                grades[i] = "A";
                gpas[i] = 4.0;
            } else if (scores[i] >= 80) {
                grades[i] = "B";
                gpas[i] = 3.0;
            } else if (scores[i] >= 70) {
                grades[i] = "C";
                gpas[i] = 2.0;
            } else if (scores[i] >= 60) {
                grades[i] = "D";
                gpas[i] = 1.0;
            } else {
                grades[i] = "F";
                gpas[i] = 0.0;
            }
        }
        // Print each student's result
        System.out.println("\n --- Student Results ---");
        for (int i = 0; i < n; i++) {
            System.out.println("Score: " + scores[i] +
                               " | Grade: " + grades[i] +
                               " | GPA: " + gpas[i]);
        }

        // Calculate class avergae GPA
        double sum = 0;
        for (double gpa : gpas) sum += gpa;
        double avgGPA = sum / n;

        System.out.printf("\nClass Average GPA: %.2f\n", avgGPA);

    }

}