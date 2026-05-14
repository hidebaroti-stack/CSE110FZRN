import java.util.Scanner;

public class LabProblem5 {
    /* 05: Write a java program that reads an integer, and prints “The number is even” or “The number is odd”,
    depending on whether the number is even or odd. */
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input an integer: ");
        int integer = scanner.nextInt();

        System.out.println(integer % 2 == 0 ? "The number is even." : "The number is odd."); //Ternary operator
    }
}
