package LAB3;

import java.util.Scanner;

public class ArrayOfDecrease {
    //05: Write a Java program that prompts the user to enter the number of students, the students’ names, and their scores, and prints student names in decreasing order of their scores
    static void main() {
        Scanner scanner = new Scanner(System.in);
        //Input Students
        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();
        //Array for scores & names
        int[] scores = new int[n];
        String[] names = new String[n];
        //Input name & scores
        for (int i = 0; i < n ; i++) {
            System.out.print("Enter name of the student " + (i + 1) + ": " );
            names[i] = scanner.next();
            System.out.print("Enter score of " + names[i] + ": ");
            scores[i] = scanner.nextInt();
        }
        //Bubble sort for score & name
        for (int i = 0; i < n-1 ; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (scores[j] < scores[j + 1]){

                    int tempScore = scores[j];
                    scores[j] = scores[j + 1];
                    scores[j + 1] = tempScore;

                    String tempName = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = tempName;
                }
            }
        }
        //Output
        System.out.println("\nStudents in decreasing order of scores:");
        for (int i = 0; i < n ; i++) {
            System.out.println(names[i] + " - " + scores[i] );
        }
    }
}