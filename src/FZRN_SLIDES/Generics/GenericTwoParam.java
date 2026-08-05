package FZRN_SLIDES.Generics;

public class GenericTwoParam {

    <E, T> void display(E a, T b) {
        System.out.println(a);
        System.out.println(b);
    }

    public static void main(String[] args) {
        GenericTwoParam g = new GenericTwoParam();
        g.display(4, 6.5);
        g.display(4.5, 5);
    }
}