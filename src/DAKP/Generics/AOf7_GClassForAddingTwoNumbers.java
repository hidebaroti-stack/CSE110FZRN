package DAKP.Generics;

/**
 * Create a generic class AddNumbers<T extends Number>.
 * Store two numbers of type T.
 * Add them using doubleValue() (since Number can be converted to double).
 * Test with Integer and Double.
 */

class AddNumbers<T extends Number> {
    private T num1;
    private T num2;

    public AddNumbers(T num1, T num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double add() {
        return num1.doubleValue() + num2.doubleValue();
    }
}

public class AOf7_GClassForAddingTwoNumbers {
    public static void main(String[] args) {
        AddNumbers<Integer> intAdd = new AddNumbers<>(10, 20);
        System.out.println("Sum of Integer: " + intAdd.add());

        AddNumbers<Double> doubleAdd = new AddNumbers<>(5.5, 4.5);
        System.out.println("Sum of Doubles: " + doubleAdd.add());
    }
}