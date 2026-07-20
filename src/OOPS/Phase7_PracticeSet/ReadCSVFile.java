package OOPS.Phase7_PracticeSet;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReadCSVFile {
    public static void main(String[] args) throws FileNotFoundException {
        try (PrintWriter writer = new PrintWriter("students.txt")) {
            writer.println("Debaroti,19,3.92");
            writer.println("Bob,21,3.45");
            writer.println("Alice,20,3.78");
        } catch (FileNotFoundException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }

        try (Scanner reader = new Scanner(new File("students.txt"))) {
           while (reader.hasNextLine()) {
                String line = reader.nextLine();
                String[] parts = line.split(",");

                String name = parts[0];
                int age = Integer.parseInt(parts[1]);
                double cgpa = Double.parseDouble(parts[2]);

                System.out.printf("Name: %s, Age: %d, CGPA: %.2f%n", name, age, cgpa);

            }
        } catch (FileNotFoundException e) {
            System.out.println("error reading file: " + e.getMessage());
        }
    }
}
