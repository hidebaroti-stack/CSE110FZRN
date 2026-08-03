package FZRN_SLIDES.Generics.Exercise;

public class Test3 {
    public static <T> void print(T data) {
        System.out.println("Data: " + data);
    }
    public static void main(String[] args) {
        print("Hello");
    }
}