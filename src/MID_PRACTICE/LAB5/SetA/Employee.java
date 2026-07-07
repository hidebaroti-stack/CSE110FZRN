package MID_PRACTICE.LAB5.SetA;

public class Employee {
    String name;
    double baseSalary;

    Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }
    double calculateBonus() {
        return 0;
    }
}

class Manager extends Employee {
    final double BONUS_RATE = 0.15;

    Manager(String name, double baseSalary) {
        super(name, baseSalary);
    }
     double calculateBonus() {
         return baseSalary * BONUS_RATE;
     }
}

class Intern extends Employee {
    final double FLAT = 500;

    Intern(String name, double baseSalary) {
        super(name, baseSalary);
    }

    @Override
    double calculateBonus() {
       return FLAT;
    }
}

class EmployeeMain {
    public static void main(String[] args) {
        Employee[] employees = {
                new Manager("Karan", 80_000),
                new Intern("Sneha", 12_000)
        };
        for (Employee employee : employees) {
            System.out.println("Bonus: " + employee.calculateBonus());
        }
    }
}