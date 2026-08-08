package FZRN_SLIDES.Generics;

import java.util.ArrayList;

class MyListGenerics<T> {
    ArrayList<T> list = new ArrayList<>();

    void add(T element) {
        list.add(element);
    }
    T get (int idx) {
        return list.get(idx);
    }
    void remove(int idx) {
        list.remove(idx);
    }
}

public class MyListGenericsMain {
    public static void main(String[] args) {
        MyListGenerics<String> list1 = new MyListGenerics<>();
        list1.add("element1");
        list1.add("element2");

        MyListGenerics<Integer> list2 = new MyListGenerics<>();
        list2.add(1);
        list2.add(2);

        System.out.println(list1.list);
        System.out.println(list2.list);
    }
}
