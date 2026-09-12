package SUDDIN.LAB3;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentAttendanceTracker {
    /*Scenario Teacher records attendance for students present in class.
    Tasks1. Store present student names using ArrayList.
    2. Allow teacher to:
           o Add student name
           o Remove absent student
           o Display total present students */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> presentStudents = new ArrayList<>();

        int choice;
        do {
            System.out.println("\n=== Student Attendance Tracker ===");
            System.out.println("1. Add Student (Present)");
            System.out.println("2. Remove Student (Absent)");
            System.out.println("3. Display Total Present Students");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    String student = scanner.nextLine();
                    presentStudents.add(student);
                    System.out.println("'" + student + "' marked present.");
                    break;
                case 2:
                    System.out.print("Enter student name to remove: ");
                    String removeStudent = scanner.nextLine();
                    if (presentStudents.remove(removeStudent)) {
                        System.out.println("'" + removeStudent + "' marked absent.");
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;
                case 3:
                    System.out.println("\n--- Present Students ---");
                    if (presentStudents.isEmpty()) {
                        System.out.println("[No students present]");
                    } else {
                        for (String s : presentStudents) {
                            System.out.println("- " + s);
                        }
                    }
                    System.out.println("Total present: " + presentStudents.size());
                    break;
                case 4:
                    System.out.println("Exiting Attendance Tracker...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 4);

        scanner.close();
    }
}