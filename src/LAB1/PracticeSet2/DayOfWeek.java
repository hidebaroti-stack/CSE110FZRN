package LAB1.PracticeSet2;

import java.util.Scanner;

public class DayOfWeek {
    /* Write a program that reads an integer from 1 to 7 and prints the day of the week using a switch statement.
    1 → Monday, 2 → Tuesday ... and so on. Print "Invalid" for anything outside 1–7. */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number (1–7): ");
        int dayNumber = scanner.nextInt();

        switch (dayNumber) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid");
        }
        scanner.close();
    }
}
