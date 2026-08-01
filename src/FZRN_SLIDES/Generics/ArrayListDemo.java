package FZRN_SLIDES.Generics;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        // Creating raw ArrayList (no generics)
        ArrayList list = new ArrayList();

        // boolean add(Object o) → adds elements at the end
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        System.out.println("After add: " + list);

        // void add(int index, Object o) → inserts at a specific index
        list.add(1, "Orange");
        System.out.println("After add at index: " + list);

        // Object get(int index) → retrieves element at index
        Object item = list.get(2);
        System.out.println("Element at index 2: " + item);

        // Object set(int index, Object o) → replaces element at index
        Object oldValue = list.set(0, "Mango");
        System.out.println("Old value replaced: " + oldValue);
        System.out.println("After set: " + list);

        // Object remove(int index) → removes element at index
        Object removedByIndex = list.remove(1);
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