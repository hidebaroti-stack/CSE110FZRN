package SUDDIN.MID;

class HotelRoom {
    int guestID;
    String guestName;
    int days;
    double serviceCharge = 1000;

    HotelRoom(int guestID, String guestName, int days) {
        this.guestID = guestID;
        this.guestName = guestName;
        this.days = days;
    }

    double calculateBill() {
        return 0; // overridden in subclasses
    }
    void displayBill(String roomType, double roomRent, double discount, double finalBill) {
        System.out.println("Guest ID: " + guestID);
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Days Stayed: " + days);
        System.out.println("Room Rent: " + roomRent + " BDT");
        System.out.println("Discount: " + discount + " BDT");
        System.out.println("Service Charge: " + serviceCharge + " BDT");
        System.out.println("Final Payable: " + finalBill + " BDT");
    }
}

class StandardRoom extends HotelRoom {
    double rentPerDay = 2000;

    StandardRoom(int guestID, String guestName, int days) {
        super(guestID, guestName, days);
    }

    @Override
    double calculateBill() {
        double roomRent = rentPerDay * days;
        double discount = 0;
        if (days > 5) {
            discount = roomRent * ((double) 10 / 100);
            roomRent -= discount;
        }
        double finalBill = roomRent + serviceCharge;
        displayBill("Standard Room", roomRent, discount, finalBill);
        return finalBill;
    }
}

class DeluxeRoom extends HotelRoom {
    double rentPerDay = 3000;

    DeluxeRoom(int guestID, String guestName, int days) {
        super(guestID, guestName, days);
    }

    double calculateBill() {
        double roomRent = rentPerDay * days;
        double discount = 0;
        if (days > 5) {
            discount = roomRent * ((double) 10 / 100);
            roomRent -= discount;
        }
        double finalBill = roomRent + serviceCharge;
        displayBill("Deluxe Room", roomRent, discount, finalBill);
        return finalBill;
    }
}

public class UnityGrandPalaceHotel {
    //Q3. Unity Grand Palace Hotel (Inheritance)
    //Hotel billing rules:
    //Standard Room → 2000 BDT/day
    //Deluxe Room → 3000 BDT/day
    //Fixed service charge → 1000 BDT
    //Stay > 5 days → 10% discount on room rent
    //Design a program using Inheritance:
    //Parent class: HotelRoom (Guest ID, Guest Name, Days, Service Charge)
    //Subclasses: StandardRoom, DeluxeRoom
    //Override calculateBill() in subclasses.
    //Display complete guest bill with all details.
    public static void main(String[] args) {
        StandardRoom s1 = new StandardRoom(301, "Rahim", 4);
        s1.calculateBill();
        System.out.println("=======================");
        DeluxeRoom d1 = new DeluxeRoom(302, "Karim", 7);
        d1.calculateBill();
    }
}