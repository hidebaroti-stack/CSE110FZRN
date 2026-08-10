package OOPS.Phase8_PracticeSet.Practice;

public class NumberBox <T extends Number> {
    private T value;

    public NumberBox(T value) {
        this.value = value;
    }

    public double doubled() {
        return value.doubleValue() * 2;
    }

    public static void main(String[] args) {
        NumberBox<Integer> intBox = new NumberBox<>(5);
        NumberBox<Double> dblBox = new NumberBox<>(3.14);

        System.out.println(intBox.doubled());
        System.out.println(dblBox.doubled());
    }
}