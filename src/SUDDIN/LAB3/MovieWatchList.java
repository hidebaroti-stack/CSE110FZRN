package SUDDIN.LAB3;

import java.util.ArrayList;
import java.util.Scanner;

public class MovieWatchList {
    /*Scenario A user keeps a list of movies to watch.
    Tasks 1. Store movie names using ArrayList.
          2. Allow user to:
                     o Add movie
                     o Mark movie as watched (remove)
                     o Display remaining movies
          3. Display total movies left.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> movies = new ArrayList<>();

        int choice;

        do {
            System.out.println("\n=== Movie Watch List ===");
            System.out.println("1. Add Movie");
            System.out.println("2. Mark Movie as Watched (Remove)");
            System.out.println("3. Display Remaining Movies");
            System.out.println("4. Display Total Movies Left");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter movie name: ");
                    String movie = scanner.nextLine();
                    movies.add(movie);
                    System.out.println("'" + movie + "' added to watch list.");
                    break;
                case 2:
                    System.out.print("Enter movie name to mark as watched: ");
                    String watched = scanner.nextLine();
                    if (movies.remove(watched)) {
                        System.out.println("'" + watched + "' removed from watch list.");
                    } else {
                        System.out.println("Movie not found.");
                    }
                    break;
                case 3:
                    System.out.println("\n--- Remaining Movies ---");
                    if (movies.isEmpty()) {
                        System.out.println("[No movies left]");
                    } else {
                        for (String m : movies) {
                            System.out.println("- " + m);
                        }
                    }
                    break;
                case 4:
                    System.out.println("Total movies left: " + movies.size());
                    break;
                case 5:
                    System.out.println("Exiting Movie Watch List...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 5);
        scanner.close();
    }
}