package OOPS.Phase2_PracticeSet;

public class Vehicle {
    private String brand;
    private int speed;

    Vehicle(String brand, int speed){
        this.brand = brand;
        this.speed = speed;
    }
    public String getBrand() {
        return brand;
    }
    public int getSpeed() {
        return speed;
    }
    public void move() {
        System.out.println(brand + " is moving at " + speed + " km/h");
    }
    public String fuelType() {
        return "Unknown";
    }
}

class Car extends Vehicle{

    Car(String brand, int speed) {
        super(brand, speed);
    }
    public String fuelType() {
        return "Petrol";
    }
    public void honk() {
        System.out.println(getBrand() + " says: HONK honk!!");
    }
}

class ElectricCar extends Vehicle{

    ElectricCar(String brand, int speed) {
        super(brand, speed);
    }
    public String fuelType() {
        return "Electric";
    }
    public void chargeBattery() {
        System.out.println(getBrand() + " is changing its battery.");
    }
}

class Bicycle extends Vehicle{

    Bicycle(String brand, int speed) {
        super(brand, speed);
    }
    public String fuelType() {
        return "No fuel";
    }
    public void move() {
        System.out.println(getBrand() + " is being pedaled at " + getSpeed() + " km/h");
    }
}

class VehicleMain {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
                new Car("Toyota Corolla", 100),
                new ElectricCar("Tesla Model 3", 412),
                new Bicycle("Tour De France", 50)
        };
        for (Vehicle vehicle : vehicles) {
            vehicle.move();
            System.out.println("Fuel type: " + vehicle.fuelType());

            if (vehicle instanceof Car) {
                ((Car) vehicle).honk();
            } else if (vehicle instanceof ElectricCar) {
                ((ElectricCar) vehicle).chargeBattery();
            }

            System.out.println("----------------------------------------");
        }
    }
}