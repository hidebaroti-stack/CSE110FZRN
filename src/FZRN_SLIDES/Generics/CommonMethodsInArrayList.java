package FZRN_SLIDES.Generics;

import java.util.ArrayList;

public class CommonMethodsInArrayList {
    boolean add(Object o) {
        // ❌ Problem: This creates a NEW local ArrayList every time.
        // So whatever you pass from main (like "null") is ignored.
        // The method just adds "Apple" and 100, then prints that temporary list.
        ArrayList list = new ArrayList();
        list.add("Apple");
        list.add(100);
        System.out.println(list);
        return true;
    }

    void add(int index, Object o) {
        // ❌ Same issue: new ArrayList created here.
        // The passed argument 'o' is not used, so main's value is lost.
        ArrayList list = new ArrayList();
        list.add("Apple");
        list.add("Banana");
        list.add(1, "Mango"); // hardcoded insert
        System.out.println(list);
    }

    Object remove(int index) {
        // ❌ Again, new ArrayList created inside.
        // Removing works only on this temporary list, not on any shared list.
        ArrayList list = new ArrayList();
        list.add("Apple");
        list.add("Banana");
        Object removed = list.remove(0);
        System.out.println("Removed: " + removed);
        System.out.println(list);
        return removed;
    }

    boolean remove(Object o) {
        // ❌ Same: new ArrayList created, so only "Apple" and "Banana" exist here.
        // The argument 'o' is ignored; instead "Banana" is hardcoded for removal.
        ArrayList list = new ArrayList();
        list.add("Apple");
        list.add("Banana");
        boolean result = list.remove("Banana");
        System.out.println(result); // true
        System.out.println(list);
        return result;
    }

    int size() {
        // ❌ New ArrayList created again.
        // So size() always returns 2, regardless of what you added in main.
        ArrayList list = new ArrayList();
        list.add("Apple");
        list.add("Banana");
        System.out.println(list.size());
        return list.size();
    }

    public static void main(String[] args) {
        CommonMethodsInArrayList demo = new CommonMethodsInArrayList();

        System.out.println("=== add(Object) ===");
        demo.add("null"); // ⚠️ Argument ignored because method makes its own list

        System.out.println("\n=== add(index, Object) ===");
        demo.add(1, "Mango"); // ⚠️ Argument ignored, hardcoded "Mango" used

        System.out.println("\n=== remove(index) ===");
        demo.remove(0); // ⚠️ Works only on temporary list inside method

        System.out.println("\n=== remove(Object) ===");
        demo.remove("Banana"); // ⚠️ Argument ignored, hardcoded "Banana" removed

        System.out.println("\n=== size() ===");
        demo.size(); // ⚠️ Always prints 2 because method recreates list
    }
}
