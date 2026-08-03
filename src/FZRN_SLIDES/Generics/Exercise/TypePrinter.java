package FZRN_SLIDES.Generics.Exercise;

public class TypePrinter<T> {
    T value;
    TypePrinter(T value) {
        this.value = value;
    }
    void printInfo() {
        if (value instanceof Integer) {
            System.out.println("Integer: " + ((Integer) value + 1));
        } else if (value instanceof String) {
            System.out.println("String: " + ((String) value).toUpperCase());
        } else {
            System.out.println("Unknown type");
        }
    }
}
class toTest {
    public static void main(String[] args) {
        TypePrinter<Integer> t1 = new TypePrinter<>(5);
        TypePrinter<String> t2 = new TypePrinter<>("java");
        TypePrinter<Double> t3 = new TypePrinter<>(3.14);

        t1.printInfo();  // Integer: 6
        t2.printInfo();  // String: JAVA
        t3.printInfo();  // Unknown type

    }
}