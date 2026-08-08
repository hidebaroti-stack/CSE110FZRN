package OOPS.Phase8_PracticeSet;

import java.util.ArrayList;

public class Stack <T> {
    private ArrayList<T> items;

    Stack() {
       items = new ArrayList<>();
    }

    // Push - add to top
    public void push(T item) {
        items.add(item);
    }

    // Pop - remove and return top
    public T pop() {
        if (items.isEmpty()) {
            System.out.println("Stack is empty.");
            return null;

        }
        return items.remove(items.size() - 1);
    }

    // Peek - return top without removing
    public T peek() {
        if (items.isEmpty()) {
            System.out.println("Stack is empty.");
            return null;
        }
        return items.get(items.size() - 1);
    }

    // isEmpty
    public boolean isEmpty() {
        return items.isEmpty();
    }

    // size
    public int size() {
        return items.size();
    }
}

class StackTest {
    public static void main(String[] args) {
        Stack<String> stringStack = new Stack<>();
        stringStack.push("Hello");
        stringStack.push("World");
        System.out.println("Peek: " + stringStack.peek()); // World
        System.out.println("Pop: " + stringStack.pop());   // World
        System.out.println("Size: " + stringStack.size()); // 1

        Stack<Integer> intStack = new Stack<>();
        intStack.push(10);
        intStack.push(20);
        System.out.println("Peek: " + intStack.peek());    // 20
        System.out.println("Pop: " + intStack.pop());      // 20
        System.out.println("Size: " + intStack.size());    // 1
    }
}