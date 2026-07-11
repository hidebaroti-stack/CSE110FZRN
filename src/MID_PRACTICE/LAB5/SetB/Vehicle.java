package MID_PRACTICE.LAB5.SetB;

public class Vehicle {
    int speed = 50;

    double getSpeed() {
        return speed;
    }

}
class SportsCar extends Vehicle {
    int speed = 200;
    @Override
    double getSpeed() {
        return speed;
    }
}
// field access is resolved by reference type, method calls by object type
class VehicleMain {
    public static void main(String[] args) {
        Vehicle v = new SportsCar();
        System.out.println(v.speed);
        System.out.println(v.getSpeed());
    }
}