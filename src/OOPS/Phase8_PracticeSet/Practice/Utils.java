package OOPS.Phase8_PracticeSet.Practice;

public class Utils {
    // Generic method to print arrays
    public static <T> void printArray(T[] arr) {
        for (T element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
    // Generic method to find max of two comparable values
    public static <T extends Comparable <T>> T findMax(T a, T b) {
        return a.compareTo(b) >= 0 ? a : b;
    }

    public static void main(String[] args) {
        Integer[] ints = {1, 2, 3, 4, 5};
        String[] strs = {"Banana" , "Mango", "Apple"};

        Utils.printArray(ints);
        Utils.printArray(strs);

        System.out.println(Utils.findMax(10, 25));
        System.out.println(Utils.findMax("Apple", "Mango"));
    }
}