package LAB3.Simplified;

import java.util.Scanner;

public class ArrayOfCountOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Create a 101 sized int type array
        int[] count = new int[101];
        // Input from 1 to 100 till someone press 0
        System.out.print("Enter the integers between 1 to 100: ");
        while (true) {
            int integers = scanner.nextInt();
            if (integers == 0) break;
            if (integers >= 1 && integers <= 100) count[integers]++;
        }
        // Display count occurrences
        for (int i = 1; i < count.length; i++) {
            if (count[i] > 0) System.out.println(i + " occurs " + count[i] + ((count[i] > 1) ? " times" : " time"));
        }
        scanner.close();
    }
}