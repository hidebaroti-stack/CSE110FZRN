package LAB3.SetA;

import java.util.Scanner;

public class Frequency_Table_without_Repetition {
    //Read n integers (values between 1–50).
    // Print each unique number and how many times it appeared, but only print numbers that appeared more than once.
    //
    //Sample:
    //Input:  3 5 3 7 5 5 2
    //Output:
    //3 appears 2 times
    //5 appears 3 times
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] freq = new int[51];
        System.out.print("Enter integer numbers between 1 to 50: ");
        while (true) {
            int n = scanner.nextInt();
            if (n == 0) break;
            if (n >= 1 && n <= 50) {
                freq[n]++;
            }
        }
        for (int i = 1; i <= 50; i++) {
            if (freq[i] > 1) {
                System.out.println(i + " appears " + freq[i] + " times.");
            }
        }
    }
}