package FZRN_SLIDES.Generics.Exercise;

import java.util.ArrayList;
import java.util.List;

public class RawTypeTest {
    public static void main(String[] args) {
        List rawList = new ArrayList();
        rawList.add("Hello");
        rawList.add(10);

        for (Object obj : rawList) {
            String s = (String) obj;
            System.out.println(s.length());
        }
    }
}