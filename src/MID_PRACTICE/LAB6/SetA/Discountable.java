package MID_PRACTICE.LAB6.SetA;

interface Discountable {
    double applyDiscount(double price);
}
class RegularCustomer implements Discountable {
    @Override
    public double applyDiscount(double price) {
        return price - (price * 0.05);
    }
}
class PremiumCustomer implements Discountable {
    @Override
    public double applyDiscount(double price) {
        return price - (price * 0.15);
    }
}
class DiscountableMain {
    public static void main(String[] args) {
        Discountable r = new RegularCustomer();
        System.out.println("Discount: " + r.applyDiscount(2000));
        Discountable p = new PremiumCustomer();
        System.out.println("Discount: " + p.applyDiscount(5000));
    }
}