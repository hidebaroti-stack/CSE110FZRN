package FZRN_SLIDES.Generics;

class DemoClass2 <T> {
    DemoClass2 (T value) {
        System.out.println("Value: " + value);
    }
}
public class GenericClassNonGenericConstructor {
    public static void main(String[] args) {
        DemoClass2<String> d1 = new DemoClass2<>("Hello");
        DemoClass2<Integer> d2 = new DemoClass2<>(123);
        DemoClass2<Double> d3 = new DemoClass2<>(3.14);
    }
}