package FZRN_SLIDES.Generics;

import java.util.ArrayList;

class MyListCheck {
    ArrayList<String> list = new ArrayList<>();

    void add(String element) {
        list.add(element);
    }
    void remove(int idx) {
        list.remove(idx);
    }
}

public class ErrorInGenerics {
    public static void main(String[] args) {
        MyListCheck list1 = new MyListCheck();
        list1.add("element 1");
        list1.add("element 2");
        System.out.println(list1.list); // [element 1, element 2]

        MyListCheck list2 = new MyListCheck();
        list2.add("1");
        list2.add("2");
        System.out.println(list2); // FZRN_SLIDES.Generics.MyListCheck@1b6d3586

    }
}
