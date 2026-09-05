package DAKP.InnerClassAndLambdaExpression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Task:
 * Given an ArrayList<Integer>, perform:
 * Print all elements.
 * Sum of squares.
 * Filter odd/even.
 * Sum of squares of odd/even separately.
 */

public class BOF8_LambdaArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));

        // i. Print all element
        list.forEach(n -> System.out.println(n + " "));
        System.out.println();

        // ii. Sum of squares
        int sumSquares = list.stream().map(n -> n * n).reduce(0, Integer::sum);
        System.out.println("Sum of squares: " + sumSquares);

        // iii. Filter odd and even
        System.out.println("\nEven numbers: " + list.stream().filter(n -> n % 2 == 0).collect(Collectors.toList()));
        System.out.println("Odd numbers: " + list.stream().filter(n -> n % 2 != 0).collect(Collectors.toList()));

        // iv. Sum of squares of even and odd
        int evenSquares = list.stream().filter(n -> n % 2 == 0).map(n -> n * n).reduce(0, Integer::sum);
        int oddSquares = list.stream().filter(n -> n % 2 != 0).map(n -> n * n).reduce(0, Integer::sum);

        System.out.println("\nSum of squares (Even): " + evenSquares);
        System.out.println("Sum of squares (Odd): " + oddSquares);
    }
}
