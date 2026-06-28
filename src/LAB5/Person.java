package LAB5;

import java.util.Scanner;

public class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("This person is " + name + " and they're " + age + " years old.");
    }
}

class Employee extends Person {
    double salary;

    Employee(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    void display() {
        System.out.println("This person is " + name + " who is an Employee being "+ age + " years old and of salary " + salary);
    }
}

class EmployeeMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the name of the employee: ");
        String name = scanner.next();

        System.out.print("Enter the age of the employee: ");
        int age = scanner.nextInt();

        System.out.print("Enter the salary of the employee: ");
        double salary = scanner.nextDouble();

        Person person = new Employee(name, age, salary);

        person.display();

    }
}