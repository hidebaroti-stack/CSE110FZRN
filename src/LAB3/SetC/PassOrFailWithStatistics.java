package LAB3.SetC;

import java.util.Scanner;

public class PassOrFailWithStatistics {
    // Pass or Fail with Statistics
    //Read n scores. Print pass (≥50) or fail (<50) for each. Then print:
    //
    //Total passed
    //Total failed
    //Class average
    //Highest score
    //Lowest score
    //
    //All in one program.
    //(Twist: combines multiple statistics with pass/fail — comprehensive single program)

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = scanner.nextInt();

        int[] scores = new int[n];
        int passed = 0, failed = 0;
        int sum = 0;
        int highest = Integer.MIN_VALUE;
        int lowest = Integer.MAX_VALUE;

        // Input scores and find pass/fall
        for (int i = 0; i < n; i++) {
            System.out.print("Enter score for students " + (i + 1) + ": ");
            scores[i] = scanner.nextInt();

            if (scores[i] >= 50) {
                System.out.println("Passed");
                passed++;
            } else {
                System.out.println("Failed");
                failed++;
            }

            sum += scores[i];

            if (scores[i] > highest) highest = scores[i];
            if (scores[i] < lowest) lowest = scores[i];

        }
        // Statistics
        double average = (double) sum / n;

        System.out.println("\n---- Class Statistics ----");

        System.out.println("Total Passed: " + passed);
        System.out.println("Total Failed: " + failed);
        System.out.printf("Class Average: %.2f%n", average);
        System.out.println("Highest Score: " + highest);
        System.out.println("Lowest Score: " + lowest);
    }
}