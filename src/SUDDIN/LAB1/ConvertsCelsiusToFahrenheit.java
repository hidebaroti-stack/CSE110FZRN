package SUDDIN.LAB1;

public class ConvertsCelsiusToFahrenheit {
    //4. Convert Celsius to Fahrenheit
    //Story:
    //A weather app shows temperature in Celsius. Today it is 30°C. The user wants to convert it to Fahrenheit.
    //Task:
    //Write a Java program to convert temperature.
    //Formula:
    //F = (C × 9/5) + 32
    public static void main(String[] args) {
        final double C = 30;

        System.out.println("Temperature in Celsius: " + C + "°C");

        double F = (C * 9/5) + 32;

        System.out.println("Temperature in Fahrenheit: " + F + "°F");
    }
}