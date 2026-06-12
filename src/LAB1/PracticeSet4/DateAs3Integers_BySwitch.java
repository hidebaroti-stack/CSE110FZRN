package LAB1.PracticeSet4;

import java.util.Scanner;

public class DateAs3Integers_BySwitch {
    //Write a program that prompts the user to enter a date as three integers — day, month, year — and prints the day of the year (1–365).
    //Sample: March 1, 2023 → day 60
    //(Hint: January has 31 days, February has 28 for simplicity, March has 31... add them up based on which month)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a date as 3-integer(e.g. March 1, 2023): ");
        String month = scanner.next();
        int date = scanner.nextInt();
        int year = scanner.nextInt();

        int day;
        switch (month) {
            case "January":
                day = (date);
                break;
            case "February":
                day = (31 + date);
                break;
            case "March":
                day = (31 + 28 + date);
                break;
            case "April":
                day = (31 + 28 + 31 + date);
                break;
            case "May":
                day = ( 31 + 28 + 31 + 30 + date);
                break;
            case "June":
                 day = (31 + 28 + 31 + 30 + 31 + date);
                break;
            case "July":
                 day = (31 + 28 + 31 + 30 + 31 + 30 + date);
                break;
            case "August":
                 day = (31 + 28 + 31 + 30 + 31 + 30 + 31 + date);
                break;
            case "September":
                day = (31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + date);
                break;
            case "October":
                day = (31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + date);
                break;
            case "November":
                day = (31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + date);
                break;
            case "December":
                day = (31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + date);
                break;
            default:
                System.out.println("Invalid Month.");
                return;
        }
        System.out.println("The date entered: " + month + " " + date + ", " + year + " -> " +"day " + day);

    }
}
