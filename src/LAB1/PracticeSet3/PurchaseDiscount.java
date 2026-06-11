package LAB1.PracticeSet3;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class PurchaseDiscount {
    //A shop gives discounts based on purchase amount:
    //
    //Below 500 tk → no discount
    //500 to 999 tk → 5% discount
    //1000 to 4999 tk → 10% discount
    //5000 tk and above → 20% discount
    //
    //Write a program that reads the purchase amount and prints the discount amount and final price. Format as BDT currency.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the purchase amount: ");
        double purchaseAmount = scanner.nextDouble();


        NumberFormat bdcurrency = NumberFormat.getCurrencyInstance(new Locale("bn", "BD"));
        if (purchaseAmount >= 500 && purchaseAmount <= 999) {
            System.out.println("Gets a 5% discount of " + bdcurrency.format(purchaseAmount * 0.05));
            System.out.println("Final price: " + bdcurrency.format(purchaseAmount - (purchaseAmount * 0.05)));
        } else if (purchaseAmount >= 1000 && purchaseAmount <= 4999) {
            System.out.println("Gets a 10% discount of " + bdcurrency.format(purchaseAmount * 0.10));
            System.out.println("Final price: " + bdcurrency.format(purchaseAmount - (purchaseAmount * 0.10)));
        } else if (purchaseAmount >= 5000) {
            System.out.println("Gets a 20% discount of " + bdcurrency.format(purchaseAmount * 0.20));
            System.out.println("Final price: " + bdcurrency.format(purchaseAmount - (purchaseAmount * 0.20)));
        } else {
            System.out.println("No discount.");
        }
    }
}
