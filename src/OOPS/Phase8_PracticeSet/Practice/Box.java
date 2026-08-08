package OOPS.Phase8_PracticeSet.Practice;

public class Box<T> {
    private T value;

    public Box(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
    @Override
    public String toString() {
        return "Box[" + value + "]";
    }
}
class BoxTest {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>("Hello");
        Box<Integer> intBox = new Box<>(42);
        Box<Double> doubleBox = new Box<>(3.1416);

        System.out.println(stringBox.getValue());
        System.out.println(intBox.getValue());
        System.out.println(doubleBox.getValue());

        stringBox.setValue("Updated");
        System.out.println(stringBox);

        System.out.println(intBox);
        System.out.println(doubleBox);
    }
}