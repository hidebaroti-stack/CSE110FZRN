package OOPS.Phase4_PracticeSet;

// Build a small Java system that models people using OOP.
// At the center is you — "Debaroti" — represented as a class that is both a student and a performing artist.
// The system should demonstrate all four pillars of OOP working together.

// Part 1: The Abstract Base: Person
abstract class Person {
    private String name;
    private int age;
    private static int totalPersons = 0;

    Person(String name, int age) {
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
interface Performer {
    void perform();
}

interface Learner {
    void study(String subject);
}

// Part 3: The Core Class: StudentArtist
class StudentArtist extends Person implements Performer, Learner {
    private String university;
    private double cgpa;
    private String[] instruments;
    private static final double SCHOLARSHIP_THRESHOLD = 3.90;

    StudentArtist(String name, int age, String university, double cgpa, String[] instruments) {
        super(name, age);
        this.university = university;
        this.cgpa = cgpa;
        this.instruments = instruments;
    }
    // Overriding toString()
    @Override
    public String toString() {
        return "StudentArtist{name='" + getName() + "', age=" + getAge() +
                ", university='" + university + "', cgpa=" + cgpa + "}";
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
class Professional extends Person {
    private String company;
    private double salary;

    Professional(String name, int age, String company, double salary) {
        super(name, age);
        this.company = company;
        this.salary = salary;
    }
    // Overriding toString()
    @Override
    public String toString() {
        return "Professional{name='" + getName() + "', age=" + getAge() +
                ", company='" + company + "', salary=" + salary + "}";
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
public class toStringOverrideInProject {
    public static void main(String[] args) {
        // 1. Create your StudentArtist object (me!)
        String[] instruments = {"Guitar", "Harmonium", "Ukulele"};
        StudentArtist deb = new StudentArtist("Debaroti", 19, "East West University", 3.92, instruments);

        // 2. Create one or two Professional objects
        Professional pro1 = new Professional("Karan", 30, "Brain Station 23", 75_000);
        Professional pro2 = new Professional("Sneha", 25, "BKash", 80_000);

        System.out.println("====================================== CHECKING toSTRING() ===========================================");
        System.out.println(deb);
        System.out.println(pro1);
        System.out.println(pro2);
        System.out.println("======================================================================================================");

        // 3. Store them in a Person[] array
        Person[] person = {deb, pro1, pro2};

        // 4. Loop through and call introduce() polymorphically
        System.out.println("=== Introductions ===");
        for (Person persons : person) {
            persons.introduce(); // different output depending on subclass
        }

        // Use promote method
        System.out.println("\n=== Promotions ===");
        pro1.promote(5000);
        pro2.promote(10_000);

        // 5. Call perform() and study() directly on StudentArtist
        System.out.println("\n=== StudentArtist Capabilities ===");
        deb.perform();
        deb.study("Data Structures");

        // 6. Check scholarship eligibility
        deb.checkScholarshipEligibility();

        // 7. Celebrate birthday (shows both super + overridden behavior)
        deb.celebrateBirthday();

        // 8. Print total persons created
        System.out.println("\nTotal Persons created: " + Person.getTotalPersons());
    }
}