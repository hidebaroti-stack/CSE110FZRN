package SUDDIN.MID;

class Purchase {
    String customerName;
    int invoiceNumber;
    String medicineName;
    double unitPrice;
    int quantity;

    Purchase(String customerName, int invoiceNumber, String medicineName, double unitPrice, int quantity) {
        this.customerName = customerName;
        this.invoiceNumber = invoiceNumber;
        this.medicineName = medicineName;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    double calculateBill() {
        double bill = unitPrice * quantity;
        if (bill > 3000) {
           bill = bill - bill * ((double) 10 / 100);
        }
        bill = bill + (bill * ((double) 5 / 100));
        bill = bill + 100;
        return bill;
    }

    void displayInvoice() {
        double bill = calculateBill();
        System.out.println("Customer name: " + customerName);
        System.out.println("Invoice number: " + invoiceNumber);
        System.out.println("Medicine name: " + medicineName);
        System.out.println("Unit price: " + unitPrice);
        System.out.println("Quantity: " + quantity);
        System.out.println("Payable amount: " + bill + " BDT");
    }
}

public class HealthCarePharmacyBillingSystem {
    //Q2. HealthCare Pharmacy Billing
    //Pharmacy-billing rules:
    //Bill = Unit Price × Quantity
    //If bill > 3000 BDT → 10% discount
    //Add 5% VAT + fixed service charge of 100 BDT
    //Design a Java class to store purchase info (Customer Name, Invoice Number, Medicine Name, Unit Price, Quantity) and calculate/display the final invoice.
    public static void main(String[] args) {
        Purchase p1 = new Purchase("Rahim", 201, "Paracetamol", 50, 20);
        p1.displayInvoice();
        System.out.println("============================");
        Purchase p2 = new Purchase("Karim", 202, "Histacin", 400, 10);
        p2.displayInvoice();

    }
}