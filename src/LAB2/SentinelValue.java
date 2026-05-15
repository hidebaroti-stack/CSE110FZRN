package LAB2;

import java.util.Scanner;

public class SentinelValue {
    /* 02: Write a Java program that uses a while loop and a sentinel value to calculate the average of a set of integers entered by the user.
     The input should stop when the user enters 0 (sentinel value).
    The program should also display how many numbers were entered (excluding the sentinel).*/

    static void main() {

        Scanner scanner = new Scanner(System.in);

        int sum = 0, count = 0;

        System.out.print("Enter integers to find the average (0 to stop): ");

        while (true){
            int integer = scanner.nextInt();
            if (integer == 0) break;
            sum += integer;
            count++;
        }

        if (count == 0) {
            System.out.println("No numbers were entered.");
        } else {
            System.out.println("Total numbers entered: " + count);
            System.out.println("Average: " + (double) sum / count);
        }
    }
}