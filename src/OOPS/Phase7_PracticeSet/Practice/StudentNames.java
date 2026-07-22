package OOPS.Phase7_PracticeSet.Practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class StudentNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = new String[5];

        System.out.println("=== Enter 5 student names ===");
        for (int i = 0; i < names.length; i++) {
            System.out.print("Name " + (i + 1) + ": ");
            names[i] = scanner.nextLine();
        }

        try (PrintWriter writer = new PrintWriter("names.txt")) {
           for (String name : names) {
               writer.println(name);
           }
            System.out.println("Names saved to the file names.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }

        try (Scanner reader = new Scanner(new File("names.txt"))) {
            int lineNumber = 1;
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                System.out.println("Line " + lineNumber + ": " + line);
                lineNumber++;
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        scanner.close();
    }
}