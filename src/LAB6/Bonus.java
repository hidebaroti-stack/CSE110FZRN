package LAB6;

import java.util.Scanner;

public interface Bonus {
    double calculateBonus(double salary);
}
class Manager implements Bonus {
    @Override
    public double calculateBonus(double salary) {
        return salary * 20/100;
    }
}
class Developer implements Bonus {
    @Override
    public double calculateBonus(double salary) {
        return salary * 10/100;
    }
}
class BonusMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter employee name: ");
        String name = scanner.nextLine();

        System.out.print("Enter employee type (Manager/ Developer): ");
        String type = scanner.nextLine();

        System.out.print("Enter the employee salary: ");
        double salary = scanner.nextDouble();

        Bonus emp;

        if (type.equalsIgnoreCase("Manager")) {
            emp = new Manager();
        } else if (type.equalsIgnoreCase("Developer")) {
            emp = new Developer();
        } else {
            System.out.println("Invalid employee type!");
            return;
        }
        double bonus = emp.calculateBonus(salary);
        System.out.println("\nEmployee: " + name);
        System.out.println("Type: " + type);
        System.out.println("Salary: " + salary);
        System.out.println("Calculated Bonus: " + bonus);
    }
}
