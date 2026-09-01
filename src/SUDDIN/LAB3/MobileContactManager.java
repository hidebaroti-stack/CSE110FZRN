package SUDDIN.LAB3;

import java.util.ArrayList;
import java.util.Scanner;

public class MobileContactManager {
    /*Scenario A mobile phone stores contacts dynamically.
    Tasks 1. Create an ArrayList to store contact names.
          2. Allow user to:
                   o Add new contact
                   o Remove contact
                   o Search contact
                   o Display all contacts */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Dynamic contact list
        ArrayList<String> contacts = new ArrayList<>();

        while (true) {
            System.out.println("\n=== Mobile Contact Manager ===");
            System.out.println("1. Add New Contact");
            System.out.println("2. Remove Contact");
            System.out.println("3. Search Contact");
            System.out.println("4. Display All Contacts");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1: // Add Contact
                    System.out.print("Enter contact number: ");
                    String newContact = scanner.nextLine();
                    contacts.add(newContact);
                    System.out.println("'" + newContact + "' added to contacts.");
                    break;

                case 2: // Remove Contact
                    System.out.print("Enter contact name to remove: ");
                    String removeContact = scanner.nextLine();
                    if (contacts.remove(removeContact)) {
                        System.out.println("'" + removeContact + "' removed from contacts.");
                    } else {
                        System.out.println("Contact not found.");
                    }
                    break;

                case 3: // Search contact
                    System.out.print("Enter contact name to search: ");
                    String searchContact = scanner.nextLine();
                    if (contacts.contains(searchContact)) {
                        System.out.println("'" + searchContact + "' is in your contacts.");
                    } else {
                        System.out.println("Contact not found.");
                    }
                    break;

                case 4: // Display all contacts
                    System.out.println("\n--- Contact List ---");
                    if (contacts.isEmpty()) {
                        System.out.println("[No contacts saved]");
                    } else {
                        for (int i = 0; i < contacts.size(); i++) {
                            System.out.println((i + 1) + ". " + contacts.get(i));
                        }
                    }
                    break;

                case 5: // Exit
                    System.out.println("Exiting Contact Manager...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}