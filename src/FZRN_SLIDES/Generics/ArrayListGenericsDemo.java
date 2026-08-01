package FZRN_SLIDES.Generics;

import java.util.ArrayList;

public class ArrayListGenericsDemo {
    public static void main(String[] args) {
        // Creating ArrayList with generics (only Strings allowed)
        ArrayList<String> list = new ArrayList<>();

        // boolean add(E e) → adds elements at the end
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        System.out.println("After add: " + list);

        // void add(int index, E e) → inserts at a specific index
        list.add(1, "Orange");
        System.out.println("After add at index: " + list);

        // E get(int index) → retrieves element at index
        String item = list.get(2); // no casting needed
        System.out.println("Element at index 2: " + item);

        // E set(int index, E e) → replaces element at index
        String oldValue = list.set(0, "Mango");
        System.out.println("Old value replaced: " + oldValue);
        System.out.println("After set: " + list);

        // E remove(int index) → removes element at index
        String removedByIndex = list.remove(1);
        System.out.println("Removed by index: " + removedByIndex);
        System.out.println("After remove(index): " + list);

        // boolean remove(Object o) → removes first occurrence of object
        boolean removeObject = list.remove("Cherry");
        System.out.println("Removed 'Cherry'? " + removeObject);
        System.out.println("After remove(Object): " + list);

        // int size() → returns number of elements
        int s = list.size();
        System.out.println("Size of list: " + s);
    }
}