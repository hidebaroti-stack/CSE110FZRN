package LAB3;

import java.util.Scanner;

public class ArrayOfGrades {
    //01: Write a Java program that reads student scores, gets the best score, and then assigns grades.
    static int highestElement(int[] arr){
        int highest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > highest) {
                highest = arr[i];
            }
        }
       return highest;
    }

    static void main() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();
        int[] marks = new int[n];

        //Input Elements
        System.out.print("Enter " + n + " scores: " );
        for (int i = 0; i < marks.length; i++) {
            marks[i] = scanner.nextInt();
        }
        int best = highestElement(marks);
        System.out.println("Best score: " + best);

        //Printing Elements
        for (int i = 0; i < marks.length; i++) {
            char grade;
            if (marks[i] >= best - 10) {
                grade = 'A';
            } else if (marks[i] >= best - 20) {
                grade = 'B';
            } else if (marks[i] >= best - 30) {
                grade = 'C';
            } else if (marks[i] >= best - 40) {
                grade = 'D';
            } else {
                grade = 'F';
            }
            System.out.println("Student " + i + " score is " + marks[i] + " and grade is " + grade);
        }
    }
}