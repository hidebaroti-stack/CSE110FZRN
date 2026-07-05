package SUDDIN.MID;

public class ShoppingBill {
    public static void main(String[] args) {

        int[] price = {500, 800, 1200};

        int total = 0;
        for (int i = 0; i < price.length; i++) {
            total += price[i];
            System.out.println("Individual Bill =  " + total);
        }
        System.out.println("total Bill = " + total);
    }
}