package MID_PRACTICE.LAB5.SetB;

public class Person {
    String name;
    int age;

    Person(String name, int age) {
        System.out.println("Person constructor called.");
        this.name = name;
        this.age = age;
    }
}
class Employee extends Person {
    Employee(String name, int age) {
        super(name, age);
        System.out.println("Employee constructor called.");
    }
}
class PersonMain {
    public static void main(String[] args) {
        Person p = new Person("AA", 20);
        Employee e = new Employee("BB", 30);
        Person c = new Employee("CC", 40);
    }
}