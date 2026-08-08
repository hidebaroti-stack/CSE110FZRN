package FZRN_SLIDES.Generics;

class Demo {
    <T> Demo(T value) { // Constructor is generic
        System.out.println("Value: " + value);
    }
}
public class NonGenericClassGenericConstructor {
    public static void main(String[] args) {
        Demo d1 = new Demo("Hello");
        Demo d2 = new Demo(123);
        Demo d3 = new Demo(3.14);
    }
}
