package LAB3;

import java.util.Scanner;

public class ArrayOfOccurrences {
    //02: Write a Java program that reads the integers between 1 and 100 and counts the occurrences of each.
    static void main() {

        Scanner scanner = new Scanner(System.in);
        int[] count = new int[101];

        System.out.print("Enter the integer between 1 to 100: ");

        while (true) {
            int number = scanner.nextInt();
            if (number == 0) break;
            if (number >= 1 && number <= 100) count[number]++;
        }
        for (int i = 1; i < count.length ; i++) {
            if (count[i] > 0) {
                System.out.println(i + " occurs " + count[i] + ((count[i] == 1) ? " time." : " times."));
            }
        }
    }
}