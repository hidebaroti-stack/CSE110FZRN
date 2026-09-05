package DAKP.BasicProgram;

import java.util.Scanner;

public class DOf1_BirthdateOfAPerson {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define sets
        int[][] sets = {
                {1,3,5,7,9,11,13,15,17,19,21,23,25,27,29,31},
                {2,3,6,7,10,11,14,15,18,19,22,23,26,27,30,31},
                {4,5,6,7,12,13,14,15,20,21,22,23,28,29,30,31},
                {8,9,10,11,12,13,14,15,24,25,26,27,28,29,30,31},
                {16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31}
        };

        int birthday = 0;

        // Ask questions
        for (int i = 0; i < sets.length; i++) {
            System.out.println("Is your birthday in this set? ");
            for (int num : sets[i]) {
                System.out.println(num + " ");
            }
            System.out.println("\nEnter Yes or No(Y/N) :");
            String answer = scanner.next();
            answer = answer.toUpperCase(); //scanner.next().charAt(0);

            if (answer.equals("Y")) birthday += sets[i][0];
        }
        System.out.println("Your birthday is on: " + birthday);
    }

}