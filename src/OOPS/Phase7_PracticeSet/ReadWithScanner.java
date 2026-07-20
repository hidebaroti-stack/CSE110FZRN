package OOPS.Phase7_PracticeSet;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadWithScanner {
    public static void main(String[] args) throws FileNotFoundException {
        try (Scanner reader = new Scanner(new File("output.txt"))) {
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }
}