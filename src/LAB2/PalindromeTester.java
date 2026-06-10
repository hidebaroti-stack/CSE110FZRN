package LAB2;

import java.util.Scanner;

public class PalindromeTester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str, another = "y";
        int left, right;

        while (another.equalsIgnoreCase("y")) {
            System.out.println("Enter a Palindrome string: ");
            str = scanner.nextLine().toLowerCase();
            left = 0;
            right = str.length() - 1;

            while (str.charAt(left) == str.charAt(right) && left < right) {
                left = left + 1;
                right = right - 1;
            }
            System.out.println();
            if (left < right) System.out.println("That string is NOT a Palindrome.");
            else System.out.println("That string IS a Palindrome. ");
            System.out.println("Test another palindrome (y/n)? ");
            another = scanner.nextLine();
        }
    }
}
