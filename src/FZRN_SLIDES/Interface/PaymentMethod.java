package FZRN_SLIDES.Interface;

interface PaymentMethod {
    public void makePayment(double amount);
    public static boolean isValidAmount(double amount) {
        return amount > 0;
    }
}
class CreditCardPayment implements PaymentMethod {
    @Override
    public void makePayment(double amount) {
        if (PaymentMethod.isValidAmount(amount)) {
            System.out.println("Paid.");
        } else {
            System.out.println("Invalid amount.");
        }
    }

    public static void main(String[] args) {
        CreditCardPayment c = new CreditCardPayment();
        c.makePayment(-100);
        c.makePayment(100);
    }
}