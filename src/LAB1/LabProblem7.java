package LAB1;

import java.util.Scanner;

public class LabProblem7 {
    //07: Write a program in java to determine given char is vowel or consonant using switch statement.
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input an Character: ");
        char character = scanner.next().charAt(0);

        switch (Character.toLowerCase(character)) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("The char is a Vowel.");
                break;
            default:
                System.out.println(Character.isLetter(character) ? "The character is a Consonant." : "Not a Letter.");
        }
    }
}
