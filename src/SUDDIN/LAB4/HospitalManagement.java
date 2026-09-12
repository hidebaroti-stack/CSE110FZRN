package SUDDIN.LAB4;

import java.util.ArrayList;
import java.util.List;

/* Problem 5: Hospital Management
Background:
You are designing a system for CareWell Hospital. They employ doctors, nurses, and interns.

Scenario:
   • All staff have name, ID, and department.
   • Doctor can prescribe medicine and has consultation fees.
   • Nurse can assist and has shift hours.
   • Intern (extends Doctor) can prescribe only basic medicines and gets a stipend instead of full fees.

Task:
   • Create Staff base class with showInfo().
   • Extend Doctor, Nurse, and Intern with their specific duties and pay.
   • Show polymorphic behavior using a List<Staff> where each staff’s calculatePay() runs differently.
*/

abstract class Staff {
    protected String name;
    protected String id;
    protected String department;

    Staff(String name, String id, String department) {
        this.name = name;
        this.id = id;
        this.department = department;
    }

    public abstract double calculatePay();

    public void showInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Department: " + department);
    }
}

class Doctor extends Staff {
    private double consultationFee;

    Doctor(String name, String id, String department, double consultationFee) {
        super(name, id, department);
        this.consultationFee = consultationFee;
    }

    @Override
    public double calculatePay() {
        return consultationFee;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Role: Doctor");
        System.out.println("Consultation Fee: " + consultationFee);
        System.out.println("Total Pay: " + calculatePay());
    }
}

class Nurse extends Staff {
    private int shiftHours;
    private double hourlyRate;

    Nurse(String name, String id, String department, int shiftHours, double hourlyRate) {
        super(name, id, department);
        this.shiftHours = shiftHours;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculatePay() {
        return shiftHours * hourlyRate;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Role: Nurse");
        System.out.println("Shift Hours: " + shiftHours);
        System.out.println("Hourly Rate: " + hourlyRate);
        System.out.println("Total Pay: " + calculatePay());
    }
}

class Intern extends Doctor {
    private double stipend;

    Intern(String name, String id, String department, double stipend) {
        super(name, id, department, 0); // interns don’t get consultation fees
        this.stipend = stipend;
    }

    @Override
    public double calculatePay() {
        return stipend;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Role: Intern");
        System.out.println("Stipend: " + stipend);
        System.out.println("Total Pay: " + calculatePay());
    }
}

public class HospitalManagement {
    public static void main(String[] args) {
        List<Staff> staffList = new ArrayList<>();
        staffList.add(new Doctor("Dr. Ahsan", "D001", "Cardiology", 5000));
        staffList.add(new Nurse("Nurse Rina", "N001", "Emergency", 8, 300));
        staffList.add(new Intern("Debaroti", "I001", "Pediatrics", 2000));

        System.out.println("=== Hospital Staff Payroll ===");
        for (Staff s : staffList) {
            s.showInfo();
            System.out.println();
        }

    }
}