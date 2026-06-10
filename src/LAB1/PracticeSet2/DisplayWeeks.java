package LAB1.PracticeSet2;

import java.util.Scanner;

public class DisplayWeeks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number of days: ");
        int days = scanner.nextInt();

        final int WEEKS = 7;

        int weeks = days / WEEKS;
        int remainingDays = days % WEEKS;

        System.out.print(days + (days != 1 ?  " days " : " day " ) + "= " + weeks + (weeks != 1 ? " weeks " : " week ") + "and " + remainingDays + (remainingDays != 1 ? " days." : " day."));
    }
}
