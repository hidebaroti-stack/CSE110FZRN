package FZRN_SLIDES.Generics.Exercise;

class Box<T> {
    T value;
    void setValue(T value) { this.value = value; }
    T getValue() { return value; }
}
public class Test2 {
    public static void main(String[] args) {
        Box<Integer> intBox = new Box<>();
        // intBox.setValue("Test"); // EROOR needs Integer
        intBox.setValue(123);

        System.out.println(intBox.getValue());
    }
}
