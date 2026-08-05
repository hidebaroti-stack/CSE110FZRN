package FZRN_SLIDES.Generics;

public class GenericsForPrimitive {
    public static <T> void printArray(T[] elements) {
        for (T element : elements) {
            System.out.println(element);
        }
    }
    // Overloaded methods for primitive arrays
    public static void printArray(int[] elements) {
        for (int element : elements) {
            System.out.println(element);
        }
    }

    public static void printArray(char[] elements) {
        for (char element : elements) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        Integer[] intArray = {10, 20, 30, 40, 50};
        Character[] charArray = {'J','A','V','A'};

        int[] primitiveIntArray = {1, 2, 3, 4, 5};
        char[] primitiveCharArray = {'H','E','L','L','O'};

        System.out.println("Printing Integer Array");
        printArray(intArray);

        System.out.println("Printing Character Array");
        printArray(charArray);

        System.out.println("Printing primitive int[]");
        printArray(primitiveIntArray);

        System.out.println("Printing primitive char[]");
        printArray(primitiveCharArray);
    }
}