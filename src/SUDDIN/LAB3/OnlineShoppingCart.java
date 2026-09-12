package SUDDIN.LAB3;

import java.util.ArrayList;
import java.util.Scanner;

public class OnlineShoppingCart {
    /*Scenario An online store allows customers to add items to cart.
    Tasks 1. Use ArrayList to store product names.
          2. Provide menu options:
                 o Add product
                 o Remove product
                 o Display cart items
                 o Count total products */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> cart = new ArrayList<>();

        int choice;

        do {
            System.out.println("\n=== Online Shopping Cart ===");
            System.out.println("1. Add Product");
            System.out.println("2. Remove Product");
            System.out.println("3. Display Cart Items");
            System.out.println("4. Count Total Products");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter product name to add: ");
                    String product = scanner.nextLine();
                    cart.add(product);
                    System.out.println("'" + product + "' added to cart.");
                    break;
                case 2:
                    System.out.print("Enter product name to remove: ");
                    String removeProduct = scanner.nextLine();
                    if (cart.remove(removeProduct)) {
                        System.out.println("'" + removeProduct + "' removed from cart.");
                    } else {
                        System.out.println("Product not found in cart.");
                    }
                    break;
                case 3:
                    System.out.println("\n--- Cart Items ---");
                    if (cart.isEmpty()) {
                        System.out.println("[Cart is empty]");
                    } else {
                        for (String item : cart) {
                            System.out.println("- " + item);
                        }
                    }
                    break;
                case 4:
                    System.out.println("Total products in cart: " + cart.size());
                    break;
                case 5:
                    System.out.println("Exiting Online Shopping Cart...");
                    break;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 5);

        scanner.close();
    }
}