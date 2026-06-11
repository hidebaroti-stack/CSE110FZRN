package LAB1.PracticeSet3;

import java.util.Scanner;

public class TotalNumberOfSec {
    //Write a program that prompts the user to enter a total number of seconds (can be very large, like 1 billion)
    // and displays it as days, hours, minutes, and seconds — all four units together.
    //Sample: 100000 seconds = 1 days, 3 hours, 46 minutes, 40 seconds
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the total number of Second: ");
        long totalSeconds = scanner.nextLong();

        final int DAY = 24 * 60 * 60;
        final int HOUR = 60 * 60;
        final int MINUTES = 60;

        long days = totalSeconds / DAY;
        long remainingHours = (totalSeconds % DAY) / HOUR;
        long remainingMinutes = (totalSeconds % HOUR) / MINUTES ;
        long remainingSeconds = totalSeconds % MINUTES ;

        System.out.print(totalSeconds + " seconds = " + days + " days, " + remainingHours + " hours, " + remainingMinutes + " minutes, " + remainingSeconds + " seconds.");
    }
}