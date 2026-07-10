package LAB3.Variant.Group3;

import java.util.Scanner;

public class ParallelArraysWithStatistics {
    //E13. Read n student names and scores. Print:
    //
    //The topper (highest score)
    //The bottom student (lowest score)
    //Class average
    //How many scored above average
    //
    //(Parallel arrays from Q05 + statistics)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the n: ");
        int n = scanner.nextInt();

        String[] names = new String[n];
        int[] scores = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter the names: ");
            names[i] = scanner.next();

            System.out.print("Enter the scores: ");
            scores[i] = scanner.nextInt();
        }
        // Find topper
        int highest = scores[0];
        String topper = names[0];
        for (int i = 0; i < n; i++) {
            if (scores[i] > highest) {
                highest = scores[i];
                topper = names[i];
            }
        }
        System.out.println("The topper: " + topper + " with score " + highest);
        //  Find bottom student
        int lowest = scores[0];
        String bottom = names[0];
        for (int i = 0; i < n; i++) {
            if (scores[i] < lowest) {
                lowest = scores[i];
                bottom = names[i];
            }
        }
        System.out.println("The bottom student: " + bottom + " with score " + lowest);
        // Find average
        int sum = 0;
        for (int score : scores) sum += score;
        double average = (double) sum / n;
        System.out.println("Class Average: " + String.format("%.2f", average));
        // Count average
        int countAbove = 0;
        for (int score : scores) {
            if (score > average) countAbove++;
        }
        System.out.print("Students getting scores above average: " + countAbove);
    }
}