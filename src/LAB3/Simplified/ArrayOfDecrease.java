package LAB3.Simplified;

import java.util.Scanner;

public class ArrayOfDecrease {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Input the number of students
        System.out.print("Enter the number of the students: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume new line
        // Create string and int type array fot the name and the score of the students
        String[] name = new String[n];
        int[] score = new int[n];
        // Input the name and score of the students
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the name of student " + (i + 1) +": ");
            name[i] = scanner.nextLine();
            System.out.print("Enter score of " + name[i] + ": ");
            score[i] = scanner.nextInt();
            scanner.nextLine();
        }
        // Bubble sort for scores and numbers
        for (int j = 0; j < n - 1; j++) {
            for (int k = 0; k < n - 1 - j; k++) {
                if (score[k] < score[k + 1]) {
                    int tempScore = score[k];
                    score[k] = score[k + 1];
                    score[k + 1] = tempScore;

                    String tempName =  name[k];
                    name[k] = name[k + 1];
                    name[k + 1] = tempName;
                }
            }
        }
        // Display students in decreasing order
        System.out.println();
        System.out.println("Students in decreasing order of scores: ");
        for (int i = 0; i < n; i++) {
            System.out.println(name[i] + " - " + score[i]);
        }
        scanner.close();
    }
}