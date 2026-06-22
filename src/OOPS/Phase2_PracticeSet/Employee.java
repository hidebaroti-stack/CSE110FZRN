package OOPS.Phase2_PracticeSet;

public class Employee {
    private String name;
    private double baseSalary;

    Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public double calculateSalary() {
        return baseSalary;
    }

    public void displayPayslip() {
        System.out.println("Employee " + name + " salary is " + calculateSalary());
    }
}

class Manager extends Employee {
    private double bonus;

    Manager(String name, double baseSalary, double bonus) {
        super(name, baseSalary);
        this. bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + bonus;
    }
}

class SalesEmployee extends Employee {
    private double commissionRate;
    private int salesCount;

    SalesEmployee(String name, double baseSalary, double commissionRate, int salesCount) {
        super(name, baseSalary);
        this.commissionRate = commissionRate;
        this.salesCount = salesCount;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + (commissionRate * salesCount);
    }
}
class EmployeeMain {
    public static void main(String[] args) {
        Employee[] employee = {
                new Employee("Mohan", 10_000),
                new Manager("Karan", 20_000, 5000),
                new SalesEmployee("Sneha", 30_000, 50, 300)
        };

        double highestSalary = -Double.MAX_VALUE;
        String highestPaid = "";

        for (Employee employees : employee) {
            employees.displayPayslip();
            double salary = employees.calculateSalary();
            if (salary > highestSalary) {
                highestSalary = salary;
                highestPaid = employees.getName();
            }
        }

        System.out.println("HighestSalary salary is " + highestSalary + " earned by " + highestPaid + ".");
    }
}