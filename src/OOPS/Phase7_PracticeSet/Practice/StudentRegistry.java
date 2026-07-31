package OOPS.Phase7_PracticeSet.Practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

// Base exception
class RegistryException extends Exception {
    RegistryException(String message) {
        super(message);
    }
}

// Duplicate student exception
class DuplicateStudentException extends RegistryException {
    DuplicateStudentException(String message) {
        super(message);
    }
}


public class StudentRegistry {
    private static final String FILE_NAME = "students.txt";
    private ArrayList<String> students;

    StudentRegistry() {
        students = loadStudents();
    }

    // Load existing students from file
    private ArrayList<String> loadStudents() {
        ArrayList<String> list = new ArrayList<>();
        File file = new File(FILE_NAME);

        if (!file.exists()) {
            System.out.println("No registry found.");
            return list;
        }

        try (Scanner reader = new Scanner(file)) {
            while (reader.hasNextLine()) {
                list.add(reader.nextLine());
            }
            System.out.println("Loaded " + list.size() + " students from registry.");
        } catch (FileNotFoundException e) {
            System.out.println("Error loading registry: " + e.getMessage());
        }
        return list;
    }

    // Add student with duplicate check
    void addStudent(String name) throws DuplicateStudentException {
        if (students.contains(name)) {
            throw new DuplicateStudentException("Duplicate student: " + name);
        }
        students.add(name);
        System.out.println("Added student: " + name);
    }

    // View all students
    void viewAll() {
        if (students.isEmpty()) {
            System.out.println("No students in registry.");
        } else {
            System.out.println("=== Student Registry ===");
            for (String s : students) {
                System.out.println(s);
            }
        }
    }

    // Save students back to file
    void saveAndExit() {
        try (PrintWriter writer = new PrintWriter(FILE_NAME)) {
            for (String s : students) {
                writer.println(s);
            }
            System.out.println("Saved " + students.size() + " students to registry.");
        } catch (FileNotFoundException e) {
            System.out.println("Error saving registry: " + e.getMessage());
        }
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentRegistry registry = new StudentRegistry();

        while (true) {
            System.out.println("\n=== Student Registry Menu ===");
            System.out.println("1. Add student");
            System.out.println("2. View all students");
            System.out.println("3. Save and exit");
            System.out.print("Choose option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            try {
                switch (choice) {
                    case 1:
                        System.out.print("Enter student name: ");
                        String name = scanner.nextLine();
                        registry.addStudent(name);
                        break;
                    case 2:
                        registry.viewAll();
                        break;
                    case 3:
                        registry.saveAndExit();
                        scanner.close();
                        return;
                    default:
                        System.out.println("Invalid choice.");
                }

            } catch (DuplicateStudentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}