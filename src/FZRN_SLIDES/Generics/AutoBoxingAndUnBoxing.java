package FZRN_SLIDES.Generics;

public class AutoBoxingAndUnBoxing {
    public static void main(String[] args) {
        int a = 10;    // primitive
        Integer b = a; // auto-boxing (int -> Integer)
        int c = b;     // auto-unboxing (Integer -> int)
        System.out.println("Primitive: " + a);
        System.out.println("Wrapper: " + b);
        System.out.println("Again primitive: " + c);

        int x = 10;
        int y = x;
        int z = y;

        System.out.println("For primitive type.");
        System.out.println(x + " " + y + " " + z);

        Integer p = 10;
        Integer q = p;
        Integer r = q;

        System.out.println("For wrapper class.");
        System.out.println(p + " " + q + " " + r);
    }
}