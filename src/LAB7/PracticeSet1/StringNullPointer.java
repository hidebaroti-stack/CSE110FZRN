package LAB7.PracticeSet1;

public class StringNullPointer {
    /**
     * Problem 3 — The sneaky null
     * Create a String variable but don't assign it anything (leave it null). Try calling .length() on it. Handle NullPointerException.
     *
     * Trick: most beginners forget null can cause exceptions
     */
    public static void main(String[] args) {
        String str = null;

        try {
            System.out.println("String length: " + str.length());
        } catch (NullPointerException e) {
            System.out.println("Null Pointer Exception. " + e.getMessage());
        }
    }
}