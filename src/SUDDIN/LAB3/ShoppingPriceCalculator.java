package SUDDIN.LAB3;

import java.util.Scanner;

public class ShoppingPriceCalculator {
    /*Scenario A customer buys 5 grocery items with different prices.
    Tasks1. Store 5 item prices in an array.
         2. Calculate:
                 o Total bill
                 o Average item price
         3. Apply 10% discount if total exceeds 2000. */
    public static double averageItem(int[] item) {
        int sum = 0;
        for (int items : item) {
            sum += items;
        }
        return (double) sum / item.length;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] item = new int[5];

        final double DISCOUNT = (double) 10 / 100;

        System.out.print("Enter item prices: ");
        for (int i = 0; i < item.length; i++) {
            item[i] = scanner.nextInt();
        }

        int total = 0;
        for (int j : item) {
            total += j;
        }
        System.out.println("Total bill: " + total);

        System.out.println("Average of the item prices: " + averageItem(item));

        if (total > 2000) total = (int) ((int) total * (1 - DISCOUNT));
        System.out.println("Total after discount: " + total);

    }
}