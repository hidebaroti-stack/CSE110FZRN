package SUDDIN.LAB3;

import java.util.ArrayList;
import java.util.Scanner;

public class RestaurantOrderSystem {
    /* Scenario Restaurant has fixed menu but customer orders vary.
    Tasks 1. Store menu items using array.
          2. Store customer ordered items using ArrayList.
          3. Allow user to:
                o Display menu
                o Order food
                o Remove order
                o Show final bill count */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 1. Fixed menu
        String[] menu = { "Burger - 150",
                "Pizza - 300",
                "Pasta - 200",
                "Sandwich - 120",
                "Coffee - 80" };
        int[] prices = {150, 300, 200, 120, 80};
        // 2. Customer orders
        ArrayList<Integer> orders = new ArrayList<>();

        while (true) {
            System.out.println("\n=== Restaurant Menu ===");
            System.out.println("1. Display Menu");
            System.out.println("2. Order Food");
            System.out.println("3. Remove Order");
            System.out.println("4. Show Final Bill");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1: // Display menu
                    for (int i = 0; i < menu.length; i++) {
                        System.out.println((i + 1) + ". " + menu[i]);
                    }
                    break;
                case 2: // Order food
                    System.out.println("Enter item number to order: ");
                    int orderItem = scanner.nextInt();
                    if (orderItem < 1 || orderItem > menu.length) {
                        System.out.println("Invalid item!");
                    } else {
                        orders.add(orderItem - 1);
                        System.out.println(menu[orderItem - 1] + " added to your order.");
                    }
                    break;
                case 3: // Remove order
                    System.out.println("Enter item number to remove: ");
                    int removeItem = scanner.nextInt();
                    if (orders.contains(removeItem - 1)) {
                        orders.remove(Integer.valueOf(removeItem - 1 ));
                        System.out.println(menu[removeItem - 1] + " removed from your order.");
                    } else {
                        System.out.println("Item not found in your order");
                    }
                    break;
                case 4: // Show total bill
                    int total = 0;
                    System.out.println("=== Your order ===");
                    for (int index : orders) {
                        System.out.println(menu[index]);
                        total += prices[index];
                    }
                    System.out.println("Total Bill: " + total + " BDT");
                    break;
                case 5: // Exit
                    System.out.println("Thanks for visiting....");
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}