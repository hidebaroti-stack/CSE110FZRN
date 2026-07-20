package OOPS.Phase7_PracticeSet;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingLineByLine {
    public static void main(String[] args) {
        try (Scanner reader = new Scanner(new File("output.txt"))) {
            int lineNumber = 1;
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                System.out.println("Line " + lineNumber + ": " + line);
                lineNumber++;
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error : File not found!");
            e.printStackTrace();
        }
    }
}