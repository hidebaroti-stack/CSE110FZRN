package MID_PRACTICE.CodeThis;

public class Vehicle {
    String brand;
    int speed;

    Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }
    @Override
    public String toString() {
        return "Brand: " + brand + ", Speed: " + speed;
    }
}
class Car extends Vehicle {
    int numDoors;

    Car(String brand, int speed, int numDoors) {
        super(brand, speed);
        this.numDoors = numDoors;
    }
    @Override
    public String toString() {
        return "Brand: " + brand + ", Speed: " + speed + ", Doors: " + numDoors;
    }
}
class VehicleMain {
    //Create Vehicle with brand and speed. Create Car extends Vehicle adding numDoors.
    //Use super() in Car's constructor. Override toString() — not a custom display() — so System.out.println(carObject) prints all three fields directly.
    public static void main(String[] args) {
        Vehicle v = new Vehicle("Toyota", 120);
        Car c = new Car("Honda", 150, 4);

        System.out.println(v); // calls Vehicle.toString()
        System.out.println(c); // calls Car.toString()
    }
}