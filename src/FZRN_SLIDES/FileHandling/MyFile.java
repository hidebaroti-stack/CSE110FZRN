package FZRN_SLIDES.FileHandling;

import java.io.File;

public class MyFile {
    public static void main(String[] args) {
        try {
            File myFile = new File("abc.txt");
            myFile.createNewFile(); // Creates a new file in project directory
            // createNewFile() method returns boolean, if file exists it would return false
            // If this fails → program crashes
            System.out.println("Does the file exist (true/false)? " + myFile.exists());
            System.out.println("What is the name of the file? " + myFile.getName());
            System.out.println("What is the path of the file? " + myFile.getAbsolutePath());
            System.out.println("What is the length of the file? " + myFile.length()); // in bytes
            if (myFile.delete()) System.out.println("File deleted!");
            System.out.println("After deleting the file, does the file exist? " + myFile.exists());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}