package SUDDIN.LAB1;

public class SalaryCalculation {
    //7. Salary Calculation
    //Story:
    //An employee earns 30,000 BDT per month. He gets a bonus of 15% of his salary.
    //Task:
    //Write a Java program to calculate total salary including bonus.
    //Formula:
    //Bonus = Salary × 15 / 100
    //Total Salary = Salary + Bonus
    public static void main(String[] args) {
        final double Salary = 30_000;
        final double bonusRate = 15;

        System.out.println("Salary: " + Salary + " BDT per month");

        double Bonus = Salary * bonusRate / 100;

        double TotalSalary = Salary + Bonus;

        System.out.println("Total Salary: " + TotalSalary);
    }
}