package FZRN_SLIDES.FileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TestFileWriter {
    public static void main(String[] args) throws IOException {
        File file = new File("input.txt");

        if (!file.exists()) file.createNewFile();

        FileWriter fw = new FileWriter(file);
        fw.write("Java file handling Test.");
        fw.close();

        FileWriter fw2 = new FileWriter(file);
        fw2.write("Overwritten!");
        fw2.close();
    }
}