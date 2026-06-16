package LAB1;

import java.util.Scanner;

public class LabProblem5_inMethod {
    public static void EvenOdd(int n) {
        System.out.println((n % 2 == 0) ? "Even." : "Odd.");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the n: ");
        int n = scanner.nextInt();
        EvenOdd(n);
    }
}