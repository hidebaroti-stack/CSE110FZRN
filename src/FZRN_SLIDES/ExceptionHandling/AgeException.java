package FZRN_SLIDES.ExceptionHandling;

import java.util.Scanner;

public class AgeException extends Exception {
    public AgeException(String message) {
        super(message);
    }
}

class AgeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the age: ");
        int age = scanner.nextInt();

        try {
            if (age < 18) throw new AgeException("You are not eligible!");
            System.out.println("You are eligible.");
        } catch (AgeException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}