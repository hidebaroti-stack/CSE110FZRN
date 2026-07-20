package OOPS.Phase7_PracticeSet;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WriteDemo_TryWithResources {
    public static void main(String[] args) {
        try (PrintWriter writer = new PrintWriter("output.txt")) {

            writer.println("Hello, file!");
            writer.println("Second line!");
            writer.printf("Formatted: %.2f%n", 3.1416);
        } catch (FileNotFoundException e) {
            System.out.println("Could not create file: " + e.getMessage());
        }
    }
}
// with try_with_resources -> write.close() got automatically called