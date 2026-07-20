package OOPS.Phase6_PracticeSet;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

// Custom exception hierarchy
class RegistryException extends Exception {
    RegistryException(String message) {
        super(message);
    }
}
class DuplicateStudentException extends RegistryException {
    DuplicateStudentException(String message) {
        super(message);
    }
}
class InvalidGradeException extends RegistryException {
    InvalidGradeException(String message) {
        super(message);
    }
}

public class StudentRegistry {
    private static ArrayList<String> students = new ArrayList<>();

    // Add student
    static void addStudent(String name) throws DuplicateStudentException {
        if (students.contains(name)) {
            throw new DuplicateStudentException("Duplicate found!");
        }
        students.add(name);
        System.out.println("Student added: " + name);
    }

    // Add grade
    static void addGrade(String name, int grade) throws InvalidGradeException {
        if (grade < 0 || grade > 100) {
            throw new InvalidGradeException("Grade should be between 0 to 100.");
        }
        System.out.println("Grade: " + grade + " recorded for " + name);
    }

    public static void main(String[] args) {
        // Outer try, for try-with-resources
        try (Scanner scanner = new Scanner(System.in)) {
            // Inner try, multi-catch
            try {
                // Case 1: Valid student and grade
                addStudent("Debaroti");
                addGrade("Debaroti", 95);

                // Case 2: Duplicate student
                addStudent("Debaroti");

                // Case 3: Invalid grade
                addGrade("Debaroti", 200);

            } catch (DuplicateStudentException e) {
                System.out.println("Duplicate Error: " + e.getMessage());
            } catch (InvalidGradeException e) {
                System.out.println("Grade Error: " + e.getMessage());
            } catch (RegistryException e) {
                System.out.println("General Registry Error: " + e.getMessage());
            } catch (InputMismatchException e) {
                System.out.println("Input Error: Please enter a valid integer.");
            }
        }
    }
}