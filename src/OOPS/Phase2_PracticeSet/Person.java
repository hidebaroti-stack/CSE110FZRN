package OOPS.Phase2_PracticeSet;

public class Person {
    private String name;
    private int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void introduce() {
        System.out.println("Hi I am " + name + ", I am " + age + " years old.");
    }
}

class Student extends Person {
    private String major;

    Student(String name, int age, String major) {
        super(name, age);
        this.major = major;
    }

    public void introduce() {
        super.introduce();
        System.out.println("My Major is  " + major);
    }
}
class Teacher extends Person {
    private String subject;

    Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    public void introduce() {
        super.introduce();
        System.out.println("I teach " + subject);
    }
}
class PersonMain {
    public static void main(String[] args) {
        Person p1 = new Student("Debaroti", 19, "CSE");
        Person p2 = new Teacher("FZRN", 30, "CSE110");

        p1.introduce();
        p2.introduce();
    }
}