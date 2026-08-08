package FZRN_SLIDES.Generics;

import java.util.ArrayList;

class MyList {
    ArrayList<String> list = new ArrayList<>();

    void add(String element) {
        list.add(element);
    }

    String get(int idx) {
        return list.get(idx);
    }

    void remove(int idx) {
        list.remove(idx);
    }

}
public class MyListMain {
    public static void main(String[] args) {
        MyList list = new MyList();

        list.add("element 1");
        list.add("element 2");

        System.out.println("First element: " + list.get(0));
        System.out.println("Second element: " + list.get(1));

        list.remove(0);
        System.out.println("After deleting the first element: " + list.get(0));
    }
}
