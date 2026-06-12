package LAB1.PracticeSet4;

import java.util.Scanner;

public class DateAs3Integers_ByArrays {
    //Write a program that prompts the user to enter a date as three integers — day, month, year — and prints the day of the year (1–365).
    //Sample: March 1, 2023 → day 60
    //(Hint: January has 31 days, February has 28 for simplicity, March has 31... add them up based on which month)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a date as 3-integer(e.g. March 1, 2023): ");
        int month = scanner.nextInt();
        int date = scanner.nextInt();
        int year = scanner.nextInt();

        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int dayOfYear = 0;
        for (int i = 0; i < month - 1; i++) {
            dayOfYear += daysInMonth[i];
        }
        dayOfYear += date;
        System.out.println("The date entered: " + date + "/" + month + "/" + year + " -> " +"day " + dayOfYear);

    }
}
