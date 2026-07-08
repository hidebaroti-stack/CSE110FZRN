package SUDDIN.LAB3;

import java.util.Scanner;

public class BusSeatReservationSystem {
    /* Scenario A bus has 20 seats. Each seat can be booked or empty.
     Tasks 1. Create an integer array representing seats.
              o 0 = Empty
              o 1 = Booked
           2. Allow user to:
              o Book a seat
              o Cancel booking
              o Display available seats */
    public static void main(String[] args) {
        // Step 1: Representing the seats
        int[] seats = new int[20];
        // All seats initialized to 0, empty
        // Step 2: Menu for user action
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n === Bus Booking System ===");
            System.out.println("1. Book a seat: ");
            System.out.println("2. Cancel booking");
            System.out.println("3. Display available seats");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1: // Book
                    System.out.print("Enter seat number(1-20): ");
                    int bookSeat = scanner.nextInt();
                    if (bookSeat < 1 || bookSeat > 20) {
                        System.out.println("Invalid seat numbers!");
                    } else if (seats[bookSeat - 1] == 1) {
                        System.out.println("Seat is already booked!");
                    } else {
                        seats[bookSeat - 1] = 1;
                        System.out.println("Seat " + bookSeat + " booked successfully.");
                    }
                    break;
                case 2: // Cancel
                    System.out.print("Enter seat number(1-20): ");
                    int cancelSeat = scanner.nextInt();
                    if (cancelSeat < 1 || cancelSeat > 20) {
                        System.out.println("Invalid seat numbers!");
                    } else if (seats[cancelSeat - 1] == 0) {
                        System.out.println("Seat is already empty!");
                    } else {
                        seats[cancelSeat - 1] = 0;
                        System.out.println("Booking for seat " + cancelSeat + " cancelled.");
                    }
                    break;
                case 3: // Display
                    System.out.println("Available seats: ");
                    for (int i = 0; i < seats.length; i++) {
                        if (seats[i] == 0) {
                            System.out.print("[ ] ");
                        } else {
                            System.out.print("[x] ");
                        }
                        if ((i + 1) % 5 == 0) System.out.println();
                    }
                    break;
                case 4: // Exit
                    System.out.println("Exiting... The Bus System.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}