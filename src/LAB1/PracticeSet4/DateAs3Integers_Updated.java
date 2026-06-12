package LAB1.PracticeSet4;

import java.util.Scanner;

public class DateAs3Integers_Updated {
    //Write a program that prompts the user to enter a date as three integers — day, month, year — and prints the day of the year (1–365).
    //Sample: March 1, 2023 → day 60
    //(Hint: January has 31 days, February has 28 for simplicity, March has 31... add them up based on which month)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a date as 3-integer(e.g. March 1, 2023): ");
        String month = scanner.next();
        int date = scanner.nextInt();
        int year = scanner.nextInt();

        // Arrays of day in each month (default: non-leap year)
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        // Arrays of month names for look up
        String[] monthNames = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

        //Find month index
        int monthIndex = -1; //-1 for invalid month
        for (int i = 0; i < monthNames.length; i++) {
            if (monthNames[i].equalsIgnoreCase(month)) {
                monthIndex = i;
                break;
            }
        }

        //For invalid month
        if (monthIndex == -1) {
            System.out.println("Invalid month name.");
            return;
        }

        //For Leap Year
        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            daysInMonth[1] = 29;
        }

        //For validating month
        if (date < 1  || date > daysInMonth[monthIndex]) {
            System.out.println("Invalid day for " + month + ".");
            return;
        }
        //Calculate the day of the year
        int dayOfYear = 0;
        for (int i = 0; i < monthIndex; i++) {
            dayOfYear += daysInMonth[i]; //Add days from previous months
        }
        dayOfYear += date; //Add current date
        System.out.println("The date entered: " + month + " " + date + ", " + year + " -> " + "day " + dayOfYear);
    }
}