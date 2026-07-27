package FZRN_SLIDES.FileHandling;

import java.io.File;
import java.io.IOException;

public class ErrorCodeFix1 {
    public static void main(String[] args) {
        try {
            File myFile = new File("example.txt");
            if (myFile.createNewFile()) System.out.println("File created.");
            else System.out.println("File already exists.");
        } catch (IOException e) {
            System.out.println("An error occurred while creating the file: " + e.getMessage());
        }
    }
}