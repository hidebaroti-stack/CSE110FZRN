package LAB1.PracticeSet1;

import java.util.Scanner;

public class VolumeOfSphere {
    /* P2. Write a program that prompts the user to enter the radius of a sphere and displays its volume. Use final for PI.
    Formula: volume = (4.0 / 3) * PI * r³ (Hint: use Math.pow(r, 3)) */

    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Radius: ");
        double radius = scanner.nextDouble();

        final float PI = 3.1416F;

        double volume = (4.0 / 3) * PI * Math.pow(radius, 3);

        System.out.printf("Volume of sphere: %.2f", volume);
        scanner.close();
    }
}
