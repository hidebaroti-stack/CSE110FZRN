package SUDDIN.LAB1;

public class DistanceTravelled {
    //6. Distance Traveled
    //Story:
    //A car moves with a speed of 60 km/h for 3 hours.
    //Task:
    //Write a Java program to calculate the total distance.
    //Formula:
    //Distance = Speed × Time
    public static void main(String[] args) {
        final double Speed = 60;
        final double Time = 3;

        System.out.println("Speed: " + Speed + " km/h");
        System.out.println("Time: " + Time + " hours");

        double Distance = Speed * Time;

        System.out.println("Distance = " + Distance);
    }
}