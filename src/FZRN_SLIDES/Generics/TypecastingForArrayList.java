package FZRN_SLIDES.Generics;

import java.util.ArrayList;

public class TypecastingForArrayList {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        list.add("Alice");
        list.add(45);

        String s = (String)list.get(0);
        System.out.println(s);

        int i = (int)list.get(1);
        System.out.println(i);
    }
}