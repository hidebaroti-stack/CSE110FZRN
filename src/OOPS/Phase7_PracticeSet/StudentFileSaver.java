package OOPS.Phase7_PracticeSet;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentFileSaver {
    // Constant file name for saving and loading student data
    static final String FILE_NAME = "students.txt";

    /**
    * Saves the list of students to a file.
    *  Uses try-with-resources so PrintWriter closes automatically
    */
    static void saveStudents(ArrayList<String> students) {
        try (PrintWriter writer = new PrintWriter(FILE_NAME)) {
            // Write each student name on a new line
            for (String student : students) {
                writer.println(student);
            }
            System.out.println("Saved " + students.size() + " students to file.");
        } catch (FileNotFoundException e) {
            System.out.println("Could not save: " + e.getMessage());
        }
    }

    /**
     * Loads student names from the file into an ArrayList
     * If the file does not exist, returns an empty list
     */
    static ArrayList<String> loadStudents() {
        ArrayList<String> students = new ArrayList<>();
        File file = new File(FILE_NAME);

        // Check if file exists before trying to read
        if (!file.exists()) {
            System.out.println("No saved data found. Starting fresh.");
            return students;
        }
        // Read file line by line
        try (Scanner reader = new Scanner(file)) {
            while (reader.hasNextLine()) {
                students.add(reader.nextLine());
            }
            System.out.println("Loaded " + students.size() + " students from file.");
        } catch (FileNotFoundException e) {
            System.out.println("Could not load: " + e.getMessage());
        }
        return students;
    }

    public static void main(String[] args) {
        // Step 1: Load existing students from file (if any)
        ArrayList<String> students = loadStudents();

        // Step 2: Add new students to the list
        students.add("Debaroti");
        students.add("Bob");
        students.add("Alice");

        // Step 3: Save updated list back to file
        saveStudents(students);

        // Step 4: Reload from file to verify persistence
        ArrayList<String> reloaded = loadStudents();
        System.out.println("Verified students: " + reloaded);
    }
}