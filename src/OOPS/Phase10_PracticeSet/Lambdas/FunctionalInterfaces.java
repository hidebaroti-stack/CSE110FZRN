package OOPS.Phase10_PracticeSet.Lambdas;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterfaces {
    public static void main(String[] args) {
        // Runnable - takes nothing, returns nothing
        Runnable r = () -> System.out.println("Running!");
        r.run();

        // Comparator<T> - takes two T, returns int
        Comparator<String> comp = (a, b) -> a.compareTo(b);

        // Predicate<T> - takes T, returns boolean (tests a condition)
        Predicate<Integer> isEven = n -> n % 2 == 0;
        System.out.println(isEven.test(4)); // true
        System.out.println(isEven.test(7)); // false

        // Function<T, R> - takes T, returns R (transforms a value)
        Function<String, Integer> strLen = s -> s.length();
        System.out.println(strLen.apply("Debaroti")); // 8

        // Consumer<T> - takes T, returns nothing (does something with it)
        Consumer<String> printer = s -> System.out.println(">>" + s);
        printer.accept("Hello"); // >> Hello

        // Supplier<T> - takes nothing, returns T (produces a value)
        Supplier<String> greeting = () -> "Hello, World!";
        System.out.println(greeting.get()); // Hello, World!
    }
}