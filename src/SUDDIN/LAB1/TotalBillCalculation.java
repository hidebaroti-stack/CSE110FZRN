package SUDDIN.LAB1;

import java.text.NumberFormat;
import java.util.Locale;

public class TotalBillCalculation {
    //5. Total Bill Calculation
    //Story:
    //A customer buys 3 items:
    //Item 1: 120 BDT
    //Item 2: 250 BDT
    //Item 3: 90 BDT
    //Task:
    //Write a Java program to calculate the total bill.
    //Formula:
    //Total = item1 + item2 + item3
    public static void main(String[] args) {
        final int item1 = 120;
        final int item2 = 250;
        final int item3 = 90;

        System.out.println("Item 1: " + item1 + " BDT");
        System.out.println("Item 2: " + item2 + " BDT");
        System.out.println("Item 3: " + item3 + " BDT");

        double total = item1 + item2 + item3;
        NumberFormat bdCurrency =  NumberFormat.getCurrencyInstance(Locale.forLanguageTag("bn-BD"));
        System.out.println("Total: " + bdCurrency.format(total));
    }
}