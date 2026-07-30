package OOPS.Phase7_PracticeSet.Practice;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Products {
    public static void main(String[] args) {

        // Step 1: Write product to CSV file
        try (FileWriter writer = new FileWriter("products.csv")) {
            writer.write("Laptop,75000,3\n");
            writer.write("Mouse,500,10\n");
            writer.write("Keyboard,1200,5\n");
            writer.write("Monitor,15000,2\n");
        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }

        // Step 2: Read file back and parse
        double totalValue = 0;

        System.out.println("\n======== Product Inventory Table ========");
        System.out.printf("%-10s %-10s %-10s %-15s%n", "Name", "Price", "Quantity", "Value");

        try (Scanner reader = new Scanner(new File("products.csv"))) {
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                String[] parts = line.split(",");

                String name = parts[0];
                double price = Double.parseDouble(parts[1].trim());
                int quantity = Integer.parseInt(parts[2].trim());
                double value = price * quantity;

                totalValue += value;

                System.out.printf("%-10s %-10.2f %-10d %-15.2f%n", name, price, quantity, value);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        // Step 3: Print the total inventory value
        System.out.println("\nTotal Inventory Value: " + totalValue);
    }
}