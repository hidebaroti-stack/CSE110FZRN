package LAB5;

public class Vehicle {
    int speed;
    int fuelCapacity;

    Vehicle(int speed, int fuelCapacity) {
        this.speed = speed;
        this.fuelCapacity = fuelCapacity;
    }
    public void displayInfo() {
        System.out.println("Speed: " + speed + "km/h. Fuel Capacity: " + fuelCapacity + " litres.");
    }
}

class Car extends Vehicle {

    Car(int speed, int fuelCapacity) {
        super(speed, fuelCapacity);
    }
    @Override
    public void displayInfo() {
        System.out.println("Car -> Speed: " + speed + " km/h, Fuel Capacity: " + fuelCapacity + " liters.");
    }
}

class Bike extends Vehicle {

    Bike(int speed, int fuelCapacity) {
        super(speed, fuelCapacity);
    }

    public void displayInfo() {
        System.out.println("Bike -> Speed: " + speed + " km/h, Fuel Capacity: " + fuelCapacity + " liters.");
    }
}

class MainVehicle {
    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle(180, 30);
        Car mycar = new Car(100, 50);
        Bike myBike = new Bike(120, 15);

        vehicle.displayInfo();
        mycar.displayInfo();
        myBike.displayInfo();

    }
}