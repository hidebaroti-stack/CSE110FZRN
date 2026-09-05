package DAKP.Generics;

/**
 * Create a generic method printArray(T[] array).
 * Loop through elements and print them.
 * Test with Integer[] and String[].
 */

public class BOf7_GMethodForPrintingArrays {
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] intArray = {1,2,3,4,5};
        String[] strArray = {"Java", "Generics", "Lab"};

        System.out.println("Integer Array: ");
        printArray(intArray);

        System.out.println("String Array: ");
        printArray(strArray);
    }
}