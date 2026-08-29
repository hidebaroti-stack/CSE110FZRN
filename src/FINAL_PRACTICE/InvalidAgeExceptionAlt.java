package FINAL_PRACTICE;

import java.util.Scanner;

class MyExceptionAlt extends Exception {
    MyExceptionAlt(String str) {
        super(str);
    }
}

public class InvalidAgeExceptionAlt {
    void checkAge(int age) throws MyExceptionAlt {
        if (age > 150) throw new MyExceptionAlt("Invalid age");
        else System.out.println("Valid age: " + age);
    }
}

class ExceptionTestAlt {
    public static void main(String[] args) throws MyExceptionAlt {
        InvalidAgeExceptionAlt ex = new InvalidAgeExceptionAlt();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Age: ");
        int age = scanner.nextInt();

        ex.checkAge(age);
    }
}