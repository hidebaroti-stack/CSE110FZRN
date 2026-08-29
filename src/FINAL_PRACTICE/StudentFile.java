package FINAL_PRACTICE;

import java.io.*;
import java.util.Scanner;

public class StudentFile {
    public static void main(String[] args) throws IOException {
        // Step 1: Create the file
        File myFile = new File("student.txt");
        if (myFile.createNewFile()) System.out.println("File created: " + myFile.getName());
        else System.out.println("File already exists.");

        // Step 2: Write student names
        FileWriter fw = new FileWriter(myFile);
        fw.write("Debaroti\nSneha\nArpita\n");
        fw.close();
        System.out.println("Successfully wrote to the file.");

        // Step 3: Read back the names
        Scanner reader = new Scanner(myFile);
        System.out.println("Reading from the student.txt: ");
        while(reader.hasNextLine()) {
            String data = reader.nextLine();
            System.out.println(data);
        }
        reader.close();
    }
}