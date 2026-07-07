package MID_PRACTICE.LAB4.SetB;

public class Employee {
    String name;
    double salary;

    Employee() {
        this("Unknown", 0.0); // avoids code duplication
    }

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        System.out.println("Employee's name: " + name + " & salary: " + salary);
    }
}

class EmployeeMain {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        Employee employee2 = new Employee("Karan", 50_000);
    }
}