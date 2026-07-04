package MID_PRACTICE.LAB4.SetA;

public class Pizza {
    String size;
    int toppingCount;

    Pizza() {
        size = "Medium";
        toppingCount = 0;
        System.out.println("Pizza size: " + this.size + " & topping count: " + this.toppingCount);
    }
    Pizza(String size) {
        this.size = size;
        toppingCount = 1;
        System.out.println("Pizza size: " + this.size + " & topping count: " + this.toppingCount);
    }
    Pizza(String size, int toppingCount) {
       this.size = size;
       this.toppingCount = toppingCount;
        System.out.println("Pizza size: " + this.size + " & topping count: " + this.toppingCount);
    }
}

class PizzaMain {
    public static void main(String[] args) {
        Pizza p1 = new Pizza();
        Pizza p2 = new Pizza("Small");
        Pizza p3 = new Pizza("Extra Large", 2);
    }
}