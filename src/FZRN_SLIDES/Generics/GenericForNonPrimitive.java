package FZRN_SLIDES.Generics;

public class GenericForNonPrimitive {
    public static <T> void printArray(T[] elements) {
        for (T element : elements) {
            System.out.println(element);
        }
    }
    public static void main(String[] args) {
        Integer[] intArray = {10, 20, 30, 40, 50};
        Character[] charArray = {'J','A', 'V', 'A'};

        System.out.println("Printing Integer Array");
        printArray(intArray);

        System.out.println("Printing Character Array");
        printArray(charArray);
    }
}
