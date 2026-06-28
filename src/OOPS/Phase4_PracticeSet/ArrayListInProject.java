package OOPS.Phase4_PracticeSet;

// Build a small Java system that models people using OOP.
// At the center is you — "Debaroti" — represented as a class that is both a student and a performing artist.
// The system should demonstrate all four pillars of OOP working together.

import java.util.ArrayList;

// Part 1: The Abstract Base: Person
abstract class Persons {
    private final String name;
    private int age;
    private static int totalPersons = 0;

    Persons(String name, int age) {
        this.name = name;
        this.age = age;

        totalPersons++;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public abstract void introduce();

    public void celebrateBirthday() {
        age++;
        System.out.println(name + " turned " + age + "! HAPPY BIRTHDAY 🎂");
    }

    static int getTotalPersons() {
        return totalPersons;
    }
}

// Part 2: The Interfaces (Capabilities)
interface Performers {
    void perform();
}

interface Learners {
    void study(String subject);
}

// Part 3: The Core Class: StudentArtist
class StudentArtists extends Persons implements Performers, Learners {
    private final String university;
    private double cgpa;
    private final String[] instruments;
    private static final double SCHOLARSHIP_THRESHOLD = 3.90;

    StudentArtists(String name, int age, String university, double cgpa, String[] instruments) {
        super(name, age);
        this.university = university;
        this.cgpa = cgpa;
        this.instruments = instruments;
    }
    @Override
    public void introduce() {
        System.out.println("Hi! I am " + getName() +
                ", my age " + getAge() +
                " and my University is " + university + ".");
    }

    public void perform() {
        for (String instrument : instruments) {
            System.out.println(getName() + " is performing with the " + instrument + ".");

        }
    }

    public void study(String subject) {
        System.out.println(getName() + " is studying " + subject + ".");
        cgpa += 0.05;
        if (cgpa > 4) cgpa = 4.0;
        System.out.printf("Updated CGPA: %.2f%n", cgpa);
    }

    public void checkScholarshipEligibility() {
        if (cgpa >= SCHOLARSHIP_THRESHOLD) {
            System.out.println(getName() + " is eligible for scholarship!");
        } else {
            System.out.println(getName() + " is not eligible for scholarship.");
        }
    }

    public void celebrateBirthday() {
        super.celebrateBirthday();
        System.out.println(getName() + " is a student-artist, celebrating with music and friends!");
    }
}

// Part 4: A Second Subclass for Contrast: Professional
class Professionals extends Persons {
    private final String company;
    private double salary;

    Professionals(String name, int age, String company, double salary) {
        super(name, age);
        this.company = company;
        this.salary = salary;
    }
    @Override
    public void introduce() {
        System.out.println("Hello, I am " + getName() + ", " + getAge() + " years old, working at " + company + " with a salary of " + salary);

    }

    public void promote(double raise) {
        salary += raise;
        System.out.println(getName() + " got a raise! New Salary: " + salary);
    }
}
// Part 5: Main class
public class ArrayListInProject {
    public static void main(String[] args) {
        // Create your StudentArtist object (me!)
        String[] instruments = {"Guitar", "Harmonium", "Ukulele"};

        // Store them in a Persons ArrayList
        ArrayList<Persons> personsArrayList = new ArrayList<>();
        personsArrayList.add(new StudentArtists("Debaroti", 19, "East West University", 3.92, instruments));
        personsArrayList.add(new Professionals("Karan", 30, "Brain Station 23", 75_000));

        // Loop through and call introduce() polymorphically
        System.out.println("=== Introductions ===");
        for (Persons persons : personsArrayList) {
            persons.introduce(); // different output depending on subclass
        }
        System.out.println("Total people: " + personsArrayList.size());

        // Adding new person to show ArrayList being resizable
        personsArrayList.add(new Professionals("Sneha", 25, "BKash", 80_000));

        // Loop through and call introduce() polymorphically
        System.out.println("=== Introductions After Adding More ===");
        for (Persons persons : personsArrayList) {
            persons.introduce(); // different output depending on subclass
        }
        System.out.println("Total people: " + personsArrayList.size());

        // Promotions: filter only Professionals
        System.out.println("\n=== Promotions ===");
        for (Persons persons : personsArrayList) {
            if (persons instanceof Professionals) {
                ((Professionals) persons).promote(5000);
            }
        }

        // StudentArtist capabilities
        System.out.println("\n=== StudentArtist Capabilities ===");
        for (Persons persons : personsArrayList) {
            if (persons instanceof StudentArtists) {
                StudentArtists studentArtists = (StudentArtists) persons;
                studentArtists.perform();
                studentArtists.study("Data Structures");
                studentArtists.checkScholarshipEligibility();
                studentArtists.celebrateBirthday();
            }
        }
        // Print total persons created
        System.out.println("\nTotal Persons created: " + Persons.getTotalPersons());
    }
}