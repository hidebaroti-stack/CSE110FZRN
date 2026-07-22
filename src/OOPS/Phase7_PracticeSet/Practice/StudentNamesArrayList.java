package OOPS.Phase7_PracticeSet.Practice;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentNamesArrayList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = new String[5];
        // Step 1: Ask user for 5 student names
        System.out.println("=== Enter 5 student names ===");
        for (int i = 0; i < names.length; i++) {
            System.out.print("Name " + (i + 1) + ": ");
            names[i] = scanner.nextLine();
        }
        // Step 2: Save names to filr (overwrite old content)
        try (PrintWriter writer = new PrintWriter("names.txt")) {
            for (String name : names) {
                writer.println(name);
            }
            System.out.println("Names saved to the file names.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }
        // Step 3: Read file back into ArrayList
        ArrayList<String> studentList = new ArrayList<>();
        try (Scanner reader = new Scanner(new File("names.txt"))) {
            while (reader.hasNextLine()) {
                studentList.add(reader.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        System.out.println("Initial list: " + studentList);
        // Step 4: Add two more names to ArrayList
        System.out.println("=== Enter two more student names to append ===");
        for (int i = 0; i < 2; i++) {
            System.out.print("Extra name: " + (i + 1) + ": ");
            studentList.add(scanner.nextLine());
        }
        // Step 5: Append the new names to the file (without erasing the old ones)
        try (FileWriter fileWriter = new FileWriter("names.txt", true)) {
            for (int i = 5; i < studentList.size(); i++) {
                fileWriter.write(studentList.get(i) + System.lineSeparator());
            }
            System.out.println("Appended 2 new names to names.txt");
        } catch (IOException e) {
            System.out.println("Error appending to file: " + e.getMessage());
        }
        // Step 6: Read file final time for all 7 names
        try (Scanner reader = new Scanner(new File("names.txt"))) {
            int lineNumber = 1;
            System.out.println("=== Final file contents ===");
            while (reader.hasNextLine()) {
                System.out.println("Line " + lineNumber + ": " + reader.nextLine());
                lineNumber++;
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        scanner.close();
    }
}