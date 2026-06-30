package SUDDIN.LAB1;

public class SimpleInterestCalculation {
    //3. Simple Interest Calculation
    //Story:
    //A person deposits 10,000 BDT in a bank with an annual interest rate of 5% for 2 years.
    //Task:
    //Write a Java program to calculate simple interest.
    //Formula:
    //Simple Interest = (Principal × Rate × Time) / 100
    public static void main(String[] args) {
        final double Principal = 10_000;
        final double Rate = 5;
        final double Time = 2;

        System.out.println("Deposit: " + Principal + " BDT");
        System.out.println("Interest rate: " + Rate + "%");
        System.out.println("Time: " + Time + " years");

        double SimpleInterest = (Principal * Rate * Time) / 100;

        System.out.println("Simple Interest = " + SimpleInterest);
    }
}