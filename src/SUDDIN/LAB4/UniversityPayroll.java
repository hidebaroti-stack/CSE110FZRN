package SUDDIN.LAB4;

/* Problem 3: The University Payroll
Background:
At DIU University, the payroll system handles Faculty, Staff, and Teaching Assistants (TA).

Scenario:
All employees share basic info (name, ID, salary), but:
   • Faculty gets a research allowance.
   • Staff gets overtime pay.
   • TA (extends Staff) gets a semester bonus.

Task:
   • Create Employee base class with getMonthlyPay().
   • Override in subclasses for Faculty, Staff, and TA.
   • Add showDetails() method in parent and use super.showDetails() in child.
   • Print payroll summary for 3 employees.
*/
class Employee {
    private String name;
    private String id;
    protected double salary;

    Employee(String name, String id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public double getMonthlyPay() {
        return salary;
    }

    public void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Base Salary: " + salary);
    }
}

class Faculty extends Employee {
    private double researchAllowance;

    Faculty(String name, String id, double salary, double researchAllowance) {
        super(name, id, salary);
        this.researchAllowance = researchAllowance;
    }

    @Override
    public double getMonthlyPay() {
        return salary + researchAllowance;
    }

    @Override
    public void showDetails() {
        super.showDetails();
        System.out.println("Research Allowance: " + researchAllowance);
        System.out.println("Total Pay: " + getMonthlyPay());
    }
}
class Staffs extends Employee {
    private double overtimePay;

    Staffs(String name, String id, double salary, double overtimePay) {
        super(name, id, salary);
        this.overtimePay = overtimePay;
    }

    @Override
    public double getMonthlyPay() {
        return salary + overtimePay;
    }

    @Override
    public void showDetails() {
        super.showDetails();
        System.out.println("Overtime Pay: " + overtimePay);
        System.out.println("Total Pay: " + getMonthlyPay());
    }
}
class TA extends Staffs {
    private double semesterBonus;

    TA(String name, String id, double salary, double overtimePay, double semesterBonus) {
        super(name, id, salary, overtimePay);
        this.semesterBonus = semesterBonus;
    }

    @Override
    public double getMonthlyPay() {
        return super.getMonthlyPay() + semesterBonus;
    }

    @Override
    public void showDetails() {
        super.showDetails();
        System.out.println("Semester Bonus: " + semesterBonus);
        System.out.println("Total Pay: " + getMonthlyPay());
    }
}

public class UniversityPayroll {
    public static void main(String[] args) {
        Faculty faculty = new Faculty("Dr. Rahman", "F001", 50000, 10000);
        Staffs staff = new Staffs("Mr. Karim", "S001", 30000, 5000);
        TA ta = new TA("Debaroti", "T001", 20000, 3000, 2000);

        System.out.println("=== Payroll ===");
        faculty.showDetails();

        System.out.println();

        staff.showDetails();

        System.out.println();

        ta.showDetails();
    }
}
