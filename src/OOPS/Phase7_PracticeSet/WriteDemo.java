package OOPS.Phase7_PracticeSet;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WriteDemo {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter writer = new PrintWriter("output.txt");

        writer.println("Hello, file!");
        writer.println("Second line.");
        writer.printf("Formatted: %.2f%n", 3.1416);

        writer.close();
    }
}