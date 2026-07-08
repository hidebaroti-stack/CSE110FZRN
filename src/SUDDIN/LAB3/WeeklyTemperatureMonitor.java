package SUDDIN.LAB3;

import java.util.Scanner;

public class WeeklyTemperatureMonitor {
    /*Scenario A weather station records temperature for 7 days.
    Tasks 1. Store 7 days temperature using array.
    2. Display all temperature values.
    3. Find: o Hottest day
             o Coldest day
    4. Show how many days temperature was above 35°C.*/
    public static double hottestDay(double[] temp) {
        double hottest = Double.MIN_VALUE;
        for (double temps : temp) {
            if (temps > hottest) hottest = temps;
        }
        return hottest;
    }

    public static double coldestDay(double[] temp) {
        double coldest = Double.MAX_VALUE;
        for (double temps : temp) {
            if (temps < coldest) coldest = temps;
        }
        return coldest;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] temp = new double[7];

        System.out.print("Enter temperatures: ");
        for (int i = 0; i < temp.length; i++) {
            temp[i] = scanner.nextDouble();
        }
        System.out.print("Display of temperatures: ");
        for (int i = 0; i < temp.length; i++) {
            System.out.print(temp[i] + " ");
        }
        System.out.println();
        System.out.println("Hottest day: " + hottestDay(temp));
        System.out.println("Coldest day: " + coldestDay(temp));

        int count = 0;
        for (double temps : temp) {
            if (temps > 35) count++;
        }
        System.out.println("Days temperature was above 35°C: " + count);
    }
}