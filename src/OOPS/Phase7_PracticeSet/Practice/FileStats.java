package OOPS.Phase7_PracticeSet.Practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileStats {
    public static void main(String[] args) {
        int lineCount = 0;
        int wordCount = 0;
        int charCount = 0;

        try (Scanner reader = new Scanner(new File("names.txt"))) {
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                lineCount++;

                // Count words (split by whitespace)
                String[] words = line.trim().split("\\s+");
                if (!line.trim().isEmpty()) {
                    wordCount += words.length;
                }

                // Count characters (excluding newline)
                charCount += line.length();
            }

            System.out.println("Total lines: " + lineCount);
            System.out.println("Total words: " + wordCount);
            System.out.println("Total characters: " + charCount);

        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found!");
        }
    }
}