package FZRN_SLIDES.FileHandling;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class ReadAFile {
    public static void main(String[] args) {
        try {
            File myFile = new File("az.txt");
            myFile.createNewFile();
            FileWriter my = new FileWriter(myFile);
            my.write("Hello\n");
            my.write("Java");
            my.close();
            Scanner scanner = new Scanner(myFile);
            while (scanner.hasNextLine()) {
                String word = scanner.nextLine();
                System.out.println(word);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}