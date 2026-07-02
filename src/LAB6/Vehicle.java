package LAB6;

public interface Vehicle {
    void changeGear(int gear);
    void speedUp(int increment);
    void applyBreak(int decrement);
}
class Bicycle implements Vehicle {
    int speed = 0;
    int gear = 1;

    @Override
    public void changeGear(int gear) {
        this.gear = gear;
        System.out.println("Bicycle gear changed to: " + gear);
    }
    @Override
    public void speedUp(int increment) {
        speed += increment;
        System.out.println("Bicycle speed increased to: " + speed + "km/h");
    }
    @Override
    public void applyBreak(int decrement) {
        speed -= decrement;
        if (speed < 0) speed = 0;
        System.out.println("Bicycle speed decreased to: " + speed + "km/h");
    }
}
class VehicleMain {
    public static void main(String[] args) {
        Vehicle vehicle = new Bicycle();

        vehicle.changeGear(3);
        vehicle.speedUp(15);
        vehicle.applyBreak(16);
    }
}