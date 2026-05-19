package LAB1;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class LabProblem9 {
    /* 09: Write a Java program that prompts the user to enter the exchange rate from currency in U.S. dollars (USD) to Bangladeshi Tk (BDT).
    Prompt the user to enter 0 to convert from USD to BDT and 1 to convert from BDT to USD.
    Then, prompt the user to enter the amount in USD or in BDT to convert it to BDT or USD, respectively. */

    static void main() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter exchange rate from USD to BDT: "); //Exchange Rate
        double exchangeRate = scanner.nextDouble();

        System.out.print("Enter 0 to convert from USD to BDT or 1 to convert from BDT to USD: "); //Conversion
        byte choice = scanner.nextByte();

        System.out.print("Enter the amount: "); //Amount to convert
        double amount = scanner.nextDouble();

        switch (choice) {
            case 0: //For USD to BDT
                double bdConversion = amount * exchangeRate;
                NumberFormat bdtCurrency = NumberFormat.getCurrencyInstance(Locale.forLanguageTag("bn-BD"));
                System.out.println("Converted amount in BDT: " + bdtCurrency.format(bdConversion));
                break;
            case 1: //For BDT to USD
                double usdConversion = amount / exchangeRate;
                NumberFormat usdCurrency  = NumberFormat.getCurrencyInstance(Locale.US);
                System.out.println("Converted amount in USD: " + usdCurrency.format(usdConversion));
                break;
            default:
                System.out.println("Invalid choice.Please enter either 0 or 1.");
        }

    }
}
