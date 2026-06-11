package LAB1.PracticeSet2;

import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

public class MonthlySalary {
    //Write a program that prompts the user to enter their monthly salary and displays:
    //
    //Annual salary
    //Monthly tax (15% of monthly salary)
    //Net annual salary (after tax)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the monthly salary: ");
        long monthlySalary = scanner.nextLong();

        double annualSalary = monthlySalary * 12;
        double monthlyTax = monthlySalary * 0.15;
        double netAnnualSalary = annualSalary - (monthlyTax * 12);

        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(new Locale("bn","BD"));
        System.out.println("Annual salary: " + currencyFormat.format(annualSalary));
        System.out.println("Monthly tax (15%): " + currencyFormat.format(monthlyTax));
        System.out.println("Net annual salary (after tax): " + currencyFormat.format(netAnnualSalary));

        scanner.close();

    }
}
