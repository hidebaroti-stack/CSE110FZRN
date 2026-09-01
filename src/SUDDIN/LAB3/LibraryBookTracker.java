package SUDDIN.LAB3;

import java.util.ArrayList;
import java.util.Scanner;

public class LibraryBookTracker {
    /*Scenario Library has fixed number of shelves but books can change.
    Tasks 1. Use array to store shelf numbers.
          2. Use ArrayList to store books in each shelf.
          3. Allow: o Add book
                    o Remove book
                    o Search book location
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of shelves: ");
        int shelfCount = scanner.nextInt();
        int[] shelves = new int[shelfCount];

        // Initialize shelf numbers
        for (int i = 0; i < shelfCount; i++) {
            shelves[i] = i + 1;
        }

        // Each shelf has its own list of books
        ArrayList<ArrayList<String>> library = new ArrayList<>();
        for (int i = 0; i < shelfCount; i++) {
            library.add(new ArrayList<>());
        }

        while(true) {
            System.out.println("\n === Library Book Tracker ===");
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Search Book Location");
            System.out.println("4. Display All Books");
            System.out.println("5. Exit...");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newLine

            switch (choice) {
                case 1: // Add book
                    System.out.print("Enter shelf number (1-" + shelfCount + "): ");
                    int shelfAdd = scanner.nextInt();
                    scanner.nextLine();
                    if (shelfAdd < 1 || shelfAdd > shelfCount) {
                        System.out.println("Invalid shelf number!");
                        break;
                    }
                    System.out.print("Enter book title: ");
                    String bookTitle = scanner.nextLine();
                    library.get(shelfAdd - 1).add(bookTitle);
                    System.out.println("'" + bookTitle + "' added to shelf " + shelfAdd);
                    break;

                case 2: // Remove book
                    System.out.print("Enter shelf number (1-" + shelfCount + "): ");
                    int shelfRemove = scanner.nextInt();
                    scanner.nextLine();
                    if (shelfRemove < 1 || shelfRemove > shelfCount) {
                        System.out.println("Invalid shelf number!");
                        break;
                    }
                    System.out.print("Enter book title to remove: ");
                    String removeTitle = scanner.nextLine();
                    if (library.get(shelfRemove - 1).remove(removeTitle)) {
                        System.out.println("'" + removeTitle + "' removed from shelf " + shelfRemove);
                    } else {
                        System.out.println("Book not found on shelf " + shelfRemove);
                    }
                    break;

                case 3: // Search book
                    System.out.print("Enter book title to search: ");
                    String searchTitle = scanner.nextLine();
                    boolean found = false;
                    for (int i = 0; i < shelfCount; i++) {
                        if (library.get(i).contains(searchTitle)) {
                            System.out.println("'" + searchTitle + "' found on shelf " + shelves[i]);
                            found = true;
                        }
                    }

                    if (!found) {
                        System.out.println("Book not found in library.");
                    }
                    break;

                case 4: // Display all books
                    System.out.println("\n--- Library Catalog ---");
                    for (int i = 0; i < shelfCount; i++) {
                        System.out.print("Shelf " + shelves[i] + ": ");
                        if (library.get(i).isEmpty()) {
                            System.out.println("[Empty]");
                        } else {
                            for (String book : library.get(i)) {
                                System.out.print(book + " | ");
                            }
                            System.out.println();
                        }
                    }
                    break;

                case 5:  // Exit
                    System.out.println("Exiting Library Tracker...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}