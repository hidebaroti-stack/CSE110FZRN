package LAB1;

import java.util.Scanner;

public class LabProblem2 {
    //02: Write a program that prompts the user to enter the seconds, and display the hours, minutes and seconds for the input seconds.
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter seconds: ");
        int totalseconds = scanner.nextInt();

        final int MINUTES = 60; //1 Minutes = 60 Seconds
        final int HOURS = 60*60;//1 Hours = 3600 Seconds

        int hours = totalseconds / HOURS;
        int minutes = (totalseconds % HOURS) / MINUTES;
        int seconds = totalseconds % MINUTES;

        System.out.println( hours + "Hours" + ", " + minutes + "Minutes" + ", " + seconds + "Seconds" + ".");

    }
}
