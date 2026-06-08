package LAB1.PracticeSet1;

import java.util.Scanner;

public class LargestOf3 {
    /* P4. Write a program that prompts the user to enter three numbers and prints the largest among them.
    (Use if-else, no Math.max) */
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter three numbers: ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();

        if (x == y && x == z) System.out.println("All the numbers are equal.");
        else if (x > y && x > z) System.out.println("X is the Largest.");
        else if (y > x && y > z) System.out.println("Y is the Largest.");
        else System.out.println("Z is the Largest");

        scanner.close();
        }
    }
