package LAB2;

import java.util.Scanner;

public class GCDAndLCM_Euclidean_Algorithm {
    //Computing GCD
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b; // remainder
            a = b;            // move divisor into dividend
            b = temp;         // remainder becomes new divisor
        }
        return a;
    }
    // Computing LCM
    public static int lcm(int a, int b) {
       return (a * b) / gcd(a, b);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Input the numbers
        System.out.println("Enter the numbers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        // Calling the methods
//        int gcd = gcd(a, b);
//        int lcm = lcm(a, b);
        // Display GCD & LCM
        System.out.println("GCD: " + gcd(a, b));
        System.out.println("LCM: " + lcm(a, b));
        /*
        -------------------------------DRY RUN-------------------------------
        // Dry run example: a = 48, b = 18
        // Step 1: temp = 48 % 18 = 12, a = 18, b = 12
        // Step 2: temp = 18 % 12 = 6, a = 12, b = 6
        // Step 3: temp = 12 % 6 = 0, a = 6, b = 0
        // Loop ends, return a = 6 (GCD)

        // Dry run example: a = 48, b = 18
        // gcd(48, 18) = 6
        // lcm = (48 * 18) / 6 = 864 / 6 = 144
        ---------------------------------------------------------------------
         */
    }
}