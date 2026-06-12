package LAB1.PracticeSet4;

import java.util.Scanner;

public class LeapYear {
    //Write a program that prompts the user to enter a year and determines whether it is a leap year.
    //Rules: divisible by 4 → leap year, BUT divisible by 100 → not a leap year, BUT divisible by 400 → leap year again.
    //Sample: 2000 → leap year, 1900 → not, 2024 → leap year
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        if (year % 4 == 0 && (year % 100 != 0 || year % 400 ==0)) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is NOT a Leap Year.");
        }
    }
}