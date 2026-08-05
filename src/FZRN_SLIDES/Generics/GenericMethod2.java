package FZRN_SLIDES.Generics;

class DemoClass {
    public <T> void genericsMethod(T data) {
        System.out.println("This is a generic method.");
        System.out.println("The data passed to method is " + data);
    }
}
public class GenericMethod2 {
    public static void main(String[] args) {
        DemoClass demo = new DemoClass();
        demo.<String>genericsMethod("Java Programming.");
    }
}
