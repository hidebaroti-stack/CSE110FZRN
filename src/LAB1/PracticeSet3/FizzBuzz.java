package LAB1.PracticeSet3;

import java.util.Scanner;

public class FizzBuzz {
    //Write a program that reads an integer and prints:
    //
    //"Fizz" if divisible by 3
    //"Buzz" if divisible by 5
    //"FizzBuzz" if divisible by both
    //The number itself if none of the above
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int integer = scanner.nextInt();

        if  ((integer % 3 == 0) && (integer % 5 == 0)) System.out.print("FizzBuzz");
        else if (integer % 3 == 0) System.out.print("Fizz");
        else if (integer % 5 == 0) System.out.print("Buzz");
        else System.out.print(integer);
    }
}