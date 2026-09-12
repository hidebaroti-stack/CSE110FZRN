package SUDDIN.LAB4;

/* Problem 4: The Online Shop
Background:
You’re developing for ShopX, an e-commerce site. It sells both physical and digital products.

Scenario:
Common info: productName, price, and discount.
   • PhysicalProduct adds shipping cost.
   • DigitalProduct adds file size and has no shipping.
   • PremiumDigitalProduct (extends DigitalProduct) adds subscription renewal fee.

Task:
   • Create parent Product class with finalPrice() method.
   • Override it in subclasses with specific charges.
   • Show how the final amount changes per type.
*/

class Product {
    protected String productName;
    protected double price;
    protected double discount;

    Product(String productName, double price, double discount) {
        this.productName = productName;
        this.price = price;
        this.discount = discount;
    }

    public double finalPrice() {
        return price - discount;
    }

    public void showDetails() {
        System.out.println("Product: " + productName);
        System.out.println("Base Price: " + price);
        System.out.println("Discount: " + discount);
        System.out.println("Final Price: " + finalPrice());
    }
}

class PhysicalProduct extends Product {
    private double shippingCost;

    PhysicalProduct(String productName, double price, double discount, double shippingCost) {
        super(productName, price, discount);
        this.shippingCost = shippingCost;
    }

    @Override
    public double finalPrice() {
        return super.finalPrice() + shippingCost;
    }

    @Override
    public void showDetails() {
        super.showDetails();
        System.out.println("Shipping Cost: " + shippingCost);
        System.out.println("Total Price: " + finalPrice());
    }
}

class DigitalProduct extends Product {
    private double fileSize;

    DigitalProduct(String productName, double price, double discount, double fileSize) {
        super(productName, price, discount);
        this.fileSize = fileSize;
    }

    @Override
    public double finalPrice() {
        return super.finalPrice(); // no shipping
    }

    @Override
    public void showDetails() {
        super.showDetails();
        System.out.println("File Size: " + fileSize + " MB");
        System.out.println("Total Price: " + finalPrice());
    }
}

class PremiumDigitalProduct extends DigitalProduct {
    private double subscriptionFee;

    PremiumDigitalProduct(String productName, double price, double discount, double fileSize, double subscriptionFee) {
        super(productName, price, discount, fileSize);
        this.subscriptionFee = subscriptionFee;
    }

    @Override
    public double finalPrice() {
        return super.finalPrice() + subscriptionFee;
    }

    @Override
    public void showDetails() {
        super.showDetails();
        System.out.println("Subscription Fee: " + subscriptionFee);
        System.out.println("Total Price: " + finalPrice());
    }
}

public class TheOnlineShop {
    public static void main(String[] args) {
        PhysicalProduct phone = new PhysicalProduct("Smartphone", 30000, 2000, 500);
        DigitalProduct ebook = new DigitalProduct("E-Book", 1000, 200, 5);
        PremiumDigitalProduct musicApp = new PremiumDigitalProduct("Music App", 2000, 500, 100, 300);

        System.out.println("=== Online Shop Summary ===");
        phone.showDetails();
        System.out.println();
        ebook.showDetails();
        System.out.println();
        musicApp.showDetails();

    }
}
