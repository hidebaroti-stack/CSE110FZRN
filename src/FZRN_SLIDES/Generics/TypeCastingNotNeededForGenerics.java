package FZRN_SLIDES.Generics;

import java.util.ArrayList;

public class TypeCastingNotNeededForGenerics {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList();

        list.add(35);
        list.add(45);

        int i = list.get(1);
        int sum = list.get(0) + list.get(1);

        System.out.println(i);
        System.out.println(sum);
        System.out.println(list);
    }
}