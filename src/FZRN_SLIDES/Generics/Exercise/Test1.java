package FZRN_SLIDES.Generics.Exercise;

import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("Hello");
        list.add(123);
        // String str = list.get(0); // ERROR needs type casting
        String str = (String)list.get(0);
        System.out.println(str);
    }
}
