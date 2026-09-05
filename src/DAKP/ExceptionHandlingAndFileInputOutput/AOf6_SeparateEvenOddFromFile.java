package DAKP.ExceptionHandlingAndFileInputOutput;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/*
    1. Open input.txt for reading.
    2. Read numbers one by one.
    3. Check if each number is even or odd.
    4. Write even numbers to even.txt and odd numbers to odd.txt.
    5. Close all files.

 */

public class AOf6_SeparateEvenOddFromFile {
    public static void main(String[] args) {
        try {
            Scanner reader = new Scanner(new File("input.txt"));

            PrintWriter evenWriter = new PrintWriter("even.txt");
            PrintWriter oddWriter = new PrintWriter("odd.txt");

            while (reader.hasNextInt()) {
                int num = reader.nextInt();
                if (num % 2 == 0) evenWriter.println(num);
                else oddWriter.println(num);
            }

            reader.close();

            evenWriter.close();
            oddWriter.close();

            System.out.println("Numbers separated successfully!");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}