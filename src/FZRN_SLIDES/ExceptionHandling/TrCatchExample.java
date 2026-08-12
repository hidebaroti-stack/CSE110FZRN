package FZRN_SLIDES.ExceptionHandling;

import java.io.FileReader;
import java.io.IOException;

public class TrCatchExample {
    static void readFile() {
        try {
            FileReader fr = new FileReader("test.txt");
            System.out.println("File opened successfully!");
        } catch (IOException e) {
            System.out.println("File not found or error reading file!");
        }
    }

    public static void main(String[] args) {
        readFile();
    }
}