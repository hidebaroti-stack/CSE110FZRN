package LAB2;

import java.util.Scanner;

public class GCDandLCM {

    static void calculateGCDandLCM(int a,int b){
        int GCD = 1;
        int LCM = 1;

        for(int i = 2; i <= Math.max(a, b); i++){

            int countA = 0;
            while (a % i == 0) {
                countA++;
                a /= i;
            }
            int countB = 0;
            while (b % i == 0) {
                countB++;
                b /= i;
            }
            if(countA > 0 || countB > 0) {
                int minPower = Math.min(countA, countB);
                int maxPower = Math.max(countA, countB);

                GCD *= (int) Math.pow(i, minPower);
                LCM *= (int) Math.pow(i, maxPower);

            }
        }
        System.out.println("GCD is: " + GCD);
        System.out.println("LCM is: " + LCM);
    }

    static void main() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first positive integer: ");
        int x = scanner.nextInt();

        System.out.print("Enter first positive integer: ");
        int y = scanner.nextInt();

        calculateGCDandLCM(x, y);

    }
}
