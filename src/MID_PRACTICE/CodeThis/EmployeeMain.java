package MID_PRACTICE.CodeThis;

abstract class Employee {
    String name;

    Employee(String name) {
        this.name = name;
    }

    abstract double calculateSalary();

    void displayInfo() {
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: " + calculateSalary());
    }
}

class FullTimeEmployee extends Employee {

    FullTimeEmployee(String name) {
        super(name);
    }
    @Override
    double calculateSalary() {
        return 50000;
    }
}

class PartTimeEmployee extends Employee {
    int hoursWorked;

    PartTimeEmployee(String name, int hoursWorked) {
        super(name);
        this.hoursWorked = hoursWorked;
    }
    @Override
    double calculateSalary() {
        return hoursWorked * 200;
    }
}

public class EmployeeMain {
    //Create an abstract class Employee with abstract method calculateSalary() and a concrete method displayInfo() that prints name and the result of calculateSalary().
    //Create FullTimeEmployee (fixed 50000) and PartTimeEmployee (hoursWorked × 200). Test both via an Employee reference array.
    public static void main(String[] args) {
        Employee[] emp = {new FullTimeEmployee("Karan"), new PartTimeEmployee("Sneha", 6)};

        for (Employee e : emp) {
            e.displayInfo();
        }
    }
}