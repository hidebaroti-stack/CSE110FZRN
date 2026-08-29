package FINAL_PRACTICE;

import java.util.Scanner;

class MyException extends Exception {
    MyException(String str) {
        super(str);
    }
}

public class InvalidAgeException {
    void checkAge(int age) throws MyException {
        if (age > 150) throw new MyException("Invalid age");
        else System.out.println("Valid age: " + age);
    }
}

class ExceptionTest {
    public static void main(String[] args) {
        InvalidAgeException ex = new InvalidAgeException();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Age: ");
        int age = scanner.nextInt();

        try {
            ex.checkAge(age);
        } catch (MyException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Check complete.");
        }
    }
}