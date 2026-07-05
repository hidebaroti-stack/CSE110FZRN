package SUDDIN.MID;

class OrderDetails {
    String customerName;
    int orderId;
    double foodBill;
    int deliveryDistance;

    OrderDetails(String customerName, int orderId,double foodBill, int deliveryDistance) {
        this.customerName = customerName;
        this.orderId = orderId;
        this.foodBill = foodBill;
        this.deliveryDistance = deliveryDistance;
    }
    double calculateDeliveryCharge() {
        if (foodBill > 1500) {
            return 0;
        } else if (deliveryDistance <= 3) {
            return 50;
        } else if (deliveryDistance <= 8) {
            return 80;
        } else {
            return 120;
        }
    }
    void displayOrder() {
        double deliveryCharge = calculateDeliveryCharge();
        System.out.println("Order ID: " + orderId);
        System.out.println("Customer: " + customerName);
        System.out.println("Food Bill: " + foodBill + " BDT");
        System.out.println("Distance: " + deliveryDistance + " km");
        System.out.println("Delivery Charge: " + deliveryCharge + " BDT");
        System.out.println("Total Payable: " + (foodBill + deliveryCharge) + " BDT");
    }
}

public class FoodGoDeliverySystem {
    //Q1. FoodGo Delivery System
    //FoodGo calculates delivery charges based on distance, with free delivery if the food bill exceeds 1500 BDT.
    //Within 3 km → 50 BDT
    //4–8 km → 80 BDT
    //Above 8 km → 120 BDT
    //Design a Java class to store order details (Customer Name, Order ID, Food Bill, Delivery Distance)
    //and implement the delivery charge policy.
    public static void main(String[] args) {
        OrderDetails order1 = new OrderDetails("Rahim", 101, 1200, 5);
        order1.displayOrder();
        System.out.println("============================");
        OrderDetails order2 = new OrderDetails("Karim", 102, 2000, 10);
        order2.displayOrder();
    }
}
