package FZRN_SLIDES.Generics;

class Sample<G, T> {
    G obj1;
    T obj2;

    Sample(G a, T b) {
        obj1 = a;
        obj2 = b;
    }
    void display() {
        System.out.println(obj1 + " " + obj2);
    }
}

public class GenericTwoTypes {
    public static void main(String[] args) {
        Sample<Integer, String> s = new Sample<>(15, "Kongu");
        s.display();

        Sample<String, Integer> i = new Sample<>("Kongu eng", 20);
        i.display();
    }
}