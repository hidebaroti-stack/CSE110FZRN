package FZRN_SLIDES.Polymorphism;

public class Employee {
    double getSalary() {
        return 0;
    }
}
class Manager extends Employee {
    @Override
    double getSalary() {
        return 80000;
    }
}
class Developer extends Employee {
    @Override
    double getSalary() {
        return 60000;
    }
}
class Company {
    public static void main(String[] args) {
        Employee emp1 = new Manager();
        Employee emp2 = new Developer();

        System.out.println("Manager Salary: " + emp1.getSalary());
        System.out.println("Developer Salary: " + emp2.getSalary());
    }
}