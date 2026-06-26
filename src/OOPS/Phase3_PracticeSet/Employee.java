package OOPS.Phase3_PracticeSet;

public abstract class Employee {
    private String name;

    Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract double calculateSalary();

    public void displayPayslip() {
        System.out.println("Employee: " + name + ", Salary: " + calculateSalary());
    }
}

class Manager extends Employee {
    private double baseSalary;
    private double bonus;

    Manager(String name, double baseSalary, double bonus) {
        super(name);
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + bonus;
    }
}

class Intern extends Employee {
    public double stipend;

    Intern(String name, double stipend) {
        super(name);
        this.stipend = stipend;
    }

    @Override
    public double calculateSalary() {
        return stipend;
    }
}
class EmployeeMain {
    public static void main(String[] args) {
        // ❌ This will not compile:
        // Employee e = new Employee("X");

        // ✅ Use subclasses instead: the way of accessing Abstract classes
        Employee manager = new Manager("Karan", 20_000, 5000);
        Employee intern = new Intern("Sneha", 10_000);

        manager.displayPayslip();
        intern.displayPayslip();
    }
}