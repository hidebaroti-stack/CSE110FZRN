package LAB7;

public class MultipleInnerTryCatch {
    public static void main(String[] args) {

        try {
            System.out.println("Outer try block starts.");

            try {
                int[] arr = new int[3];
                System.out.println(arr[5]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Inner catch: Array index out of bounds.");
            }

            try {
                String s = null;
                System.out.println(s.toUpperCase());
            } catch (NullPointerException e) {
                System.out.println("Inner catch: Null pointer exception.");
            }

        } catch (Exception e) {
            System.out.println("Outer catch: Some other exception caught.");
        }
        System.out.println("Program completed.");
    }
}