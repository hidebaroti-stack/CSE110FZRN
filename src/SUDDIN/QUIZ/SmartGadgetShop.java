package SUDDIN.QUIZ;


/*
    EAST WEST UNIVERSITY
    Department of Computer Science and Engineering
    Course: CSE 110 Object Oriented Programming, Section-15
    Instructor: Md Salah Uddin, Adjunct Faculty
    Class Test I, Summer 2026 Semester
    Full Marks: 10, Exam Time: 30 Minutes

    Question:
    Smart Gadget Shop wants a simple program using Object-Oriented Programming (OOP)
    to calculate a customer’s bill. A customer buys different products with quantities
    and fixed prices per unit.

    Product Information:
    - Smartphone → 25,000 BDT per unit
    - Headphones → 2,000 BDT per unit
    - Power Bank → 3,500 BDT per unit

    VAT Rule:
    - 10% VAT is applied on the total product cost (before VAT)

    Task:
    Write a Java program using OOP (classes and objects) to calculate and display the total bill.

    Sample Input:
    Enter Customer Name: Rahim
    Enter Smartphone Quantity: 1
    Enter Headphone Quantity: 2
    Enter Power Bank Quantity: 1

    Sample Output:
    Customer Name: Rahim
    Smartphone Cost: 25000 BDT
    Headphones Cost: 4000 BDT
    Power Bank Cost: 3500 BDT

    Product Total: 32500 BDT
    VAT (10%): 3250 BDT
    Total Payable: 35750 BDT
*/

import java.util.Scanner;

class Product {
    private String name;
    private int unitPrice;

    public Product(String name, int unitPrice) {
        this.name = name;
        this.unitPrice = unitPrice;
    }
    public int calculateCost(int quantity) {
        return unitPrice * quantity;
    }

    public String getName() {
        return name;
    }

    public int getUnitPrice() {
        return unitPrice;
    }
}

class CustomerBill {
    private String customerName;
    private int smartphone;
    private int headphone;
    private int powerbank;

    private Product smartPhone = new Product("Smartphone", 25000);
    private Product headPhone = new Product("Headphone", 2000);
    private Product powerBank = new Product("Power Bank", 3500);

    public CustomerBill(String customerName, int smartphone, int headphone, int powerbank) {
        this.customerName = customerName;
        this.smartphone = smartphone;
        this.headphone = headphone;
        this.powerbank = powerbank;
    }

    public void printBill() {
        int smartphoneCost = smartPhone.calculateCost(smartphone);
        int headphoneCost = headPhone.calculateCost(headphone);
        int powerbankCost = powerBank.calculateCost(powerbank);

        int productTotal = smartphoneCost + headphoneCost + powerbankCost;
        double vat = productTotal * 0.10;
        double totalPayable = productTotal + vat;

        System.out.println("\nCustomer Name: " + customerName);
        System.out.println(smartPhone.getName() + " Cost: " + smartphoneCost + " BDT");
        System.out.println(headPhone.getName() + " Cost: " + headphoneCost + " BDT");
        System.out.println(powerBank.getName() + " Cost: " + powerbankCost + " BDT");

        System.out.println("\nProduct Total: " + productTotal + " BDT");
        System.out.println("VAT (10%): " + vat + " BDT");
        System.out.println("Total Payable: " + totalPayable + " BDT");
    }
}

public class SmartGadgetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Customer Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Smartphone Quantity: ");
        int smartphones = scanner.nextInt();

        System.out.print("Enter Headphone Quantity: ");
        int headphones = scanner.nextInt();

        System.out.print("Enter Power Bank Quantity: ");
        int powerbanks = scanner.nextInt();

        CustomerBill bill = new CustomerBill(name, smartphones, headphones, powerbanks);
        bill.printBill();

    }
}