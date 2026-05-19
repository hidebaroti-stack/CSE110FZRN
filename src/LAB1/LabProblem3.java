package LAB1;

import java.util.Scanner;

public class LabProblem3 {
    //03: Write a program that prompts the user to enter the minutes (e.g., 1 billion),
    // and displays the number of years and days for the minutes. For simplicity, assume a year has 365 days.
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter minutes: ");
        long totalMinutes = scanner.nextLong();

        final int MINUTES_IN_A_DAY = 24*60;//1 Days = 24 hours, 60 minutes
        final int MINUTES_IN_A_YEAR = 365*MINUTES_IN_A_DAY; //1 Year = 365 days, 24 hours, 60 minutes

        long days = (totalMinutes % MINUTES_IN_A_YEAR) / MINUTES_IN_A_DAY;
        long years = (totalMinutes / MINUTES_IN_A_YEAR);

        System.out.println( years + "Years" + ", " + days + "days" + ".");

    }
}