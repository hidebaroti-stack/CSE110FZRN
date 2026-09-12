package SUDDIN.LAB2;

/* Problem 4: Taxi Fare Calculator Using Classes and Objects
Create a Java program that calculates the fare for a taxi ride based on the distance traveled,
using object-oriented programming principles (without a constructor).

Requirements:
1. Define a Taxi class with the following:
   ○ Private fields:
        - baseFare = 50 (fixed starting fare)
        - farePerKm = 10 (charge per kilometer)
   ○ A method calculateFare(int km) that computes the total fare:
        - If the distance is 10 km or less:
              fare = baseFare + (km * farePerKm)
        - If the distance is greater than 10 km:
              apply a 10% discount to the calculated fare.

2. Implement a TaxiFareCalculator class that contains the main method:
   ○ Take user input for the number of kilometers traveled.
   ○ Create a Taxi object.
   ○ Call calculateFare(km) and display the total fare.

Example Input/Output:
Enter distance traveled (km): 12
Total Fare: 128 (after 10% discount)

Enter distance traveled (km): 8
Total Fare: 130
*/


import java.util.Scanner;

class Taxi {
    private final int baseFare = 50;
    private final int farePerKm = 10;

    public int calculateFare(int km) {
        int totalFare = baseFare + (km * farePerKm);
        if (km > 10) totalFare = (int)(totalFare * 0.9);
        return totalFare;
    }

}
public class TaxiFareCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the distance travelled (km): ");
        int km = scanner.nextInt();

        Taxi taxi = new Taxi();
        int fare = taxi.calculateFare(km);

        System.out.println("Total Fare: " + fare + " BDT");
    }
}