package LAB3.SetC;

import java.util.Scanner;

public class RankStudent {
    //C2. Rank Students
    //Read n student names and scores. Sort them by score descending (bubble sort on parallel arrays like her problem). Then print with rank number.
    //Sample:
    //Rank 1: Debaroti - 95
    //Rank 2: Alice - 88
    //Rank 3: Bob - 72
    //(Twist: adds rank display to her exact student sorting problem)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = scanner.nextInt();

        String[] names = new String[n];
        int[] scores = new int[n];

        // Input names and scores
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name for student " + (i + 1) + ": ");
            names[i] = scanner.next();

            System.out.print("Enter score for " + names[i] + ": ");
            scores[i] = scanner.nextInt();
        }

        // Bubble sort (descending by score)
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (scores[j] < scores[j + 1]) {
                    // Swap scores
                    int tempScore = scores[j];
                    scores[j] = scores[j + 1];
                    scores[j + 1] = tempScore;

                    // Swap names
                    String tempName = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = tempName;
                }
            }
        }

        // Print ranked students
        System.out.print("\n--- Student Ranking ---\n");
        for (int i = 0; i < n; i++) {
            System.out.println("Rank " + (i + 1) + ": " + names[i] + " - " + scores[i]);
        }
        scanner.close();
    }
}