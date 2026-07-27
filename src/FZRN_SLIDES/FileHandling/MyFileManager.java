package FZRN_SLIDES.FileHandling;

import java.io.File;

public class MyFileManager {
    public static void main(String[] args) {
        try {
            // Step 1: Create a new file
            File myFile = new File("xyz.txt");
            if (myFile.createNewFile()) {
                System.out.println("File created: " + myFile.getName());
            } else {
                System.out.println("File already exists.");
            }

            // Step 2: Check file properties
            System.out.println("Does the file exist? " + myFile.exists());

            System.out.println("Readable? " + myFile.canRead());
            System.out.println("Writable? " + myFile.canWrite());

            System.out.println("Is it a file? " + myFile.isFile());
            System.out.println("Is is a directory? " + myFile.isDirectory());

            System.out.println("Absolute path: " + myFile.getAbsolutePath());
            System.out.println("last modified: " + myFile.lastModified());

            // Step 3: Rename the file
            File renamedFile = new File("renamed.txt");
            if (myFile.renameTo(renamedFile)) {
                System.out.println("File renamed to: " + renamedFile.getName());
            } else {
                System.out.println("Failed to rename file.");
            }

            // Step 4: List all files in current directory
            File currentDir = new File("."); // The "." (dot) means current working directory, it points to the folder where your program is running.
            String[] files = currentDir.list();
            System.out.println("Files in current directory: ");
            for (String f : files) {
                System.out.println(" - " + f);
            }

            // Delete the file
            if (renamedFile.delete()) {
                System.out.println("File deleted successfully.");
            } else {
                System.out.println("File couldn't be deleted.");
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}