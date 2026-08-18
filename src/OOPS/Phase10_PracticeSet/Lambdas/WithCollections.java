package OOPS.Phase10_PracticeSet.Lambdas;

import java.util.ArrayList;
import java.util.Collections;

public class WithCollections {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Debaroti");
        names.add("Alice");
        names.add("Bob");
        names.add("Zara");

        // Sort with lambda Comparator (replaces anonymous class from Phase 5)
        Collections.sort(names, (a, b) -> a.compareTo(b));

        // forEach with lambda Consumer
        names.forEach(name -> System.out.println("Student: " + name));

        // removeIf with lambda Predicate
        names.removeIf(name -> name.startsWith("A")); // removes "Alice"
        System.out.println(names); // [Debaroti, Bob, Zara]
    }
}