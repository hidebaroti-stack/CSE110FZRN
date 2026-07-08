package SUDDIN.LAB4;

class Ride {
    protected String ID;
    protected double distance;
    protected double farePerKm = 10;

    Ride(String ID, double distance, double farePerKm) {
        this.ID = ID;
        this.distance = distance;
        this.farePerKm = farePerKm;
    }

    double calculateFare() {
        return distance * farePerKm;
    }

    void showReport(String type, double totalFare) {
        System.out.println("Ride Type: " + type);
        System.out.println("Distance: " + distance + " km");
        System.out.println("Total Fare: " + totalFare + " Tk");
        System.out.println("-----------------------------------");
    }
}

class Car extends Ride {
    private double parkingFee;

    Car (String ID, double distance, double farePerKm, double parkingFee){
        super(ID, distance, farePerKm);
        this.parkingFee = parkingFee;
    }

    @Override
    double calculateFare() {
        return super.calculateFare() + parkingFee;
    }
}

class Bike extends Ride {

    Bike (String ID, double distance, double farePerKm) {
        super(ID, distance, farePerKm);
    }

    @Override
    double calculateFare() {
        double baseFare = super.calculateFare();
        if (distance < 5) {
            baseFare = baseFare * 0.9;
        }
        return baseFare;
    }
}

class ElectricScooter extends Ride {

    ElectricScooter(String rideId, double distance, double farePerKm) {
        super(rideId, distance, farePerKm);
    }

    @Override
    double calculateFare() {
        double baseFare = super.calculateFare();
        double ecoTax = baseFare * 0.05;
        return baseFare + ecoTax;
    }
}

public class TheCityRideApp {
    public static void main(String[] args) {
        Car carRide = new Car("C101", 10, 20, 50);
        Bike bikeRide = new Bike("B202", 4, 15);
        ElectricScooter scooterRide = new ElectricScooter("E303", 8, 12);

        double carFare = carRide.calculateFare();
        double bikeFare = bikeRide.calculateFare();
        double scooterFare = scooterRide.calculateFare();

        carRide.showReport("Car", carFare);
        bikeRide.showReport("Bike", bikeFare);
        scooterRide.showReport("Electric Scooter", scooterFare);
    }
}
