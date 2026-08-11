package FZRN_SLIDES.Interface;

public interface Bank {
    public static final double INTEREST_RATE = 5.5;
    void showInterestRate();
    public static void main(String[] args) {
        CityBank b = new CityBank();
        b.showInterestRate();
    }
}
class CityBank implements Bank {
    public void showInterestRate() {
        System.out.println("Bank interest rate is: " + INTEREST_RATE + "%");
    }
}