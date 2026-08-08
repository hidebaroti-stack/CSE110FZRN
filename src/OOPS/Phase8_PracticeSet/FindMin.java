package OOPS.Phase8_PracticeSet;

public class FindMin {
    public static <T extends Comparable <T>> T findMin(T[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array is empty or null");
        }
        T min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].compareTo(min) < 0) min = arr[i];
        }
        return min;
    }

    public static void main(String[] args) {
        Integer[] integers =  {10, 25, 5, 30};
        Double[] doubles = {3.79, 3.92, 4.00};
        String[] strings = {"Apple", "Mango", "Banana"};

        System.out.println("Min Integer: " + findMin(integers));
        System.out.println("Min Double: " + findMin(doubles));
        System.out.println("Min String: " + findMin(strings));

    }
}