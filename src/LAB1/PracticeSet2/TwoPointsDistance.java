package LAB1.PracticeSet2;

import java.util.Scanner;

public class TwoPointsDistance {
    //Write a program that prompts the user to enter two points (x1, y1) and (x2, y2) and calculates the distance between them.
    // Formula: distance = √((x2-x1)² + (y2-y1)²) (Use Math.sqrt and Math.pow)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter two points(x1, y1) and (x2, y2): ");
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        double distance = Math.sqrt((Math.pow(x2 - x1, 2)) + (Math.pow(y2 - y1, 2)));

        System.out.printf("Distance: %.3f", distance);
        scanner.close();
    }
}
