package LAB1.PracticeSet4;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class InterestRates {
    //A bank offers the following interest rates based on deposit amount:
    //
    //Below 10,000 tk → 4% per year
    //10,000 to 49,999 tk → 6% per year
    //50,000 and above → 8% per year
    //
    //Write a program that reads the deposit amount and number of years, and calculates the total amount after simple interest.
    //Formula: total = principal + (principal * rate * years)
    //Format final output as BDT currency.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Deposit number: ");
        long principal = scanner.nextLong();
        System.out.print("Enter the number of years: ");
        int years = scanner.nextInt();

        double rate = 0;
        if (principal < 10000) rate = 0.04;
        else if (principal > 10000 && principal <= 49999) rate = 0.06;
        else if (principal >= 50000) rate = 0.08;

        double total = principal + (principal * rate * years);

        NumberFormat bdtcurrency = NumberFormat.getCurrencyInstance(new Locale("bn", "BD"));
        System.out.println("Total: " + bdtcurrency.format(total));
    }
}