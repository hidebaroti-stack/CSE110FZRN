package DAKP.ExceptionHandlingAndFileInputOutput;

/*
    1. Open a text file.
    2. Read line by line.
    3. For each line,
           * Count characters (line.length())
           * Split by spaces to count words.
           * Increment line count.
    4. Print totals.

 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BOf6_CountCharWordLine {
    public static void main(String[] args) {
        int charCount = 0;
        int wordCount = 0;
        int lineCount = 0;

        try {
            BufferedReader br = new BufferedReader(new FileReader("input.txt"));

            String line;

            while ((line = br.readLine()) != null) {
                lineCount++;
                charCount += line.length();
                String[] words = line.trim().split("\\s+");
                if (!line.trim().isEmpty()) {
                    wordCount += words.length;
                }
            }

            br.close();

            System.out.println("Characters: " + charCount);
            System.out.println("Words: " + wordCount);
            System.out.println("Lines: " + lineCount);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}