package FINAL_PRACTICE;

import java.util.Scanner;

public class Car {
    String model;
    Car (String model) { this.model = model; }
    class Engine {
        void start() {
            System.out.println(model + "'s engine started.");
        }
    }
}
class CarMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Model: ");
        String model = scanner.next();

        Car c = new Car(model);
        Car.Engine e = c.new Engine();
        e.start();
    }
}